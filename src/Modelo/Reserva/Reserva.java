package Modelo.Reserva;

import java.sql.Date;

public class Reserva {

	private int ID_Reserva;
	private int ID_Quarto;
	private int ID_H�pede;
	private Date Data_Reserva;
	private Date Data_Expira��o;

	public int getID_Reserva() {
		return ID_Reserva;
	}

	public void setID_Reserva(int iD_Reserva) {
		ID_Reserva = iD_Reserva;
	}

	public int getID_Quarto() {
		return ID_Quarto;
	}

	public void setID_Quarto(int iD_Quarto) {
		ID_Quarto = iD_Quarto;
	}

	public int getID_H�spede() {
		return ID_H�pede;
	}

	public void setID_H�spede(int iD_H�spede) {
		ID_H�pede = iD_H�spede;
	}

	public Date getData_Reserva() {
		return Data_Reserva;
	}

	public void setData_Reserva(Date data_Reserva) {
		this.Data_Reserva = data_Reserva;
	}

	public Date getData_Expira��o() {
		return Data_Expira��o;
	}

	public void setData_Expira��o(Date data_Expira��o) {
		this.Data_Expira��o = data_Expira��o;
	}

}
