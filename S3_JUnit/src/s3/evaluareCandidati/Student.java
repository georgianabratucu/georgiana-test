package s3.evaluareCandidati;

public class Student implements IEvaluabil{
	private String nume;
	private int varsta;
	private Gen gen;
	private int[] punctaje;
	
	public Student(String nume, int varsta, Gen gen) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.gen = gen;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setGen(Gen gen) {
		this.gen = gen;
	}

	@Override
	public int[] getScor() {
		// TODO Auto-generated method stub
		return punctaje;
	}

}
