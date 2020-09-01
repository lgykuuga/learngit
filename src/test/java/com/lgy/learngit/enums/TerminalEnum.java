package com.lgy.learngit.enums;

/**
 * 终端枚举
 * @author zhijun.tan
 */
public enum TerminalEnum {

    /**
     * PC端
     */
    PC,

    /**
     * 微信公众号
     */
    WX,

    /**
     * 苹果
     */
    IOS,

    /**
     * 安卓
     */
    ANDROID,

    /**
     * 开思IM
     */
    CASSIM;

    public static boolean isAPP(TerminalEnum from) {
        return IOS == from || ANDROID == from;
    }

    public static boolean isPC(TerminalEnum from) {
        return PC == from;
    }

    private static final TerminalEnum[] ALL = values();

    public static boolean contains(String name) {
        for (TerminalEnum e : ALL) {
            if (e.name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static TerminalEnum of(String name) {
        return name == null ? null : valueOf(name);
    }


    public static void main(String[] args) {
        System.out.println(TerminalEnum.of("CASS"));
        ;
    }

}
