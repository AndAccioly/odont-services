package amanda.entidades;

public class Postagem {
	private Long id;
	private String conteudo;
	
	public Postagem() {}
	
	public Postagem(Long id, String conteudo) {
		this.id = id;
		this.conteudo = conteudo;
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
	
	
}
