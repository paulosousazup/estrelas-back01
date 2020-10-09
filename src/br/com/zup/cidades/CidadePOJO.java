package br.com.zup.cidades;

public class CidadePOJO {

	private int cep;
	private String nome;
	private int num_habitantes;
	private boolean capital;
	private String estado;
	private float renda_per_capta;
	
	public CidadePOJO () {
		
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum_habitantes() {
		return num_habitantes;
	}

	public void setNum_habitantes(int num_habitantes) {
		this.num_habitantes = num_habitantes;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getRenda_per_capta() {
		return renda_per_capta;
	}

	public void setRenda_per_capta(float renda_per_capta) {
		this.renda_per_capta = renda_per_capta;
	}
}
