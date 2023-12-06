package com.solution.Behaviour.Observer.Observable;

import com.solution.Behaviour.Observer.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class StockImplObservation implements StockObservable{
    List<NotificationAlertObserver> stocklist= new ArrayList<>();
    int stock=0;

    public void add(NotificationAlertObserver notificationAlertObserver) {
       stocklist.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
     stocklist.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribe() {
      for(NotificationAlertObserver observe:stocklist){
          observe.update();
      }
    }

    @Override
    public void setStockCount(int stockCount) {
     if(stock ==0){
         notifySubscribe();
     }
     stock=stock+stockCount;
    }


    @Override
    public int getStockcount() {
        return stock;
    }
}
