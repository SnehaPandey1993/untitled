package com.solution.Behaviour.State.Vending.Impl;

import com.solution.Behaviour.State.Coin;
import com.solution.Behaviour.State.Item;
import com.solution.Behaviour.State.Vending.StatesOfVendingMachine;
import com.solution.Behaviour.State.VendingMachine;

import java.util.List;

public class DispenseState implements StatesOfVendingMachine {
    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Vending machine is in HasMoneyState");
        dispenseProduct(machine, codeNumber);


    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");


    }

    @Override
    public void clickOnStartProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");


    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");


    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int chargecode) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");


    }

    @Override
    public int getChange(int changeamount) throws Exception {
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int chargecode) throws Exception{
        System.out.println("Product has been dispensed");
       Item item= vendingMachine.getInventory().get(chargecode);
       vendingMachine.getInventory().updateSoldeoutItem(chargecode);
       vendingMachine.setStatesOfVendingMachine(new IdleState());
       return item;
    }

    @Override
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");

    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int chargecode) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");


    }
}
