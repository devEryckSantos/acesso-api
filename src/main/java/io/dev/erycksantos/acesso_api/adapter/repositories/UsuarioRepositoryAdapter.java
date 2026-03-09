package io.dev.erycksantos.acesso_api.adapter.repositories;

import io.dev.erycksantos.acesso_api.adapter.entities.UsuarioEntity;
import io.dev.erycksantos.acesso_api.core.domain.Usuario;
import io.dev.erycksantos.acesso_api.core.ports.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {

        UsuarioEntity entity = modelMapper.map(usuario, UsuarioEntity.class);
        UsuarioEntity novoUsuario = usuarioRepository.save(entity);

        return modelMapper.map(novoUsuario, Usuario.class);
    }
}
