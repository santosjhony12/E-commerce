package com.ecommerce.E_commerce.Service;

import com.ecommerce.E_commerce.DTO.Cliente;
import com.ecommerce.E_commerce.Repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Optional<Cliente> getById(Long id){
        Optional<Cliente> clienteFound = clienteRepository.findById(id);
        if(clienteFound.isPresent()){
            return clienteFound;
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado com o id: "+id);
        }
    }
}
