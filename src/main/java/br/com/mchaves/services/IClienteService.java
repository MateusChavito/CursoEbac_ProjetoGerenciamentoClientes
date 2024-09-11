package br.com.mchaves.services;

import br.com.mchaves.domain.Cliente;

public interface IClienteService {
    void salvar(Cliente cliente);

    Cliente buscarPorCPF(long cpf);
}
