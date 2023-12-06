package com.solution.Behaviour.State.Vending.Impl;

import com.solution.Behaviour.State.Coin;
import com.solution.Behaviour.State.Item;
import com.solution.Behaviour.State.Vending.StatesOfVendingMachine;
import com.solution.Behaviour.State.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements StatesOfVendingMachine {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setStatesOfVendingMachine(new HasMoneyState());
    }

    public IdleState() {
        System.out.println("your Machine is currently under idle state");
    }
    public IdleState(VendingMachine vendingMachine) {
        System.out.println("your Machine is currently under idle state");
        vendingMachine.setCoinList(new ArrayList<>());
    }
    @Override
    public void clickOnStartProductButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Please insert amount before clicking product button");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
     throw new Exception("you can not insert coin in ideal state");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int chargecode) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int changeamount) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int chargecode) {

        return null;
    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int chargecode) {
        vendingMachine.getInventory().add(item,chargecode);


    }
}
