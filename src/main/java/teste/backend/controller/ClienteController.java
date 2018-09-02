package teste.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import teste.backend.model.Cliente;
import teste.backend.service.ClienteService;

@CrossOrigin
@RestController
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> getClientes(){
		return clienteService.getClientes();
	}
	
	@GetMapping("/grupos/{grupoId}/clientes")
	public List<Cliente> getClientesByGrupo(@PathVariable int grupoId){
		return clienteService.getClientesByGrupo(grupoId);
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente getClienteById(@PathVariable int id){
		return clienteService.getClienteById(id);
	}
	
	@PostMapping("/clientes")
	public boolean addCliente(@RequestBody Cliente cliente) {
		return clienteService.addCliente(cliente);
	}
	
	@PutMapping("/clientes")
	public void updateCliente(@RequestBody Cliente cliente) {
		clienteService.updateCliente(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable int id){
		clienteService.deleteCliente(id);
	}
	
	@GetMapping("/clientes/count")
	public long getCantClientes(){
		return clienteService.getCantClientes();
	}

}
