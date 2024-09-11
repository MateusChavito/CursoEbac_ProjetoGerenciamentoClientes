package br.com.mchaves.dao;

import br.com.mchaves.domain.Cliente;

public interface IClienteDAO {

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(long cpf);
}
