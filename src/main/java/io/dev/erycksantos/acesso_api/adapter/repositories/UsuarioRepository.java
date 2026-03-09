package io.dev.erycksantos.acesso_api.adapter.repositories;

import io.dev.erycksantos.acesso_api.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <UsuarioEntity, Long> {
}
