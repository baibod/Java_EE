import java.util.Scanner;

public class Practica_01
{

	public static void main(String[] args)
	{
		System.out.println("//////////// Hello World ////////////");
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.out.println("\n//////////// Operaciones sencillas ////////////");
		int a=4;
		int b=81;
		int resultado=0;
		
		//Suma
		resultado=a+b;
		
		//Imprimir resultado de la suma
		System.out.println("Suma: "+resultado);
		
		//Declaración de flotantes
		float d=3.1215274f;
		float c=4.127f;
		float resf=0.0f;
		
		//Suma de flotantes en variable flotante
		resf=d+c;
		
		//Imprimir resultado de suma de flotantes
		System.out.println("Suma de flotantes: "+resf);	
		
		// Solución de ecuaciones
		
		double x1= ((-b) + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		double x2= ((-b) - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		
		System.out.println("Resultado de Chicharronera x1= "+x1+" x2= "+x2);
		
		// Cadenas

		System.out.println("\n//////////// Cadenas ////////////");
		String cadena = "Paragaricutirimicuaro";	
		String cadena2 = cadena;
		String cadenaCesar=("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		int espacio=3;
		System.out.println(cadena);
		
		for(int x=0;x<cadena2.length();x++)
		{
			System.out.println(cadena2.charAt(x));
			// Hacer sustitución
			cadena2=cadena2.replace(cadena2.charAt(x),cadenaCesar.charAt(x+espacio));
		}
		
		System.out.println(cadena2);
		
		System.out.println(cadena.substring(3, 6));
		System.out.println(cadena.toLowerCase());
		
		// Arrays
		
		System.out.println("\n//////////// Arreglos ////////////");
		
		// Definiento arreglos 
		String[]meses={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[]sem={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		
		System.out.println("Meses: " + meses[0]+ ", "+ meses[6]+ ", "+ meses[10]+ ", "+ meses[11] + ". || Días: " + sem[0] + ", " + sem[4] + ", " + sem[1] + ".");
		
		
		// Condiciones
		
		boolean x = true;
		boolean az = false;
		
		System.out.println("\n");
		System.out.println("//////////// Condicionales ////////////");
		
		System.out.println("EQUALS: " + (x==az));
		System.out.println("EQUALS NEGATIVE OF: " + (x==!az));
		
		System.out.println("OR: " + (x||az));
		System.out.println("AND: " + (x&&az));
		
		if (x==az)
		{
			System.out.println("\nChana!!");
		}
		else
		{
			System.out.println("\nJuana!!");
		}
		
		// Switch Cases
		
		System.out.println("\n//////////// Swith / Cases ////////////");
		
		System.out.println("Por favor introduce tu opción entre Chana, Juana o Chona");
		String option = "Chana";
		Scanner lector = new Scanner(System.in); // Instanciar la clase que lee de teclado
		option=lector.nextLine();  // Leer de teclado hasta dar enter
		
		switch(option)
		{
		case "Chana":
			System.out.println("Chana!");
			break;
		case "Juana":
			System.out.println("Juana!");
			break;
		case "Chona":
			System.out.println("Chona!");
			break;
		default:
			System.out.println("Nacha pop!");
			break;
		}
		
		// Método equals | Se usa solo para comparar cadenas
		
		System.out.println("\n//////////// Método equals ////////////");
		
		String cadena5="Hola";
		
		if(cadena5.equals("Holi"))
		{
			System.out.println("Son igualitas!");
		}
		else
		{
			System.out.println("No son igualitas!");
		}
		
		// Ciclos FOR
		
		System.out.println("\n//////////// Ciclos FOR ////////////");
		System.out.println("\n//////////// For Each ////////////");
		for (String i: meses) // For each
		{
			System.out.print(i);
		}
		
		// Programa While
		
		System.out.println("\n\n//////////// Ciclo While ////////////");
		
		int contador=0;
		
		// Bucle While
		while(contador<meses.length)
		{
			System.out.println((contador+1) + " : " + meses[contador]);
			contador++;
		}
		
		
		// Llamar a Cuenta Palabras
		System.out.println("\n\n//////////// Cuenta Palabras ////////////");
		
		Cuenta_Palabras cPib = new Cuenta_Palabras(5);
		cPib.cuenta_Letras();
		
	}
}
