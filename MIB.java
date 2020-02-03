package TADavanzados;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MIB {
	private Integer i; 
	 private Integer j; 
	 private ArrayList<Tupla<Coordenada,Boolean>> mat;
	 Coordenada largoMat;
	   
	 public MIB(Integer f, Integer c){ 
	 mat = new ArrayList<Tupla<Coordenada,Boolean>>();
	 largoMat = new Coordenada(f, c);
	 
	 } 
	 
	 Boolean leerValor(Integer i, Integer j){
		Coordenada busqueda = new Coordenada(i,j);
		for(Tupla<Coordenada,Boolean> c: mat) {
			if(c.getT1().equals(busqueda)) {
				return c.getT2();
			}
			
		}
		Tupla<Coordenada,Boolean> Tnueva= new Tupla<Coordenada,Boolean>(busqueda, false);
		mat.add(Tnueva);
		return false;
	 } 
	 public void setearValor(Integer i, Integer j, Boolean x){ 
		 Coordenada busqueda = new Coordenada(i,j);
		 int cont =0;
			for(Tupla<Coordenada,Boolean> c: mat) {
				if(c.getT1().equals(busqueda)) {
					c.setT2(x);
					cont++;
				}
			}
			if(cont==0) {
			Tupla<Coordenada,Boolean> Tnueva= new Tupla<Coordenada,Boolean>(busqueda, x);
			mat.add(Tnueva);
			}
	 } 
	 @Override
	 public String toString () {
		return "["+this.i+","+this.j+"]"; 
	 }
	 }
	
		 
	 
	
