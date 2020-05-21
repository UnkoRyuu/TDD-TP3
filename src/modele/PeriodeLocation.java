package modele;


public class PeriodeLocation {
	
	private String dateDebut;
	private String dateFin;

	
	public PeriodeLocation(String pdateDebut, String pdateFin) {
		this.dateDebut = pdateDebut;
		this.dateFin = pdateFin;
	}
	
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	
	
}
