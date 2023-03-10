public class Punto2 {
	
	int x = 2, y = 3, z = 6;
	
	Punto2A (x);
	punto2B (x, y);
	punto2C (x, y, z);
	punto2D (x, y, z);
	punto2E (x, y, z);
	punto2F (x, y, z);
}

  public void punto2A(int x) {
	  
	  double problemaUno = Math.sqrt(Math.pow(x, 5) - 6) / 4;
	  System.out.println("El resultado del A es " + problemaUno);
  }
  
  public void punto2B(int x, int y) {
	  
	  double problemaDos = Math.pow(x, y) - Math.pow(6, x);
	  System.out.println("El resultado del B es " + problemaDos);
  }
  
  public void punto2C(int x, int y, int z) {
	  
	  double problemaTres = 4 * Math.cos(z/5) - Math.sin(Math.pow(x, 2));
	  System.out.println("El resultado del C es " + problemaTres);
  }
  
  public void punto2D(int x, int y, int z) {
	  
	  double problemaCuatro = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));
	  System.out.println("El resultado del D es " + problemaCuatro);
  }
  
  public void punto2E(int x, int y, int z) {
	  
	  double problemaCinco = 1 / y - (1 / x - Math.pow(2, y));
	  System.out.println("El resultado del E es " + problemaCinco);
  }
  
  public void punto2F(int x, int y, int z) {
	  
	  double problemaSeis = 7 * (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4)))));
  }
  