package com.solution.Behaviour.State.Vending;

import com.solution.Behaviour.State.Coin;
import com.solution.Behaviour.State.Item;
import com.solution.Behaviour.State.VendingMachine;

import java.util.List;

public interface StatesOfVendingMachine {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void clickOnStartProductButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void selectProduct(VendingMachine vendingMachine,int chargecode) throws Exception;
    public int getChange(int changeamount) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int chargecode) throws Exception;
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception;
    public void updateInventory(VendingMachine vendingMachine, Item item,int chargecode) throws Exception;


}
