package grafo;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

	/**
	 * Nome representativo do nó ou vertice.
	 */
	private String nome;
	
	/**
	 * Lista de adjacencia.
	 */
	private List<Aresta> adj;
	
	/**
	 * Construtor da classe.
	 * @return 
	 */
	public Vertice(final String nome) {
		this.nome = nome;
		adj = new ArrayList<Aresta>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aresta> getAdj() {
		return adj;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
