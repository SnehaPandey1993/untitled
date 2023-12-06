package com.solution.Behaviour.State.Vending.Impl;

import com.solution.Behaviour.State.Coin;
import com.solution.Behaviour.State.Item;
import com.solution.Behaviour.State.Vending.StatesOfVendingMachine;
import com.solution.Behaviour.State.VendingMachine;

import java.util.List;

public class HasMoneyState implements StatesOfVendingMachine {
    public HasMoneyState() {
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
     return;
    }

    @Override
    public void clickOnStartProductButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setStatesOfVendingMachine(new SelectionState());


    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int chargecode) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int changeamount) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int chargecode) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine) {

        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setStatesOfVendingMachine(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();

    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int chargecode) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");


    }
}
