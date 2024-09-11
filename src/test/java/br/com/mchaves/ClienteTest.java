package br.com.mchaves;

import br.com.mchaves.dao.ClienteDaoMock;
import br.com.mchaves.dao.IClienteDAO;
import br.com.mchaves.domain.Cliente;
import br.com.mchaves.services.ClienteService;
import br.com.mchaves.services.IClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Test
    public void pesquisarCliente(){

        Cliente cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Mateus");
        cliente.setCidade("São Bernardo do Campo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(11999999999L);

        clienteService.salvar(cliente);

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);



    }
}
