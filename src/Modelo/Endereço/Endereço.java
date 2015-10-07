package Modelo.Endere�o;

public class Endere�o {

	private int ID_Endere�o;
	private int ID_H�spede;
	private String Rua;
	private String N�mero;
	private String Bairro;
	private String Cidade;
	private String CEP;

	public int getID_Endere�o() {
		return ID_Endere�o;
	}

	public void setID_Endere�o(int iD_Endere�o) {
		ID_Endere�o = iD_Endere�o;
	}

	public int getID_H�spede() {
		return ID_H�spede;
	}

	public void setID_H�spede(int iD_H�spede) {
		ID_H�spede = iD_H�spede;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		this.Rua = rua;
	}

	public String getN�mero() {
		return N�mero;
	}

	public void setN�mero(String n�mero) {
		this.N�mero = n�mero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

}
