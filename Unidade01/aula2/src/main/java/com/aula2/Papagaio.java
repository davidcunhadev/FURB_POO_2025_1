package com.aula2;

public class Papagaio {
    private String nome;
    private int idade;

    public Papagaio(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
    }

    public void pedirBiscoito() {
      System.out.println(this.nome + " quer biscoito.");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
