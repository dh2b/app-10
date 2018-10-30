package br.com.tt;

public class Cliente implements Comparable<Cliente> {
	private Long id;
	private String nome;
	private String cpf;

	public Cliente(Long id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Cliente(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Cliente() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(o.getNome());
	}

}
