package livro;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SistemaCadastro {
	ArrayList<Livro> listaLivros = new ArrayList<>();

	
	public void menu() throws IOException  {
			
			ImageIcon icon = new ImageIcon("C:\\Users\\treinamentosti\\Downloads\\pilha-de-livros.png");
			
			String[] opcoes = {"Cadastrar Livro","Exibir Livro","Imprimir","sair"};
			
			int controle =JOptionPane.showOptionDialog(null,"Sistema de cadastro","Escolha uma das opções:", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, icon, opcoes, opcoes[0]);
			
			
				
			switch(controle) {				
			case 0:					
				cadastrar();				
				menu();					
				break;				
			case 1:				
				exibir();				
				menu();
				break;
			case 2:
				Livro imprime = new Livro();
				imprime.imprimirLista(listaLivros);
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				menu();
				break;
			}
				
			
			
	  }
	
	public void cadastrar() { 
	
		Livro livro = new Livro();
		livro.cadastrarLivro();
		listaLivros.add(livro);
		JOptionPane.showMessageDialog(null, livro.titulo + " iCadastrado com sucesso!");
		
	}
	
	public void exibir() {
		if(listaLivros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não existem livros cadastrados!");
   }else {
	   Livro livro = new Livro(); 
		   livro.exibirListaCompleta(listaLivros);
	   
     }
   }
 }
