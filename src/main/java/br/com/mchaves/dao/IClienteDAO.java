package br.com.mchaves.dao;

import br.com.mchaves.domain.Cliente;

public interface IClienteDAO {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(long cpf);

    void excluir(Long cpf);
}
