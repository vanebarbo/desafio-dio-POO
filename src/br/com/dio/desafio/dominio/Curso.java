package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private String titulo;
	private String descricao;
	private int cargaHoraria;
	
	
	@Override
	public double calcularXp() {
	
		return XP_PADRAO * cargaHoraria;
	}
	public Curso() {
		
	}

	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}
	public void setTitulo(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setDescricao(String string) {
		// TODO Auto-generated method stub
		
	}


}
