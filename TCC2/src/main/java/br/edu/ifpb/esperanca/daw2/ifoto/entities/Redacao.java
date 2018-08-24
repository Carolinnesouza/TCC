
public class Redacao {

	private String texto;
	private int id;
	private String autor;
	private String metodospmelhorar; 
	private String login;
	private String senha;
	private String grupo; 

	public String getMetodospmelhorar() {
		return metodospmelhorar;
	}

	public void setMetodospmelhorar(String metodospmelhorar) {
		this.metodospmelhorar = metodospmelhorar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Redacao(String texto, int id, String autor, String metodospmelhorar, String login, String senha,
			String grupo) {
		super();
		this.texto = texto;
		this.id = id;
		this.autor = autor;
		this.metodospmelhorar = metodospmelhorar;
		this.login = login;
		this.senha = senha;
		this.grupo = grupo;
	}
	

}
