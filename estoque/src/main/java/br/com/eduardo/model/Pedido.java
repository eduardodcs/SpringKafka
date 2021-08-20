package br.com.eduardo.model;

public class Pedido {

	private String descricao;
	private String marca;

	public Pedido() {
	}

	public Pedido(String descricao, String marca) {
		super();
		this.descricao = descricao;
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", marca=" + marca + "]";
	}

	
	
}
