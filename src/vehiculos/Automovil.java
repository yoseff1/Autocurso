package vehiculos;

// esto es la plantilla, una clase que contiene atributos y metodos
public class Automovil {
	private String marca; //yo puedo decidir si un parametro de una clase es publico o privado
	private String modelo;
	private int velocidadMaxima;
	private int velocidadActual=0;
	private boolean encendido;
	private String patente;
	public String color;
	
	public void setMarca(String m) {
		marca = m;
	}
	public String getMarca() {
		return marca;
	}
	public void acelerar(int velocidad) {
		velocidadActual = velocidadActual + velocidad;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void frenar() {
		// operacion para frenar
		///guardar
	}
	void encender() {
		//operacion para acelerar
		//hice cambios en la rama freno
	}
	void apagar() {
		
	}
	
	

}
