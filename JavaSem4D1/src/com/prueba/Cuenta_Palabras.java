package com.prueba;

public class Cuenta_Palabras
{
	
	String[]meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	int numeroDeLetras;
	int numeroDeOdi;

	public Cuenta_Palabras() // Constructor por defecto
	{
		
	}
	
	public Cuenta_Palabras(int numero, int otronum)
	{
		this.numeroDeLetras = numero;
		this.numeroDeOdi = otronum;
	}
	
	public void cuenta_Letras()
	{
		for (int f=0; f<meses.length; f++)
		{
			if (meses[f].length() == numeroDeLetras)
			{
				System.out.println(meses[f]+" : "+numeroDeLetras+"\n/////////////////////");
				break;
			}
		}
		
		for (int f=0; f<meses.length; f++)
		{
			if (meses[f].length() == numeroDeLetras)
			{
				System.out.println(meses[f]+" : "+numeroDeLetras);
			}
		}
	}
	
	// Crear otro método
	
	public void metodo_Odi()
	{
		System.out.println("El número es: " + numeroDeOdi);
	}
}
