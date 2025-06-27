package com.daniel.javacore.introducao.associacao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Local {
    private String address;

    public Local(String address) {
        this.address = address;
    }
}
