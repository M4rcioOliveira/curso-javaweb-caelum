package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.model.Contato;

public class TestaConexao {

	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
	
		List<Contato> contatos = dao.getLista();

		for(Contato c : contatos) {
			System.out.println(c.toString());
		}
	}

}
