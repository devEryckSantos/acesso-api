package io.dev.erycksantos.acesso_api.adapter.converters;

import io.dev.erycksantos.acesso_api.adapter.dtos.UsuarioDTO;
import io.dev.erycksantos.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario ToDomain(UsuarioDTO usuarioDto) {
        return new Usuario(
                usuarioDto.getId(),
                usuarioDto.getEmail(),
                usuarioDto.getSenha(),
                usuarioDto.isAdministrador(),
                null
        );
    }

    public UsuarioDTO ToDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getId(),
                null,
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.isAdministrador()
        );

    }
}
