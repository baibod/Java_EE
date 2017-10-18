package com.prueba;
import java.util.Scanner;
import com.salon4.llorar.Sacapuntas;

public class Practica_01
{
	public static int id=0;
	public static int id2=0;
	public static final int valorFinal=9;
	
	
	public static void main(String[] args)
	{
		
		System.out.println(1905%100);
		id=25;
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
		
		//Declaraci�n de flotantes
		float d=3.1215274f;
		float c=4.127f;
		float resf=0.0f;
		
		//Suma de flotantes en variable flotante
		resf=d+c;
		
		//Imprimir resultado de suma de flotantes
		System.out.println("Suma de flotantes: "+resf);	
		
		// Soluci�n de ecuaciones
		
		double x1= ((-b) + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		double x2= ((-b) - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		
		System.out.println("Resultado de Chicharronera x1= "+x1+" x2= "+x2);
		
		// Cadenas

		System.out.println("\n//////////// Cadenas ////////////");
		String cadena = "Paragaricutirimicuaro";	
		String cadena2 = cadena;
		String cadenaCesar=("ABCDEFGHIJKLMN�OPQRSTUVWXYZ");
		int espacio=3;
		System.out.println(cadena);
		
		for(int x=0;x<cadena2.length();x++)
		{
			System.out.println(cadena2.charAt(x));
			// Hacer sustituci�n
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
		
		System.out.println("Meses: " + meses[0]+ ", "+ meses[6]+ ", "+ meses[10]+ ", "+ meses[11] + ". || D�as: " + sem[0] + ", " + sem[4] + ", " + sem[1] + ".");
		
		
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
		
		System.out.println("Por favor introduce tu opci�n entre Chana, Juana o Chona");
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
		
		// M�todo equals | Se usa solo para comparar cadenas
		
		System.out.println("\n//////////// M�todo equals ////////////");
		
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
		
		Cuenta_Palabras cPib = new Cuenta_Palabras(10,20); // Nombre de clase + Nombre de Objeto = Instancia
		cPib.cuenta_Letras();
		
		// Llamar a Otro M�todo
		System.out.println("\n\n//////////// M�todo de Odi ////////////");
				
		Cuenta_Palabras cOdi = new Cuenta_Palabras(0,20); // Nombre de clase + Nombre de Objeto = Instancia
		cOdi.metodo_Odi();
		
		
		/* Try and catch
		System.out.println("\n\n//////////// Try and Catch ////////////");
		
		try		
		{
			contador = 0;
			while (contador<14)
			{
				System.out.println((contador+1)+" : "+meses[contador]);
				contador++;
			}
			
		} catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Excepci�n " + ex);
		} catch (NullPointerException ex)
		{
			System.out.println("Excepci�n " + ex);
		} catch (ClassCastException ex)
		{
			System.out.println("Excepci�n " + ex);
		} catch (NumberFormatException ex)
		{
			System.out.println("Excepci�n " + ex);
		}
		 catch (Exception ex)
		{
			System.out.println("Excepci�n " + ex);
		}finally
		{
			System.out.println("Bloque finally");
		}
		System.out.println("Saliendo del estado de la excepci�n..");
		 */
		
		// Llamando a clase Estudiante
		
		System.out.println("\n\n//////////// Llamando a clase Estudiante y cambiando sus valores de forma segura ////////////");
		
		// Instanciaci�n de la clase, uso del constructor sobrecargado
		Estudiante estudiHambre = new Estudiante(2,"Odi el m�s mero chido");
		
		// Obtener los datos de forma segura
		System.out.println(estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
		
		// Cambiar los valores
		estudiHambre.setCodigo(4);
		estudiHambre.setNombre("Gloria");
		
		// Obtener los datos de forma segura
		System.out.println("\n"+estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
		
		// Llamar al m�todo sin modificador de acceso
		estudiHambre.probar();
		
		//Sacapuntas sacaPuntas = new Sacapuntas(456,"filo");
		
		//id2++;
		//System.out.println("\nID del desorden "+id2);
		//probarEstatico();
	
} // Fin de main
	public static void probarEstatico()
	{		
		id=9999999;
		System.out.println("\n"+id);
	}
}

