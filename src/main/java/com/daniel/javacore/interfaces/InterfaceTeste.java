package com.daniel.javacore.interfaces;

import com.daniel.javacore.interfaces.domain.DataLogerImpl;

public class InterfaceTeste {
    public static void main(String[] args) {
        DataLogerImpl dataLogerImpl = new DataLogerImpl();
        dataLogerImpl.logs();
        dataLogerImpl.remove();
        dataLogerImpl.checkPermission();
    }
}
