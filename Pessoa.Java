package br.com.seletivo.model;

public class Pessoa {
    private String nome;
    private int idade;
    private int experiencia;
    private double nota;

    public Pessoa(String nome, int idade, int experiencia, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.experiencia = experiencia;
        this.nota = nota;
    }

    public boolean isAprovada() {
        return idade >= 18 && experiencia >= 1 && nota >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public String getResumo() {
        return nome + " | Idade: " + idade + " | Experiência: " + experiencia + " anos | Nota: " + nota;
    }
}
