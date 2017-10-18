
public class Nermal extends Animal
{

	public Nermal()
	{
		// TODO Auto-generated constructor stub
	}
	
	public void molestar(String nombre)
	{
		if(nombre.equals("Garfield")||nombre.equalsIgnoreCase("Babosowey"))
		{
			System.out.println("Hola "+nombre+"!!!");
		}
	}

}
