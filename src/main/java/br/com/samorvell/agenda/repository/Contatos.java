package br.com.samorvell.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samorvell.agenda.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long>{

}
