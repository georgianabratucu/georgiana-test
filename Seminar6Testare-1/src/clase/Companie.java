package clase;

import java.util.List;

import interfete.IPersoana;

public class Companie {
	private String nume;
	private IPersoana director;
	private float cifraAfaceri;
	private List<IPersoana> listaSalariati;

	public Companie(String nume, IPersoana dir, float cifra) {
		this.nume = nume;
		director = dir;
		cifraAfaceri = cifra;
	}

	public boolean verificareLegalitate() {
		if (director.getVarsta() < 18)
			return false;
		if (cifraAfaceri < 0)
			return false;

		return true;
	}

	public void setSalariati(List<IPersoana> listaSalariati) {
		this.listaSalariati = listaSalariati;
	}

	public int getNumarSalariati() {
		return listaSalariati.size();
	}

	///aici am modificat ceva
}
