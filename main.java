package br.com.seletivo;

import br.com.seletivo.model.Pessoa;
import br.com.seletivo.service.ProcessoSeletivo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessoSeletivo processo = new ProcessoSeletivo();

        try {
            System.out.print("Quantas pessoas deseja cadastrar? ");
            int total = sc.nextInt();
            sc.nextLine(); // limpar buffer

            for (int i = 1; i <= total; i++) {
                System.out.println("\nCandidato " + i + ":");
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();

                System.out.print("Experiência (anos): ");
                int experiencia = sc.nextInt();

                System.out.print("Nota da avaliação (0 a 10): ");
                double nota = sc.nextDouble();
                sc.nextLine(); // limpar buffer

                Pessoa pessoa = new Pessoa(nome, idade, experiencia, nota);
                processo.adicionarCandidato(pessoa);
            }

            processo.exibirResultados();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, use o tipo de dado correto.");
        } finally {
            sc.close();
        }
    }
}
