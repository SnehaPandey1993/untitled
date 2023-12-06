package com.solution.Behaviour.Observer.Observer;

import com.solution.Behaviour.Observer.Observable.StockObservable;

public class EmailAlertObserve implements NotificationAlertObserver{

    String email;
    StockObservable stockObservable;

    public EmailAlertObserve(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
       sendMail(email,"say hi");
    }
    private void sendMail(String email,String msg){
        System.out.println("email sent to:::"+email);
    }
}
