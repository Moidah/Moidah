package claseyobjetos;

public class PrincipalAvion {

	public static void main(String[] args) {
		
		Avion[]aviones = new Avion[4];
		AvionF35 a1 = new AvionF35(1930,100,10);
		AvionF35 a2= new AvionF35(1930,100,10);
		AvionF22 a3 = new AvionF22(2414,200,10);
		AvionF22 a4 = new AvionF22(2414,200,10);

		aviones[0]=a1;
		aviones[1]=a2;
		aviones[2]=a3;
		aviones[3]=a4;
		
		for(int i=0; i<aviones.length; i++) {
			aviones[i].informacionAviones();
		}
		
		for(int i=0; i<aviones.length; i++) {
			aviones[i].VelocidadMayor();
		}
	}
}
		
	

