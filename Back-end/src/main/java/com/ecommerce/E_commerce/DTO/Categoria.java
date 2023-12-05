package com.ecommerce.E_commerce.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_categoria")
    private Long id;
    @Column(name = "categoria")
    private String categoria;
}
