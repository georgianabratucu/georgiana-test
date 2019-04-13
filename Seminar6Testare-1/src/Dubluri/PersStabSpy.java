package Dubluri;

import interfete.IPersoana;

public class PersStabSpy implements IPersoana {

	public int getContorGetSex() {
			return contorGetSex;
	}



	public void setContorGetSex(int contorGetSex) {
		this.contorGetSex = contorGetSex;
	}



	public int getControrGetVarsta() {
		return controrGetVarsta;
	}



	public void setControrGetVarsta(int controrGetVarsta) {
		this.controrGetVarsta = controrGetVarsta;
	}



	public int getContorCNP() {
		return contorCNP;
	}



	public void setContorCNP(int contorCNP) {
		this.contorCNP = contorCNP;
	}

	private int contorGetSex;
	private int controrGetVarsta;
	private int contorCNP;
	
	public PersStabSpy()
	{
		contorGetSex=0;
		controrGetVarsta=0;
		contorCNP=0;
	}
	
	
	
	@Override
	public String getSex() {
		contorGetSex++;
		return "F";
	}

	@Override
	public int getVarsta() {
		controrGetVarsta++;
		return 21;
	}

	@Override
	public boolean checkCNP() {
		contorCNP++;
		return true;
	}

}
