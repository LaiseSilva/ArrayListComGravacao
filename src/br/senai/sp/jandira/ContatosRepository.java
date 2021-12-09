package br.senai.sp.jandira;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Contato;

public class ContatosRepository {

	//Atributos
	
	//o genérico(<>) espera uma classe
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	Contato  contato = new Contato();
	
	//Métodos
	
	public void cadastrarContato(Contato c) {
		contatos.add(c);
	}
	
	public ArrayList<Contato> listarContatos(){
		return contatos;
	}
	
	public int contarContatos() {
		return contatos.size();
	}
	
}
