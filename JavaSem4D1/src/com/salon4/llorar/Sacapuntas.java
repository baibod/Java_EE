package com.salon4.llorar;

public class Sacapuntas
{
	private int id;
	private String marca;
	
	public Sacapuntas(int id, String marca)
	{
		
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	void probarSacapuntas()
	{
		System.out.println("\nAfilando l�piz...");
	}
}
