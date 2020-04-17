package com.lgy.learngit.test;

import com.lgy.learngit.domain.DomainEnumTest;
import com.lgy.learngit.enums.TerminalEnum;

/**
 * @Description 枚举测试
 * @Author LGy
 * @Date 2020/4/17 16:29
 **/
public class EnumTest {

    public static void main(String[] args) {
        DomainEnumTest domainEnumTest = new DomainEnumTest();
        domainEnumTest.setOrderId("111");
        domainEnumTest.setTerminal(TerminalEnum.ANDROID);


        System.out.println("不带name()返回:" + TerminalEnum.ANDROID.equals(domainEnumTest.getTerminal()));
        System.out.println("带name()返回:" + TerminalEnum.ANDROID.name().equals(domainEnumTest.getTerminal()));
        System.out.println("带name()返回:" + TerminalEnum.ANDROID.name().equals(domainEnumTest.getTerminal().name()));


    }


}
