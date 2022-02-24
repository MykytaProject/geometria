import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Before;    
    
public class Circulo_MRTest {

    @Before
    public void setup(){

    }
   
    double PI = 3.1416;

    @Test
    public void testArea() {
        Circulo_MR areaCir = new Circulo_MR(-3, "Circulo");
        double area = areaCir.area();
        assertEquals(15, area);

    }           
        
    
    @Test

    public void testPerimetro(){
        Circulo_MR perimetroCir = new Circulo_MR(-3, "Circulo");
        double perimetro = perimetroCir.perimetro();
        assertEquals(15, perimetro);        

    }
}
    