package com.example.exercicio02.service;

import com.example.exercicio02.entity.Usuario;
import com.example.exercicio02.repository.UsuarioRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario buscarUsuario(Long id){
        return usuarioRepository.buscarUsuarioPorId(id);
    }

    public Usuario cadastrarUsuario(Usuario usuario){
        for(Usuario u: usuarioRepository.buscarUsuarios()){
            if(u.getEmail().equals(usuario.getEmail())){
                return null;
            }
        }
        return usuarioRepository.adicionarUsuario(usuario);
    }
    public List<Usuario> buscarUsuarios(){
        return usuarioRepository.buscarUsuarios();
    }

    public Usuario atualizarUsuario(Long id, Usuario usuario){
        Usuario usuario1 = usuarioRepository.buscarUsuarioPorId(id);
        if(usuario1==null){
            return null;
        }else{
            usuario.setId(id);
            usuarioRepository.deletarUsuario(usuario1);
            usuarioRepository.adicionarUsuario(usuario);
            return usuario;
        }
    }
}
