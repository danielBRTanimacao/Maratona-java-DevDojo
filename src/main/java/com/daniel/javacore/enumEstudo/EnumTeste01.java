package com.daniel.javacore.enumEstudo;

import com.daniel.javacore.enumEstudo.domain.Client;
import com.daniel.javacore.enumEstudo.domain.TypePayment;
import com.daniel.javacore.enumEstudo.domain.TypePeople;

public class EnumTeste01 {
    public static void main(String[] args) {
        Client client = new Client("Guanabara");
        Client client0 = new Client("Pidão", TypePeople.PESSOA_FISICA, TypePayment.DEBIT);
        Client client1 = new Client("Cururu Pidão",  TypePeople.PESSOA_JURIDICA);
        client.print();
        client1.print();
        client0.print();
    }
}
