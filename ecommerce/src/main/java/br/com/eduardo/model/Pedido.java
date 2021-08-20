package br.com.eduardo.model;

public class Pedido {

	private String descricao;
	private Double preco;
	private Long quantidade;
	
	public Pedido() {
	}
	
	public Pedido(String descricao, Double preco, Long quantidade) {
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

}
