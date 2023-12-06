package com.solution.Behaviour.State.Vending.Impl;

import com.solution.Behaviour.State.Coin;
import com.solution.Behaviour.State.Item;
import com.solution.Behaviour.State.Vending.StatesOfVendingMachine;
import com.solution.Behaviour.State.VendingMachine;

import java.util.List;

public class SelectionState implements StatesOfVendingMachine {
    public SelectionState() {
        System.out.println("Currently Vending machine is in SelectionState");


    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");


    }

    @Override
    public void clickOnStartProductButton(VendingMachine vendingMachine) throws Exception {
     return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");


    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int chargecode) throws Exception {
       //1.
        Item item = vendingMachine.getInventory().get(chargecode);
        //2. total amount paid by User
        int paidByUser = 0;
        for(Coin coin : vendingMachine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }
        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refund(vendingMachine);
            throw new Exception("insufficient amount");
        }else if(paidByUser >= item.getPrice()) {

            if (paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
            vendingMachine.setStatesOfVendingMachine(new DispenseState(vendingMachine, chargecode));
        }


    }

    @Override
    public int getChange(int changeamount) {
        System.out.println("Returned the change in the Coin Dispense Tray: " + changeamount);
        return changeamount;

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int chargecode) throws Exception {

        throw new Exception("product can not be dispensed Selection state");


    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine) {

        vendingMachine.setStatesOfVendingMachine(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();

    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int chargecode) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");


    }
}
