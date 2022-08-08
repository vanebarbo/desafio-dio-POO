package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private String titulo;
	private String descricao;
	private LocalDate data;
	
	public double calcularXp() {

		return XP_PADRAO + 20d;
	}
    
	public Mentoria() {
		
	}

	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}

	public void setTitulo(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDescricao(String string) {
		// TODO Auto-generated method stub
		
	}


	
	
}
