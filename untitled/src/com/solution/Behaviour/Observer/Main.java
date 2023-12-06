package com.solution.Behaviour.Observer;

import com.solution.Behaviour.Observer.Observable.StockImplObservation;
import com.solution.Behaviour.Observer.Observer.EmailAlertObserve;
import com.solution.Behaviour.Observer.Observer.NotificationAlertObserver;
import com.solution.Behaviour.Observer.Observer.PhoneObserve;

public class Main {
    public static void main(String args[]){
        StockImplObservation stockImplObservation=new StockImplObservation();
        NotificationAlertObserver observer1=new EmailAlertObserve("sneha@gmail.com",stockImplObservation);
        NotificationAlertObserver observer2=new EmailAlertObserve("rahul@gmail.com",stockImplObservation);
        NotificationAlertObserver observer3=new PhoneObserve("sneha Latha",stockImplObservation);
         stockImplObservation.add(observer1);
        stockImplObservation.add(observer2);
        stockImplObservation.add(observer3);

        stockImplObservation.getStockcount();
        stockImplObservation.notifySubscribe();
        stockImplObservation.setStockCount(100);


    }
}
