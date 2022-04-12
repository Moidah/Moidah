package claseyobjetos;

public class Avion {
	public  static Avion[] aviones;
	private int velocidad;
	private int costo;
	private int salud = 10;
	
	public Avion() {
		
	}
	
	public Avion(int velocidad,int costo,int salud) {
		this.velocidad = velocidad;
		this.costo = costo;
		this.salud = salud;	
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}
	
	public void informacionAviones() {
		for(int i=0;i<aviones.length;i++) {
		System.out.println("velocidad:"+aviones[1].getVelocidad()+" salud: "+aviones[i].getSalud()+" costo: "+aviones[i].getCosto());
		}
	}
	public static void masVeloz(Avion a1,Avion a2) {
		if(a1.getVelocidad()<a2.getVelocidad()) {
			System.out.println("el avion mas veloz es:"+a2);
			System.out.println("velocidad: "+a2.getVelocidad()+" salud: "+a2.getSalud()+" costo: "+a2.getCosto());
		}else if(a2.getVelocidad()<a1.getVelocidad()) {
			System.out.println("el avion mas veloz es:"+a1);
			System.out.println("velocidad: "+a1.getVelocidad()+" salud: "+a1.getSalud()+" costo: "+a1.getCosto());
		}
	}
	public static void VelocidadMayor() {
		for(int i = 0; i<aviones.length; i++) {
			if(aviones[i].getVelocidad()>2100) {
				System.out.println(aviones[i]);
			}
		}
	}
	public static void ataque(Avion a1,Avion a2) {
		
	}
	
}
	

