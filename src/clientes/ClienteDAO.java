package clientes;

import java.util.List;

/**
 * Interface ClienteDAO
 * 
 * @author Pedro Alex
 */
public interface ClienteDAO {
	
	Cliente buscarPorId(Integer id);
	
    List<Cliente> buscarTodos();    
    
    void inserir(Cliente cliente);    
    
    void atualizar(Cliente cliente);
    
    void excluir(Integer id);
    
}
