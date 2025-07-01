package com.daniel.javacore.interfaces.domain;

//  Pode ter mais de uma impolementaçao
public class DataLogerImpl implements DataLoger, DataRemove {
    @Override
    public void logs() {
        System.out.println("Logs");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission");
    }

    @Override
    public void remove() {
        System.out.println("Remove");
    }
}
