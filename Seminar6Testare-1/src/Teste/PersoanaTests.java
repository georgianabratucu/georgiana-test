package Teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import Categorii.CategorieSalariati;
import Categorii.CategorieVerificareLegalitate;
import clase.Persoana;

public class PersoanaTests {

	@Test
	@Category(CategorieSalariati.class)
	public void testGetSex() {
		Persoana persoana=new Persoana("numw","1970304410031");
		assertEquals("M",persoana.getSex());
	}
	
	@Test
	@Category({CategorieVerificareLegalitate.class, CategorieSalariati.class})
	public void testCNP() {
		Persoana persoana=new Persoana("numw","1970304410031");
		assertFalse("M",persoana.checkCNP());
	}


}
