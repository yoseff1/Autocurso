package principal;

import vehiculos.Automovil;

public class Principal {
	
	public static void main(String[] args) {
		Automovil Miauto = new Automovil("Ford", "Falcon", 180, "aaa111", "Celeste");
		Automovil MiSegundoauto = new Automovil("Chev", "Corsa", 160, "ccc222");
		System.out.println();
		Miauto.getMarca(); 
		System.out.println(Miauto.getMarca());
		Miauto.encender();
		Miauto.acelerar(30);
		System.out.println(Miauto.getVelocidadActual());
		Miauto.frenar();
		Miauto.setVelocidadMaxima(180);
		System.out.println(Miauto.getVelocidadMaxima());
	}
	

}
