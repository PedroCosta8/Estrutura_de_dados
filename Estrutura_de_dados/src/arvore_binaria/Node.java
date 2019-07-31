package arvore_binaria;

public class Node {

	private int elemento;
	private Node pai, esquerdo, direito;
	
	public Node(int elemento, Node pai, Node esquerdo, Node direito) {
		this.setElemento(elemento);
		this.setPai(pai);
		this.setFilhoEsquerdo(esquerdo);
		this.setFilhoDireito(direito);
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public Node getPai() {
		return pai;
	}

	public void setPai(Node pai) {
		this.pai = pai;
	}

	public Node getFilhoEsquerdo() {
		return esquerdo;
	}

	public void setFilhoEsquerdo(Node esquerdo) {
		this.esquerdo = esquerdo;
	}

	public Node getFilhoDireito() {
		return direito;
	}

	public void setFilhoDireito(Node direito) {
		this.direito = direito;
	}

	public void clear() {
		this.setPai(null);
		this.setFilhoEsquerdo(null);
		this.setFilhoDireito(null);
	}
	
	
	
}
