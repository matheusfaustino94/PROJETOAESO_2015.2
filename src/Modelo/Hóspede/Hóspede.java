package Modelo.H�spede;

import java.sql.Date;

public class H�spede {

	private int ID_H�spede;
	private String Nome;
	private String CPF;
	private Date Data_Nascimento;
	private String Telefone;

	public int getID_H�spede() {
		return ID_H�spede;
	}

	public void setID_H�spede(int iD_H�spede) {
		ID_H�spede = iD_H�spede;
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
