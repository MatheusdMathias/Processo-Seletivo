package br.com.seletivo.service;

import br.com.seletivo.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    private List<Pessoa> candidatos = new ArrayList<>();
    private List<Pessoa> aprovados = new ArrayList<>();

    public void adicionarCandidato(Pessoa pessoa) {
        candidatos.add(pessoa);
        if (pessoa.isAprovada()) {
            aprovados.add(pessoa);
        }
    }

    public void exibirResultados() {
        System.out.println("\n--- Candidatos Aprovados ---");
        if (aprovados.isEmpty()) {
            System.out.println("Nenhum candidato foi aprovado.");
        } else {
            for (Pessoa pessoa : aprovados) {
                System.out.println(pessoa.getResumo());
            }
        }
    }
}
