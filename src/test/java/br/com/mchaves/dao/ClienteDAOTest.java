package br.com.mchaves.dao;

import br.com.mchaves.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.mchaves.dao.ClienteDaoMock;
import br.com.mchaves.dao.IClienteDAO;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Mateus");
        cliente.setCidade("São Bernardo do Campo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11999999999L);
        clienteDao.salvar(cliente);

    }


    @Test
    public void pesquisarCliente(){

    Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
        Boolean retorno = clienteDao.salvar(cliente);

        Assert.assertTrue(retorno);

    }

    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCpf());

    }

    @Test
    public void alterarCliente(){
        cliente.setNome("Mateus Chaves");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Mateus Chaves", cliente.getNome());
    }
}
