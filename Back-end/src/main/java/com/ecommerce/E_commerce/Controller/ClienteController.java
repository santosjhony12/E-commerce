package com.ecommerce.E_commerce.Controller;

import com.ecommerce.E_commerce.DTO.Cliente;
import com.ecommerce.E_commerce.Repository.ClienteRepository;
import com.ecommerce.E_commerce.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class ClienteController {
    private ClienteRepository clienteRepository;
    private ClienteService clienteService;

    @Autowired
    public void ClienteController(ClienteRepository clienteRepository, ClienteService clienteService){
        this.clienteRepository = clienteRepository;
        this.clienteService = clienteService;
    }

    @PostMapping("/")
    public Cliente addCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
    @GetMapping("/clientes")
    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Optional<Cliente> getClientePorId(@PathVariable Long id){
        return clienteService.getById(id);
    }
}
