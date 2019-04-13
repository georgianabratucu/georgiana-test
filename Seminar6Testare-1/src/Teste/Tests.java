package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import Categorii.CategorieSalariati;
import Categorii.CategorieVerificareLegalitate;
import Dubluri.PersFake;
import Dubluri.PersStab;
import Dubluri.PersStabSpy;
import Dubluri.PersoanaDummy;
import clase.Companie;
import interfete.IPersoana;

public class Tests {

	@Test
	@Category(CategorieSalariati.class)
	public void testGetNrSlariati() {
		Companie companie=new Companie("comp", new PersoanaDummy(),1000);
		List<IPersoana> listaSal=new ArrayList<>();
		listaSal.add(new PersoanaDummy());
		listaSal.add(new PersoanaDummy());
		companie.setSalariati(listaSal);
		
		assertEquals(2, companie.getNumarSalariati());
		
	}
	//dummy, stab, fake, spy
	@Test
	@Category(CategorieVerificareLegalitate.class)
	public void testVerificareLegalitateStub()
	{
		IPersoana persoana=new PersStab();
		Companie companie=new Companie("comp",persoana,1000);
		assertTrue(companie.verificareLegalitate());
	}
	
	@Test
	@Category(CategorieVerificareLegalitate.class)
	public void testVerificareLegalitateFake()
	{
		PersFake persoana=new PersFake();
		persoana.setValoareReturnataDeCheckCNP(true);
		persoana.setValoareReturnataDeGetsex("F");
		persoana.setValoareReturnataDeGetVarsta(21);
		Companie companie=new Companie("COMP",persoana,1000);
		assertTrue(companie.verificareLegalitate());
	}
	
	@Test
	@Category(CategorieVerificareLegalitate.class)
	public void testVerificareLegalitateFakeFalse()
	{
		PersFake persoana=new PersFake();
		persoana.setValoareReturnataDeCheckCNP(true);
		persoana.setValoareReturnataDeGetsex("F");
		persoana.setValoareReturnataDeGetVarsta(15);
		Companie companie=new Companie("COMP",persoana,1000);
		assertFalse(companie.verificareLegalitate());
	}
	
	@Test
	@Category(CategorieVerificareLegalitate.class)
	public void testVerificareLegatlitateSpy()
	{
		PersStabSpy persoana=new PersStabSpy();
		Companie companie=new Companie("com",persoana,1000);
		assertTrue(companie.verificareLegalitate());
		System.out.println(persoana.getControrGetVarsta());

	}
}
///abggdgdgdff