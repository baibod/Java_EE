
public class Practica_01
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
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

		System.out.println("//////////// Cadenas ////////////");
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
		
		System.out.println("//////////// Arreglos ////////////");
		
		// Definiento arreglos 
		String[]meses={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[]sem={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		
		System.out.println("Meses: " + meses[0]+ ", "+ meses[6]+ ", "+ meses[10]+ ", "+ meses[11] + ". || Días: " + sem[0] + ", " + sem[4] + ", " + sem[1] + ".");
		
		
		// Condiciones
		
		boolean x = true;
		boolean az = false;
		
		System.out.println("\n");
		System.out.println("//////////// Condicionales ////////////");
		System.out.println("\n");
		
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
		
		}
}
