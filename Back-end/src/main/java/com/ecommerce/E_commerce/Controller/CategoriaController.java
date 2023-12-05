package com.ecommerce.E_commerce.Controller;

import com.ecommerce.E_commerce.DTO.Categoria;
import com.ecommerce.E_commerce.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class CategoriaController {
    private CategoriaService categoriaService;

    @Autowired
    public void CategoriaController(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @PostMapping("/categoria")
    public ResponseEntity<Categoria> addCategoria(@RequestBody Categoria categoria){
        Categoria newCategoria = categoriaService.save(categoria);
        return new ResponseEntity<>(categoria, HttpStatus.CREATED);
    }

    @GetMapping("/categorias")
    public List<Categoria> findAll(){
        return categoriaService.findAll();
    }
    @GetMapping("/categoria/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        return categoriaService.findById(id);
    }
    @DeleteMapping("/categoria/{id}")
    public void deleteById(@PathVariable Long id){
        categoriaService.deleteById(id);
    }
}
