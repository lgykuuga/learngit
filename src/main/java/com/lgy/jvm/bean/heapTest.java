package com.lgy.jvm.bean;

public class heapTest {

    private String key;
    private String value;

    public heapTest(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "heapTest{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
