package Modelo.Ocupa��o;

import java.sql.Date;

public class Ocupa��o {
	private int ID_Ocupa��o;
	private int ID_Quarto;
	private int ID_Consumo;
	private Date Data_entrada;
	private int Dias_Ocupados;

	public int getID_Ocupa��o() {
		return ID_Ocupa��o;
	}

	public void setID_Ocupa��o(int iD_Ocupa��o) {
		ID_Ocupa��o = iD_Ocupa��o;
	}

	public int getID_Quarto() {
		return ID_Quarto;
	}

	public void setID_Quarto(int iD_Quarto) {
		ID_Quarto = iD_Quarto;
	}

	public int getID_Consumo() {
		return ID_Consumo;
	}

	public void setID_Consumo(int iD_Consumo) {
		ID_Consumo = iD_Consumo;
	}

	public Date getData_entrada() {
		return Data_entrada;
	}

	public void setData_entrada(Date data_entrada) {
		Data_entrada = data_entrada;
	}

	public int getDias_Ocupados() {
		return Dias_Ocupados;
	}

	public void setDias_Ocupados(int dias_Ocupados) {
		Dias_Ocupados = dias_Ocupados;
	}

}
