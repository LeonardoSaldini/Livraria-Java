package livro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {

	      String titulo;
	      String autor;
	      int anoPublicacao;

	      public void cadastrarLivro() {
	  		this.titulo = JOptionPane.showInputDialog(null, "Digite o título do livro:");
	  		this.autor = JOptionPane.showInputDialog(null, "Quem é o autor do livro?");
	  		this.anoPublicacao =
	  		Integer.parseInt(JOptionPane.showInputDialog(null, "Em que ano o livro foi publicado?"));
	  	}
	  	
	  	
	  	public String exibirLivros() {
	  		 
	  		return "\nTítulo: " + this.titulo +
	  				"\nAutor: " + this.autor +
	  				"\nPublicação: " + this.anoPublicacao + "\n";
	  	}
	  	
	  	public void exibirListaCompleta(ArrayList l) {
	  		
	  	String listaCompleta = "Livros cadastrados: \n";
	  	for (int x = 0; x <= l.size()-1; x++) {
	  		Livro elemento = (Livro) l.get(x);
	  		listaCompleta = listaCompleta + elemento.exibirLivros();
	  	}
	  
	  	JOptionPane.showMessageDialog(null, listaCompleta);
	  	}
	  	
	  	public void imprimirLista(ArrayList l) throws IOException {
	  		
	  		FileWriter arquivo = new FileWriter("C:/Users/treinamentosti/Desktop/Lista Livros.txt");
	  		PrintWriter gravar = new PrintWriter(arquivo);
	  		
	  		
	  		
	  		String listaCompleta = "Livros cadastrados: \n";
		  	for (int x = 0; x <= l.size()-1; x++) {
		  		Livro elemento = (Livro) l.get(x);
		  		listaCompleta = listaCompleta + elemento.exibirLivros();
		  				  		
		  	}
		  	gravar.println(listaCompleta);
		  	arquivo.close();
		  	JOptionPane.showMessageDialog(null, "Documento impresso com sucesso !");
	  	}
	  	
	  		
}
    	