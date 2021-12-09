package br.senai.sp.jandira;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Arquivo;
import br.senai.sp.jandira.model.Contato;
import br.senai.sp.jandira.ui.TelaCadastro;

public class App {

	public static void main(String[] args) {

		/*ContatosRepository objContatosRepository = new ContatosRepository();
		Arquivo objArquivo = new Arquivo();

		String caminho = "C:\\Users\\21276363\\Desktop\\Contato\\contatos.txt";

		Contato contato1 = new Contato("Ana da Silva", "ana.silva@gmail.com", "1111-1111", "Jandira");
		Contato contato2 = new Contato("Maria Eduarda", "mariazinha@gamil.com", "2222-2222", "Osasco");
		Contato contato3 = new Contato("João Carlos", "joazinho.silva@gmail.com", "3333-3333", "Cotia");
		Contato contato4 = new Contato("Carlos João", "pereira.carlao@gmail.com", "4444-4444", "Itapevi");

		objContatosRepository.cadastrarContato(contato1);
		objContatosRepository.cadastrarContato(contato2);
		objContatosRepository.cadastrarContato(contato3);
		objContatosRepository.cadastrarContato(contato4);

		// Percorre o ArrayList de contatos e grava os dados no arquico txt
		
		//1º exemplo
		/*ArrayList<Contato> listagem = objContatosRepository.listarContatos();

		for (Contato contato : listagem) {
			System.out.println("Nome: " + contato.getNome() + " Email: " + contato.getEmail() + " Telefone: "
					+ contato.getTelefone() + " Cidade: " + contato.getCidade());

		}*/
		
		// 2º exemplo
		/*String texto = "";
		for (Contato contato : objContatosRepository.listarContatos()) {
			//System.out.println("Nome: " + contato.getNome() + " Email: " + contato.getNome() + " Telefone: "
				//	+ contato.getTelefone() + " Cidade: " + contato.getCidade());
			
			texto += contato.getNome() + " ; " + contato.getEmail() + " ; " +  contato.getTelefone() + " ; " + contato.getCidade() + "\n";

		}
		System.out.println(texto);
		
		objArquivo.escrever(caminho,texto);
		
		

		System.out.println("Total de contatos cadastrados: " + objContatosRepository.contarContatos());*/

		TelaCadastro tela = new TelaCadastro();
		tela.setVisible(true);
	}

}
