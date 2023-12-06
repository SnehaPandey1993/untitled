package com.solution.Behaviour.Observer.Observer;

import com.solution.Behaviour.Observer.Observable.StockObservable;

public class PhoneObserve implements NotificationAlertObserver{

    String username;
    StockObservable stockObservable;
    @Override
    public void update() {
      sendmsgonmobile(username,"usner ");
    }

    public PhoneObserve(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }

    private void  sendmsgonmobile(String username,String msg) {
        System.out.println("send msg:::"+username);
    }
}
