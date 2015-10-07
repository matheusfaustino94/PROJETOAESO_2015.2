package Modelo.Reserva;

import java.sql.Date;

public class Reserva {

	private int ID_Reserva;
	private int ID_Quarto;
	private int ID_Hópede;
	private Date Data_Reserva;
	private Date Data_Expiração;

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

	public int getID_Hóspede() {
		return ID_Hópede;
	}

	public void setID_Hóspede(int iD_Hóspede) {
		ID_Hópede = iD_Hóspede;
	}

	public Date getData_Reserva() {
		return Data_Reserva;
	}

	public void setData_Reserva(Date data_Reserva) {
		this.Data_Reserva = data_Reserva;
	}

	public Date getData_Expiração() {
		return Data_Expiração;
	}

	public void setData_Expiração(Date data_Expiração) {
		this.Data_Expiração = data_Expiração;
	}

}
