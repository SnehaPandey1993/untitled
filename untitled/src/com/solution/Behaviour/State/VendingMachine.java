package com.solution.Behaviour.State;

import com.solution.Behaviour.State.Vending.Impl.IdleState;
import com.solution.Behaviour.State.Vending.StatesOfVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    StatesOfVendingMachine statesOfVendingMachine;
    Inventory inventory;
    List<Coin> coinList;

    public VendingMachine() {
        this.statesOfVendingMachine = new IdleState();
        this.inventory = new Inventory(10);
        this.coinList = new ArrayList<>();
    }

    public StatesOfVendingMachine getStatesOfVendingMachine() {
        return statesOfVendingMachine;
    }

    public void setStatesOfVendingMachine(StatesOfVendingMachine statesOfVendingMachine) {
        this.statesOfVendingMachine = statesOfVendingMachine;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
