package com.example.exercicio02.repository;

import com.example.exercicio02.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UsuarioRepository {
    List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> buscarUsuarios() {
        return usuarios;
    }

    public UsuarioRepository() {
        Usuario usuario01= new Usuario(1, "Kai","kaiane@gmail", "macaco");
        usuarios.add(usuario01);

    }

    public Usuario adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario buscarUsuarioPorId(Long id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public Usuario deletarUsuario(Usuario usuario){
        usuarios.remove(usuario);
        return usuario;
    }
}
