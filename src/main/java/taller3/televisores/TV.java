package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	Control control;
	static int  numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	
	public void setMarca (Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca () {
		return marca;
	}
	public void setControl (Control control) {
		this.control=control;
	}
	public Control getControl () {
		return control;
	}	
	public void setPrecio (int precio) {
		this.precio=precio;
	}
	public int getPrecio () {
		return precio;
	}
	public void setVolumen (int volumen) {
		if (estado==true) {
			if (volumen >= 1 && volumen <=7) {
				this.volumen=volumen;
		}

		}
		
	}
	public int getVolumen () {
		return volumen;
	}
	public void setCanal (int canal) {
		if(estado==true) {
			if (canal >=1 && canal <=120) {
				this.canal=canal;
		}

		}
		
	}
	public int getCanal () {
		return canal;
	}
	public  static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	public  static int getNumTV() {
		return numTV;
		
	}
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (estado==true) {
			if (canal >=1 && canal < 120) {
				canal=canal+1;
				}
		}

		}
	public void canalDown() {
		if(estado==true) {
			if (canal >1 && canal <= 120 ) {
				canal=canal-1;
			}
		}

	}
	public void volumenUp() {
		if (estado==true) {
			if (volumen >=0 && volumen < 7) {
				volumen=volumen+1;
				}
		}	
	}
	public void volumenDown() {
		if(estado==true) {
			if (volumen >0 && volumen <= 7 ) {
				volumen=volumen-1;
			}
		}
	}
}

