package Modelo.Quarto;

public class Quarto {

	private int ID_Quarto;
	private Double Diária;
	private int Capacidade_hóspedes;
	private int Status;

	public int getID_Quarto() {
		return ID_Quarto;
	}

	public void setID_Quarto(int iD_Quarto) {
		ID_Quarto = iD_Quarto;
	}

	public Double getDiária() {
		return Diária;
	}

	public void setDiária(Double diária) {
		this.Diária = diária;
	}

	public int getCapacidade_hóspedes() {
		return Capacidade_hóspedes;
	}

	public void setCapacidade_hóspedes(int capacidade_hóspedes) {
		this.Capacidade_hóspedes = capacidade_hóspedes;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		this.Status = status;
	}

}
