package lojaOnline.models;

import java.time.LocalDate;

public class Cliente {
	private static int id_cliente;
	private String nome;
	private String cpf;
	private String rg;
	private String email;
	private LocalDate nascimento;
	
	public Cliente() {
		this.id_cliente += 1;
	}
	
	public int getId_cliente() {
		return id_cliente;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
}
