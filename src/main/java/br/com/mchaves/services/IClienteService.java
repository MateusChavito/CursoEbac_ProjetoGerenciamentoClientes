package br.com.mchaves.services;

import br.com.mchaves.domain.Cliente;

public interface IClienteService {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
