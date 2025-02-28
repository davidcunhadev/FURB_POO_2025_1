package com.aula2;

public class Main {
    public static void main(String[] args) {
        try {
            Papagaio papagaio = new Papagaio("Loiro José", 30);
    
            papagaio.setNome("Sehloiro José");
            System.out.println(papagaio.pedirBiscoito());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}