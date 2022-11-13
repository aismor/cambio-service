package br.com.aismor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aismor.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);

}
