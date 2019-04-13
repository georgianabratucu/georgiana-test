package Dubluri;

import interfete.IPersoana;

public class PersFake implements IPersoana {

	private String ValoareReturnataDeGetsex;
	public String getValoareReturnataDeGetsex() {
		return ValoareReturnataDeGetsex;
	}

	public void setValoareReturnataDeGetsex(String valoareReturnataDeGetsex) {
		ValoareReturnataDeGetsex = valoareReturnataDeGetsex;
	}

	public int getValoareReturnataDeGetVarsta() {
		return ValoareReturnataDeGetVarsta;
	}

	public void setValoareReturnataDeGetVarsta(int valoareReturnataDeGetVarsta) {
		ValoareReturnataDeGetVarsta = valoareReturnataDeGetVarsta;
	}

	public boolean isValoareReturnataDeCheckCNP() {
		return ValoareReturnataDeCheckCNP;
	}

	public void setValoareReturnataDeCheckCNP(boolean valoareReturnataDeCheckCNP) {
		ValoareReturnataDeCheckCNP = valoareReturnataDeCheckCNP;
	}

	private int ValoareReturnataDeGetVarsta;
	private boolean ValoareReturnataDeCheckCNP;
	
	
	
	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return ValoareReturnataDeGetsex;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return ValoareReturnataDeGetVarsta;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return ValoareReturnataDeCheckCNP;
	}

}
