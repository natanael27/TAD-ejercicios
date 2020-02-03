package TADavanzados;import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Alumno{
	ArrayList <Tripla<String,String,Integer>> listaX;
	
	public Alumno() {
		
	listaX= new ArrayList<Tripla<String,String,Integer>>();
}
	
	public int promedio(String al) {
			int suma=0;
			int promedio=0;
			int cont=0;
			for(Tripla<String,String,Integer> alumno: listaX) {
				if(alumno.getX().equals(al)) {
					suma=suma+ alumno.getZ();
					cont++;
			}
		}promedio= suma/cont;
			return promedio;
	}
	public void Agregar(String al,String mat,Integer nota) {
		int cont =0;
		for(Tripla<String,String,Integer> t: listaX) {
			if(t.getX().equals(al)) {
				cont++;
			}
		}
		
		if(cont == listaX.size()||listaX.size()==0) {
			Tripla<String,String,Integer> tri = new Tripla<String,String,Integer>(al,mat,nota);
			listaX.add(tri);
		}
		}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder();
		for(Tripla<String,String,Integer> al: listaX) {
			s.append(al+"\n");
			
			}
		return s.toString();
		}
}