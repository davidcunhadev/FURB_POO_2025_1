package com.aula2;

public class Papagaio {
    private String nome;
    private int idade;

    public Papagaio(String nome, int idade) {
      if (nome.trim().isBlank()) {
        throw new IllegalArgumentException("Nome inválido");
      }

      if (idade < 0 || idade > 50) {
        throw new IllegalArgumentException("Idade inválida");
      }

      this.nome = nome;
      this.idade = idade;
    }

    public String pedirBiscoito() {
      return this.nome + " quer biscoito.";
    }

    public String getNome() {
      return this.nome;
    }

    public void setNome(String nome) {
      if (nome.trim().isBlank()) {
        throw new IllegalArgumentException("Nome inválido");
      }

      this.nome = nome;
    }

    public int getIdade() {
      return idade;
    }

    public void setIdade(int idade) {
      if (idade < 0 || idade > 50) {
        throw new IllegalArgumentException("Idade inválida");
      }

      this.idade = idade;
    }
}
