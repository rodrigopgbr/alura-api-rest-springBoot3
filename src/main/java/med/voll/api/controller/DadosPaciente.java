package med.voll.api.controller;

import med.voll.api.domain.endereco.DadosEndereco;

public record DadosPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
