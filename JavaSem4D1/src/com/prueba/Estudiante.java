package com.prueba;

public class Estudiante

{
	// Atributos de la clase, nótese que son privados
	private int codigo;
	private String nombre;
	
	// Metodo constructor de la clase por defecto
	public Estudiante()
	{
		
	}
	
	// Metodo constructor sobrecargado
	public Estudiante(int codigo, String nombre)
	{
		// Llamada a métodos
		// Se establecen valores de forma segura
		setCodigo(codigo);
		setNombre(nombre);
	}

	/*
	 * Como los atributos de la clase son privados,
	 * necesito una forma de acceder a sus valores.
	 * Por eso creo métodos para poder acceder de
	 * forma segura a estos
	 */
	
	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	void probar()
	{
		System.out.println("\nHola, soy un método sin modificador de acceso");
	}
	
}
