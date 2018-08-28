package teste.backend.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/grupos/{grupoId}/clientes")
	public List<Cliente> getClientesByGrupo(@PathVariable int grupoId){
		return clienteService.getClientesByGrupo(grupoId);
	}
	
	@GetMapping("/grupos/{grupoId}/clientes/{id}")
	public Cliente getClienteById(@PathVariable int id){
		return clienteService.getClienteById(id);
	}
	
	@PostMapping("/grupos/{grupoId}/clientes")
	public boolean addCliente(@RequestBody Cliente cliente, @PathVariable int grupoId) {
		return clienteService.addCliente(cliente, grupoId);
	}
	
	@PutMapping("/grupos/{grupoId}/clientes")
	public void updateCliente(@RequestBody Cliente cliente, @PathVariable int grupoId) {
		clienteService.updateCliente(cliente,grupoId);
	}
	
	@DeleteMapping("/grupos/{grupoId}/clientes/{id}")
	public void deleteCliente(@PathVariable int id){
		clienteService.deleteCliente(id);
	}

}
