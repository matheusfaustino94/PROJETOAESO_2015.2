package Modelo.Produto;

public class Produto {

	private int ID_Produto;
	private String Nome;
	private Double Valor;

	public int getID_Produto() {
		return ID_Produto;
	}

	public void setID_Produto(int iD_Produto) {
		ID_Produto = iD_Produto;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		this.Valor = valor;
	}

}
