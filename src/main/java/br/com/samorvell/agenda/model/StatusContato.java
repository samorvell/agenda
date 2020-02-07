package br.com.samorvell.agenda.model;

public enum StatusContato {
	
	NOVO("Novo"),
	ATUALIZADO("Atualizado");
	
	private String status;

	StatusContato(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
