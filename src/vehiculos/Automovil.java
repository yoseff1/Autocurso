package vehiculos;

// esto es la plantilla, una clase que contiene atributos y metodos
public class Automovil {
	private String marca; //yo puedo decidir si un parametro de una clase es publico o privado
	private String modelo;
	private int velocidadMaxima;
	private int velocidadActual=0;
	private boolean encendido;
	private String patente;
	private String color;
	
	public Automovil(String marca, String modelo,int velocidadMaxima,String patente,String color) {
			this.marca = marca;
			this.modelo = modelo;
			this.velocidadMaxima = velocidadMaxima;
			this.patente = patente;
			this.color =color;
			}
	
	public Automovil(String marca, String modelo,int velocidadMaxima,String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.patente = patente;
		this.color = "gris";
}
	
	public void setMarca(String m) {
		marca = m;
	}
	public String getMarca() {
		return marca;
	}
	public void acelerar(int velocidad) {
		velocidadActual = velocidadActual + velocidad;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void frenar() {
		// operacion para frenar
		///guardar
	}
	public void encender() {
		//operacion para acelerar
		//hice cambios en la rama freno
	}
	public void apagar() {
		
	}
	
	

}

}
