package br.com.etechoracio.mind.repository;

import br.com.etechoracio.mind.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
