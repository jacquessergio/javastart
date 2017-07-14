package br.projeto.jsf;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Hello implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome = "Hello Word!!!";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
