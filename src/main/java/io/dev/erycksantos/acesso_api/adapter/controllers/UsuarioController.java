package io.dev.erycksantos.acesso_api.adapter.controllers;

import io.dev.erycksantos.acesso_api.adapter.converters.UsuarioConverter;
import io.dev.erycksantos.acesso_api.adapter.dtos.UsuarioDTO;
import io.dev.erycksantos.acesso_api.core.domain.Usuario;
import io.dev.erycksantos.acesso_api.core.ports.UsuarioServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    public final UsuarioServicePort usuarioServicePort;
    public final UsuarioConverter usuarioConverter;

    public UsuarioController(UsuarioServicePort usuarioServicePort, UsuarioConverter usuarioConverter) {
        this.usuarioServicePort = usuarioServicePort;
        this.usuarioConverter = usuarioConverter;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO usuarioDto) {

        Usuario novoUsuario = usuarioServicePort.createUsuario(usuarioConverter.ToDomain(usuarioDto));

        return usuarioConverter.ToDTO(novoUsuario);
    }
}
