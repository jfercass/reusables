package com.testsecurity.rest;

import com.testsecurity.domain.entities.Usuario;
import com.testsecurity.domain.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioResource {
    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UsuarioResource(UsuarioRepository usuarioRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveUsuario(@RequestBody Usuario user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        usuarioRepository.save(user);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping(value="/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario getUsuario(@PathVariable String username) {
        return usuarioRepository.findByUsername(username);
    }
}
