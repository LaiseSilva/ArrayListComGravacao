package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.ContatosRepository;
import br.senai.sp.jandira.model.Arquivo;
import br.senai.sp.jandira.model.Contato;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCidade;
	
	/*** Atributos referentes a criação/gravação de contatos ***/
	Contato objContato = null;
	ContatosRepository objContatosRepository = null;
	Arquivo objArquivo = null;
	String texto = "";

	
	public TelaCadastro() {
		
		objContato = new Contato();
		objContatosRepository = new ContatosRepository();
		objArquivo = new Arquivo();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Contatos");
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblTitulo.setBounds(124, 11, 249, 29);
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNome.setBounds(25, 65, 84, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(25, 105, 84, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTelefone.setBounds(25, 149, 84, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCidade.setBounds(25, 196, 84, 14);
		contentPane.add(lblCidade);
		
		txtNome = new JTextField();
		txtNome.setBounds(124, 65, 153, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(124, 105, 153, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(124, 149, 153, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(124, 190, 153, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Ação do botão cadastrar
				
				//Captura dos dados para o objeto de contato
				objContato.setNome(txtNome.getText());
				objContato.setEmail(txtEmail.getText());
				objContato.setTelefone(txtTelefone.getText());
				objContato.setCidade(txtCidade.getText());
				
				//Preparação dos dados para a gravação no arquivo txt
				
				/***(Antes de mudar no metódo ler)***/
				//String texto = objContato.getNome() + "; " +
				//		   objContato.getEmail() + "; " +
				//		       objContato.getTelefone() + "; " +
			    //				   objContato.getCidade() + "\n";
				//objArquivo.escrever(caminho, texto);
				
				//Gravação dos dados no arquivo txt
				String caminho = "C:\\Users\\21276363\\Desktop\\Contato\\contatos.txt";
				
				//Teste de leitura de arquivo txt
				objContatosRepository = objArquivo.ler(caminho);
				
				/*Gravação*/
				
				objContatosRepository.cadastrarContato(objContato);
				
				/*LEITURA*/
				ArrayList<Contato> contatos = objContatosRepository.listarContatos();
				
				
				 contatos.forEach(contato -> {
					 //System.out.println("Nome: " + contato.getNome() + " Email: "+ contato.getEmail() + " Telefone: " + contato.getTelefone() + " Cidade: " + contato.getCidade());
					 
					 texto += contato.getNome() + ";"+ contato.getEmail()+ ";" + contato.getTelefone() + ";"+ contato.getCidade() +"\n";
				 });
				 
				objArquivo.escrever(caminho, texto);
				System.out.println(objContatosRepository.contarContatos());
				
			}
		});
		btnCadastrar.setBounds(124, 231, 153, 29);
		contentPane.add(btnCadastrar);
		
		
	}
}
