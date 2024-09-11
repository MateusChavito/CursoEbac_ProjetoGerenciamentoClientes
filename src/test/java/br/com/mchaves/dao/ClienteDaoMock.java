package br.com.mchaves.dao;

import br.com.mchaves.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public void salvar(Cliente cliente) {
    }

    @Override
    public Cliente buscarPorCPF(long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
