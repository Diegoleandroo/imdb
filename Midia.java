package br.com.poo;

public class Midia {
	
	private String titulo;
	private int ano;
	private double nota;
	
	
	public Midia() {
		
		
		
	}


	public Midia(String titulo, int ano, double nota) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.nota = nota;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
	
	
	
	

}
