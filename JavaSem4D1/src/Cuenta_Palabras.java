
public class Cuenta_Palabras
{
	
	String[]meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	int numeroDeLetras;

	public Cuenta_Palabras() // Constructor
	{
		
	}
	
	public Cuenta_Palabras(int numero)
	{
		this.numeroDeLetras = numero;
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
}
