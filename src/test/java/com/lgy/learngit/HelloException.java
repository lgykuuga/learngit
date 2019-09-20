package com.lgy.learngit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.lgy.learngit.helper.CalculateConstants.*;

/**
 * @Description TODO
 * @Author LGy
 * @Date 2019/9/20 10:09
 **/
public class HelloException {

    private static final Logger logger = LoggerFactory.getLogger(HelloException.class);

    public static void main(String[] args) {

        boolean b = matchRule("1", "le", "2");
        System.out.println(b);
    }


    private static boolean matchRule(String orderValue, String condition, String value) {
        switch (condition) {
            case EQ :
                //等于
                return orderValue.equals(value);
            case NE:
                //不等于
                return !orderValue.equals(value);
            case GT:
                //大于
                try {
                    int orderValueInt = Integer.parseInt(orderValue);
                    int valueInt = Integer.parseInt(value);
                    return orderValueInt > valueInt;
                } catch (NumberFormatException e) {
                    logger.error("编码[{}][{}]转换错误", orderValue, value);
                    return false;
                }
            case LT:
                //小于
                try {
                    int orderValueInt = Integer.parseInt(orderValue);
                    int valueInt = Integer.parseInt(value);
                    return orderValueInt < valueInt;
                } catch (NumberFormatException e) {
                    logger.error("编码[{}][{}]转换错误", orderValue, value);
                    return false;
                }
            case GE:
                //大于等于
                try {
                    int orderValueInt = Integer.parseInt(orderValue);
                    int valueInt = Integer.parseInt(value);
                    return orderValueInt >= valueInt;
                } catch (NumberFormatException e) {
                    logger.error("编码[{}][{}]转换错误", orderValue, value);
                    return false;
                }
            case LE:
                //小于等于
                try {
                    int orderValueInt = Integer.parseInt(orderValue);
                    int valueInt = Integer.parseInt(value);
                    return orderValueInt <= valueInt;
                } catch (NumberFormatException e) {
                    logger.error("编码[{}][{}]转换错误", orderValue, value);
                    return false;
                }
            default:
                logger.error("编码[{}][{}]转换错误", orderValue, value);
                return false;
        }
    }
}
