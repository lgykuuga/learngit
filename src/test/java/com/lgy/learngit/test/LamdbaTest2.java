package com.lgy.learngit.test;

import com.lgy.learngit.test.bean.InquiryQuoteUserNameVO;
import com.lgy.learngit.test.bean.StoreQuoteUserDTO;
import com.lgy.learngit.test.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description LamdbaTest
 * @Author LGy
 * @Date 2020/4/18 16:20
 **/
public class LamdbaTest2 {

    private static final Logger log = LoggerFactory.getLogger(LamdbaTest2.class);

    public static void main(String[] args) {
        List<String> requests = new ArrayList<>();
        requests.add("12345");
        requests.add("56789");

        List<InquiryQuoteUserNameVO> inquiryQuoteUserNameVOS = queryQuoteUserName(requests);
        System.out.println(inquiryQuoteUserNameVOS);

    }


    public static List<InquiryQuoteUserNameVO> queryQuoteUserName(List<String> requests) {
        if (CollectionUtils.isEmpty(requests)) {
            return Collections.emptyList();
        }

        try {
            List<String> shoppingListIds = requests.stream().distinct().collect(Collectors.toList());
            //获取报价员ID
            List<StoreQuoteUserDTO> quoteUserList = getQuoteUser("123", shoppingListIds);

            Map<String, String> quoteUserMap = quoteUserList.stream()
                    .collect(Collectors.toMap(StoreQuoteUserDTO::getInquiryId, StoreQuoteUserDTO::getQuoteUserId, (oldValue, newValue) -> newValue));

            List<InquiryQuoteUserNameVO> inquiryQuoteUserNameCollect = new ArrayList<>(shoppingListIds.size());

            shoppingListIds.forEach(shoppingListId -> {
                InquiryQuoteUserNameVO inquiryQuoteUserNameVO = new InquiryQuoteUserNameVO();
                inquiryQuoteUserNameVO.setShoppingListId(shoppingListId);
                inquiryQuoteUserNameVO.setQuoteUserId(!StringUtils.isEmpty(quoteUserMap.get(shoppingListId)) ? quoteUserMap.get(shoppingListId) : "SYSTEM");
                inquiryQuoteUserNameCollect.add(inquiryQuoteUserNameVO);
            });

            //获取报价员名称
            List<User> users = getUsers(quoteUserList);

            Map<String, String> userMap = users.stream().collect(Collectors.toMap(User::getUserLoginId, User::getUserName, (oldValue, newValue) -> newValue));

            inquiryQuoteUserNameCollect.forEach(inquiryQuoteUserName -> {
                inquiryQuoteUserName.setQuoteUserName(!StringUtils.isEmpty(userMap.get(inquiryQuoteUserName.getQuoteUserId()))
                        ? userMap.get(inquiryQuoteUserName.getQuoteUserId()) : "系统");
            });

            return inquiryQuoteUserNameCollect;

        } catch (Exception e) {
            log.warn("查询获取报价人名称失败:request:{}", requests, e);
        }
        return Collections.emptyList();
    }

    private static List<User> getUsers(List<StoreQuoteUserDTO> quoteUserList) {

        if (CollectionUtils.isEmpty(quoteUserList)) {
            return Collections.emptyList();
        }

        try {
            log.info("批量查询用户信息{}", quoteUserList.toString());
            List<String> userIdList = quoteUserList.stream().map(StoreQuoteUserDTO::getQuoteUserId).distinct().collect(Collectors.toList());

            List<User> users = new ArrayList<>(userIdList.size());

            quoteUserList.forEach(quoteUser -> {
                User user = new User();
                user.setUserLoginId(quoteUser.getQuoteUserId());
                user.setUserName("哈哈");
                users.add(user);
            });

            return users;

        } catch (Exception e) {
            log.error("批量查询用户信息", e);
        }
        return Collections.emptyList();
    }

    private static List<StoreQuoteUserDTO> getQuoteUser(String companyId, List<String> inquiryIds) {

        if (StringUtils.isEmpty(companyId)) {
            return Collections.emptyList();
        }

        try {
            //返回数量与传入数量不等
            log.info("查询报价员信息参数：companyId：{}，inquiryIds：{}", companyId, inquiryIds.toString());

            List<StoreQuoteUserDTO> storeQuoteUserDTOList = new ArrayList<>(inquiryIds.size());

            inquiryIds.forEach(inquiryId -> {
                StoreQuoteUserDTO storeQuoteUser = new StoreQuoteUserDTO();
                storeQuoteUser.setInquiryId(inquiryId);
                storeQuoteUser.setQuoteUserId("aaabbb");
                storeQuoteUserDTOList.add(storeQuoteUser);
            });

            return storeQuoteUserDTOList;

        } catch (Exception e) {
            log.error("查询报价员信息失败！", e);
        }
        return Collections.emptyList();
    }


}
