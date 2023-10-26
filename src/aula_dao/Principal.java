package aula_dao;

import java.util.List;

import clientes.Cliente;
import clientes.ClienteDAO;
import clientes.ClienteDAOImpl;

/**
 * Classe Principal
 * 
 * @author Pedro Alex
 */
public class Principal {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = new ClienteDAOImpl();

        clienteDAO.inserir(new Cliente("Ana Maria"));
        clienteDAO.inserir(new Cliente("Jose da Silva"));
        clienteDAO.inserir(new Cliente("Rafael"));

        List<Cliente> clientes = clienteDAO.buscarTodos();
        for (Cliente cliente: clientes) {
            System.out.println(cliente.toString());
        }
        
        Cliente clienteBuscado = clienteDAO.buscarPorId(1);
        if (clienteBuscado != null) {
            clienteDAO.atualizar(clienteBuscado);
        }

        clienteDAO.excluir(2);

        clientes = clienteDAO.buscarTodos();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }

        clienteDAO.excluir(1);
	}

}
