

public class Redacao  {

	private String texto;
	private Long id;
	private String autor;
	private String metodospmelhorar; 
	private String login;
	private String senha;
	private String grupo;
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getMetodospmelhorar() {
		return metodospmelhorar;
	}
	public void setMetodospmelhorar(String metodospmelhorar) {
		this.metodospmelhorar = metodospmelhorar;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		return "Redacao [texto=" + texto + ", id=" + id + ", autor=" + autor + ", metodospmelhorar=" + metodospmelhorar
				+ ", login=" + login + ", senha=" + senha + ", grupo=" + grupo + "]";
	} 

	public Redacao() {
		// TODO Auto-generated constructor stub
	}
	
	
	}
	
