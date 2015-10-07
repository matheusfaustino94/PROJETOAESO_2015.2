package Modelo.Hóspede;

import java.sql.Date;

public class Hóspede {

	private int ID_Hóspede;
	private String Nome;
	private String CPF;
	private Date Data_Nascimento;
	private String Telefone;

	public int getID_Hóspede() {
		return ID_Hóspede;
	}

	public void setID_Hóspede(int iD_Hóspede) {
		ID_Hóspede = iD_Hóspede;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getData_Nascimento() {
		return Data_Nascimento;
	}

	public void setData_Nascimento(Date data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

}
