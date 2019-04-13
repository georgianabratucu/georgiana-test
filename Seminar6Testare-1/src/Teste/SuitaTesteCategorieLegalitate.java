package Teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Categorii.CategorieVerificareLegalitate;

@RunWith(Categories.class)
@SuiteClasses({ PersoanaTests.class, Tests.class })
@IncludeCategory(CategorieVerificareLegalitate.class)
public class SuitaTesteCategorieLegalitate {

}
