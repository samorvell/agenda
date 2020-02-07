package br.com.samorvell.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.samorvell.agenda.model.Contato;
import br.com.samorvell.agenda.repository.Contatos;

@Controller
@RequestMapping("/contato")
public class ContatoController {
	
	@Autowired
	private Contatos contatos;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastraContato";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Contato contato) {
		//Salvar no banco de dados
		
		contatos.save(contato);
		return "CadastraContato";
	}
	
}
