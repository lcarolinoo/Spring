package br.com.cpti.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cpti.backend.entity.Convidado;
import br.com.cpti.backend.entity.Palestra;


public interface ConvidadoRepository extends JpaRepository <Convidado, Long>{
List <Convidado> findByPalestra(Palestra palestra);
}
