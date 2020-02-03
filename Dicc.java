package TADavanzados;

import java.util.ArrayList;
import java.util.HashSet;

public class Dicc<CLAVE,SIG>  {
	ArrayList <Tupla<CLAVE,SIG>> datos; 
	HashSet <CLAVE> claves;
	
public Dicc(CLAVE C,SIG S) {
	datos =new ArrayList<Tupla<CLAVE,SIG>>();
}

public HashSet<CLAVE> getClaves(){
	return this.claves;
}

	public void agregar(CLAVE C,SIG S) {
		if(estaDefinida(C)) {
			for(int i=0;i<datos.size();i++) {
				if(datos.get(i).getT1().equals(C)) {
					datos.get(i).setT2(S);
				}else {
					Tupla nueva= new Tupla<CLAVE,SIG>(C,S);
					datos.add(nueva);
					claves.add(C);
				}
			}
		}
	}
	public boolean estaDefinida(CLAVE C) {
		boolean ret= false; 
		for(int i=0;i<datos.size();i++) {
			ret = ret || datos.get(i).equals(C) ;
		}return ret;
	}
}
