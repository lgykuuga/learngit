package com.lgy.designpatterns.observer.test1.subject;


import com.lgy.designpatterns.observer.test1.observer.Observer;

/**
 * 主题（发布者、被观察者）
 *
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
