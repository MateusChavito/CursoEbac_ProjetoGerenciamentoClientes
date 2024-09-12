package br.com.mchaves;

import br.com.mchaves.dao.ClienteDaoMock;
import br.com.mchaves.dao.IClienteDAO;
import br.com.mchaves.domain.Cliente;
import br.com.mchaves.services.ClienteService;
import br.com.mchaves.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClientServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
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

    }

    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
       Boolean retorno = clienteService.salvar(cliente);

       Assert.assertTrue(retorno);

    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());


    }
}
