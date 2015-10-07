package Modelo.Endereço;

public class Endereço {

	private int ID_Endereço;
	private int ID_Hóspede;
	private String Rua;
	private String Número;
	private String Bairro;
	private String Cidade;
	private String CEP;

	public int getID_Endereço() {
		return ID_Endereço;
	}

	public void setID_Endereço(int iD_Endereço) {
		ID_Endereço = iD_Endereço;
	}

	public int getID_Hóspede() {
		return ID_Hóspede;
	}

	public void setID_Hóspede(int iD_Hóspede) {
		ID_Hóspede = iD_Hóspede;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		this.Rua = rua;
	}

	public String getNúmero() {
		return Número;
	}

	public void setNúmero(String número) {
		this.Número = número;
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
