package com.example.gamebud_finalproject;

import java.util.ArrayList;

public class Registery {
    ArrayList<Account> acc;

    public Registery() {
        this.acc = new ArrayList<Account>();
        Account e = new Account("calunod", "calunod");
        acc.add(e);
    }

    public void addAcc(Account e) {

        acc.add(e);
    }


}
