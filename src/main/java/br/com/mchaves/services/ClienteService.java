package br.com.mchaves.services;

import br.com.mchaves.dao.ClienteDAO;
import br.com.mchaves.dao.IClienteDAO;
import br.com.mchaves.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
       this.clienteDAO = new ClienteDAO();
    }

    @Override
    public Boolean salvar(Cliente cliente) {
       return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }
}
