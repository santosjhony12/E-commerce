package com.ecommerce.E_commerce.Service;

import com.ecommerce.E_commerce.DTO.Categoria;
import com.ecommerce.E_commerce.Repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> findAll(){
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }
    public Optional<Categoria> findById(Long id){
        Optional<Categoria> categoriaFound = categoriaRepository.findById(id);
        if(categoriaFound.isPresent()){
            return categoriaFound;
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria com o id "+id+" não existe.");
        }
    }
    public void deleteById(Long id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        if(categoria.isPresent()){
            categoriaRepository.deleteById(id);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada");
        }
    }
}
