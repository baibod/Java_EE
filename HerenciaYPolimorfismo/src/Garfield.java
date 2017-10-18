public class Garfield extends Animal
{
	String nombre;

	public Garfield()
	{
		// TODO Auto-generated constructor stub
		nombre="Garfield";
	}
	
	public void comer(String comida)
	{
		if(comida.equalsIgnoreCase("lasagna"))
		{
			System.out.println("YAY!");
		}
		else
		{
			System.out.println("N'AY");
		}
	}

}
