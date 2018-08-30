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
	
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable int id){
		clienteService.deleteCliente(id);
	}

}
