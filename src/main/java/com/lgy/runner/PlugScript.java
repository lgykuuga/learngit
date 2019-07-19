package com.lgy.runner;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * 按键脚本,可用于游戏,非钩子程序
 */
public class PlugScript {

    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();

        Random random = new Random();
        //延迟5秒启动
        robot.delay(5000);

        while (true){

            //键盘操作
            keyborad(robot, random);
            //鼠标操作
            mouse(robot, random);

            //按下鼠标弹起间隔加入随机数,模拟人工操作,防止脚本被检测到，随机时间为5s~10s
            double v = (5 + random.nextDouble() * (10 - 5)) * 1000;
            System.out.println("休眠若干秒进入下次循环:" + v);
            //休眠
            robot.delay((int)v);
        }

    }

    /**
     * 鼠标操作
     */
    private static void mouse(Robot robot, Random random) {
        //鼠标按下左键
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        //按下鼠标弹起间隔加入随机数,模拟人工操作,防止脚本被检测到，随机时间为0.2s~0.4s
        double v = (0.2 + random.nextDouble() * (0.4 - 0.2)) * 1000;
        System.out.println("按下到释放键盘A键延迟秒数:" + v);

        robot.delay((int)v);
        //鼠标释放左键
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    /**
     * 键盘操作
     */
    private static void keyborad(Robot robot, Random random) {
        //按下键盘A键
        robot.keyPress(KeyEvent.VK_A);
        //按下键盘弹起间隔加入随机数,模拟人工操作,防止脚本被检测到，随机时间为0.2s~0.4s
        double v = (0.2 + random.nextDouble() * (0.4 - 0.2)) * 1000;
        System.out.println("按下到释放键盘A键延迟秒数:" + v);
        robot.delay((int)v);
        //键盘A键弹起
        robot.keyRelease(KeyEvent.VK_A);

        //将鼠标移动到屏幕像素点
        robot.mouseMove(1800, 900);

        //获取像素点的颜色
        Color pixelColor = robot.getPixelColor(1800, 900);
        System.out.println("Red：" + pixelColor.getRed());
        System.out.println("Green：" + pixelColor.getGreen());
        System.out.println("Blue：" + pixelColor.getBlue());

        //TODO 如果红血了就嗑药...

    }

}
