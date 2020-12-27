/* 以下代码有什么坏味道？ */

package com.lgy.refactor.day02.badsmell.practiceOne;

public class User {

    /**
     * 地址
     */
    String address;
    /**
     * 性别
     */
    String sex;

    /**
     * 车牌号
     */
    String[] carNumbers;

    public User(String sex, String[] carNumbers) {
        this.sex = sex;
        this.carNumbers = carNumbers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String showCarNumbers() {
        StringBuilder result = new StringBuilder();
        for (String carNumber : carNumbers) {
            result.append("car number: ").append(carNumber).append("\n");
        }
        return result.toString();
    }

    public String introduce() {
        return "address: " + address + ". sex: " + sex;
    }
}
