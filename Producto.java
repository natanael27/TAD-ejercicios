package TADavanzados;

public class Producto {
		private String Nombre;
		private int Clave;
		private int PrecioBase;
		private int PrecioOfertado;
		private int PrecioActual;
		private boolean SeVendio;
		
		public Producto(String nom,int clave,int precio) {
			Nombre=nom;
			Clave=clave;
			PrecioBase=precio;
			PrecioActual=precio;
			PrecioOfertado=0;
			SeVendio=false;
		}
		public boolean Vendido() {
			return SeVendio;
		}
		public void setVendido(boolean vendido) {
			this.SeVendio = vendido;
		}
		public int getClave() {
			return Clave;
		}
		public int getPrecioOfertado() {
			return PrecioOfertado;
		}
		public void setPrecioOfertado(int precio) {
			PrecioOfertado = precio;
		}
		public int getPrecioActual() {
			return PrecioActual;
		}
		public void setPrecioActual(int precio) {
			PrecioActual = precio;
		}
		public String getNombre() {
			return Nombre;
		}
		public int getPrecioBase() {
			return PrecioBase;
		}
		@Override
		public String toString() {
			return "Nombre= " + Nombre + ", PrecioActual= " + PrecioActual +"precio ofertado: "+PrecioOfertado+ (SeVendio ? " vendido":" no vendido");
		}
		
		
}
