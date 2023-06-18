package amanda.entidades;

import java.util.Date;

public class Postagem {
	private Long id;
	private String conteudo;
	private String titulo;
	private Date dataCriacao;
	
	public Postagem() {}
	
	public Postagem(Long id, String conteudo) {
		this.id = id;
		this.conteudo = conteudo;
		this.titulo = "Titulo " + id;
		this.dataCriacao = new Date();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
}
