package pokemon_pm.pokemon_pm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	@Test
    public void invalidInputOnly()
    {
        assertEquals( 1,App.getNumberPokemons("A") );
    }
	
	@Test
    public void invalidInput()
    {
        assertEquals( 2,App.getNumberPokemons("NAS") );
    }
	
	@Test
    public void lowercaseInput()
    {
        assertEquals( 4,App.getNumberPokemons("neso") );
    }
	
	
    @Test
    public void emptyInput()
    {
        assertEquals( 1,App.getNumberPokemons("") );
    }
    
    @Test
    public void nInput()
    {
        assertEquals( 2,App.getNumberPokemons("N") );
    }
    
    @Test
    public void sInput()
    {
        assertEquals( 2,App.getNumberPokemons("S") );
    }
    
    @Test
    public void eInput()
    {
        assertEquals( 2,App.getNumberPokemons("E") );
    }
    
    @Test
    public void oInput()
    {
        assertEquals( 2,App.getNumberPokemons("O") );
    }
    
    //Bigger tests
    
    @Test
    public void t1()
    {
        assertEquals( 6,App.getNumberPokemons("OOOOEEEEE") );
    }
    
    @Test
    public void t2()
    {
        assertEquals( 16,App.getNumberPokemons("NNNNEEEESSSSOOOO") );
    }
    
    @Test
    public void t3()
    {
        assertEquals( 3,App.getNumberPokemons("N1N2S1S2") );
    }
    
    @Test
    public void t4()
    {
        assertEquals( 8,App.getNumberPokemons("OSOSEENN") );
    }
    
    
    //Example Input 
    
    @Test
    public void input1()
    {
        assertEquals( 2,App.getNumberPokemons("E") );
    }
    
    @Test
    public void input2()
    {
        assertEquals( 4,App.getNumberPokemons("NESO") );
    }
    
    @Test
    public void input3()
    {
        assertEquals( 2,App.getNumberPokemons("NSNSNSNSNS") );
    }
    
}
