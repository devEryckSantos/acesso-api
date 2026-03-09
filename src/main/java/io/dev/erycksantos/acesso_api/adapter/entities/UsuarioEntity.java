package io.dev.erycksantos.acesso_api.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String senha;
    boolean administrador;
}
