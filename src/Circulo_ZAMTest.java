import static org.junit.Assert.*;

import org.junit.Test;

public class Circulo_ZAMTest {
	Circulo_ZAM cir1=new Circulo_ZAM(7,"circulo1");
	Circulo_ZAM cir2=new Circulo_ZAM(0,"circulo2");
	Circulo_ZAM cir3=new Circulo_ZAM(-3,"circulo3");

	@Test
	public void testArea1() {
		assertEquals(153.9384, cir1.area(),0);
	}

	@Test
	public void testPerimetro1() {
		assertEquals(43.9824, cir1.perimetro(),0);
	}

	@Test
	public void testArea2() {
		assertEquals(0, cir2.area(),0);
	}

	@Test
	public void testPerimetro2() {
		assertEquals(0, cir2.perimetro(),0);
	}

	@Test
	public void testArea3() {
		assertEquals(28.2744, cir3.area(),0);
	}

	@Test
	public void testPerimetro3() {
		assertEquals(18.8496, cir3.perimetro(),0);
	}
	
}
