package com.d4rkr0n1n;

import com.d4rkr0n1n.datetime.Main;
import com.d4rkr0n1n.model.AppModel;

import lombok.extern.java.Log;

@Log
public class App {
    public static void main(String[] args) {
        AppModel model = new AppModel();
        model.setKeyString("value");
        log.info("Hello World!");
        log.info(model.getKeyString());
        log.info(new Main().getDate().toString());
    }
}
