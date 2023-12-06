package com.solution.Behaviour.Observer.Observable;

import com.solution.Behaviour.Observer.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribe();
    public void setStockCount(int stockCount);
    public int getStockcount();
}
