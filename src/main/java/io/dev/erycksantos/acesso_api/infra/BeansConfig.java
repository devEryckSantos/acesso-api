package io.dev.erycksantos.acesso_api.infra;

import io.dev.erycksantos.acesso_api.core.ports.UsuarioRepositoryPort;
import io.dev.erycksantos.acesso_api.core.ports.UsuarioServicePort;
import io.dev.erycksantos.acesso_api.core.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() { return new ModelMapper(); }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }
}
