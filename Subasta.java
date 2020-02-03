package TADavanzados;

import java.util.ArrayList;

public class Subasta {
	ArrayList<Producto> listaP;
	
	public Subasta() {
		listaP=new ArrayList<>();
	}
	public void IngresarProdEnSubasta(Producto prod) {
		if(listaP.size()==0) {
			listaP.add(prod);
			
		}
		if(!listaP.contains(prod)) {
				listaP.add(prod);
		}
	}
	public void OfertarProducto(String nombre,int precio) {
		for(Producto p: listaP) {
			if(p.getNombre().equals(nombre) && precio>p.getPrecioBase()) {
			p.setPrecioOfertado(precio);
			}
		  }
		}
	public void vender(String nombre,int precio) {
		for(Producto p: listaP) {
			if(p.getNombre().equals(nombre) && precio>p.getPrecioBase()) {
				OfertarProducto(nombre, precio);
				p.setPrecioActual(precio);
				p.setVendido(true);
			}
		}
	}
		public boolean EstaVendido(Producto p) {
			return p.Vendido();
			}

	@Override
		public String toString() {
			StringBuilder s= new StringBuilder();
			for(Producto p: listaP) {
				s.append(p.toString()+"\n");
			}
			return s.toString();
		}
	}
