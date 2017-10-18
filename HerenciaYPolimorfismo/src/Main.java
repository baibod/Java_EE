
public class Main
{

	public Main()
	{
		
	}

	public static void main(String[] args)
	{
		// Clase + Identificador (Nombre de variable) + Asignación 
		Oddie chucho = new Oddie();
		chucho.comer();
		chucho.dormir();
		chucho.ladrar();
		System.out.println("\nGato:");
		Garfield gatillo = new Garfield();
		gatillo.comer("tacos");
		gatillo.comer("laSagna".toUpperCase());
		
		Nermal gata = new Nermal();
		gata.molestar(gatillo.nombre);
		gata.molestar(chucho.sellama); // NO FUNCIONA
		gata.comer();
		
	}

}
