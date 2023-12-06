package com.solution.Behaviour.State;

public class Inventory {
    ItemShelf[] inv;

    public Inventory(int item) {
        this.inv = new ItemShelf[item];
        initialEmptyInventory();
    }

    public ItemShelf[] getItem() {
        return inv;
    }

    public void setItem(ItemShelf[] item) {
        this.inv = item;
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < inv.length; i++) {
            ItemShelf shelf = new ItemShelf();
            shelf.setCode(startCode);
            shelf.setSoldout(true);
            inv[i] = shelf;
            startCode++;
        }
    }

    public void add(Item item, int code) {
        for (ItemShelf itemShelf : inv) {
            if (itemShelf.getCode() == code) {
                if (itemShelf.getSoldout()) {
                    itemShelf.item = item;
                    itemShelf.setSoldout(false);
                } else {
                    System.out.println("items is already present:unable to add");
                }
            }
        }
    }

    public Item get(int code) {
        for (ItemShelf itemShelf : inv) {
            if (itemShelf.getCode() == code) {
                if (itemShelf.getSoldout()) {
                    System.out.println("item is already sold");
                } else {
                    return itemShelf.item;
                }
            }
        }
        return null;
    }

    public void updateSoldeoutItem(int code) {
        for (ItemShelf itemShelf : inv) {
            if (itemShelf.getCode() == code) {
                itemShelf.setSoldout(true);
            }
        }

    }


}
