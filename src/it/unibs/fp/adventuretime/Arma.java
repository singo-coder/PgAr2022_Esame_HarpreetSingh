package it.unibs.fp.adventuretime;

public class Arma extends Oggetto{
	private String nome;
	private int potenza;
	public Arma(String nome, int potenza) {
		super();
		this.nome = nome;
		this.potenza = potenza;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPotenza() {
		return potenza;
	}
	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}
	
}
