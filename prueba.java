package TADavanzados;

import java.util.ArrayList;

public class prueba {
	
	public static void main(String[] args) {
		/*MIB x =new MIB(100000, 200000);
		x.setearValor(5000, 3000, true);
		System.out.println(x.leerValor(5000,3000)); // debe devolver true 
		System.out.println(x.leerValor(5000,3001)); // debe devolver false */
		/*
		Alumno al= new Alumno();
		al.Agregar("Jorge", "matematicas", 10);
 		al.Agregar("Jorge", "ed.fisica", 10);
 		al.Agregar("Jorge", "ingles", 5);
 		System.out.println(al.toString());
		System.out.println(al.promedio("Jorge"));*/
 		
		
		Producto play= new Producto("Playstation4", 1250, 24000);
		Producto iphone= new Producto("Iphone11", 1230, 40000);
		Producto Tv42= new Producto("SmartTv42", 1240, 18000);
		Producto Xbox= new Producto("XboxOne", 1260, 25000);
		Producto Portatil= new Producto("Portatil", 1270, 30000);
		Producto Tv32= new Producto("SmartTv32", 1280, 12000);
		Producto Parlante= new Producto("Parlante", 1210, 5000);
		
		Subasta s= new Subasta();
		s.IngresarProdEnSubasta(Parlante);
		s.IngresarProdEnSubasta(Tv32);
		s.IngresarProdEnSubasta(Portatil);
		s.IngresarProdEnSubasta(Xbox);
		s.IngresarProdEnSubasta(Tv42);
		s.IngresarProdEnSubasta(iphone);
		s.IngresarProdEnSubasta(play);
		
		s.OfertarProducto("Playstation4", 25000);
		System.out.println(s.toString());
		
		
	}
  }
