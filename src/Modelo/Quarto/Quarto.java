package Modelo.Quarto;

public class Quarto {

	private int ID_Quarto;
	private Double Di�ria;
	private int Capacidade_h�spedes;
	private int Status;

	public int getID_Quarto() {
		return ID_Quarto;
	}

	public void setID_Quarto(int iD_Quarto) {
		ID_Quarto = iD_Quarto;
	}

	public Double getDi�ria() {
		return Di�ria;
	}

	public void setDi�ria(Double di�ria) {
		this.Di�ria = di�ria;
	}

	public int getCapacidade_h�spedes() {
		return Capacidade_h�spedes;
	}

	public void setCapacidade_h�spedes(int capacidade_h�spedes) {
		this.Capacidade_h�spedes = capacidade_h�spedes;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		this.Status = status;
	}

}
