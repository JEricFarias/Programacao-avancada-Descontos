package funcionarios;

import descontosBehavior.Desconto;

public abstract class Funcionario {
	private Desconto desconto;
	private double salario;
	private String nome;
	
	public double calcularDesconto(){
		return desconto.descontar(salario);
	}
	
	/**
	 * @return the desconto
	 */
	protected Desconto getDesconto() {
		return desconto;
	}
	/**
	 * @param desconto the desconto to set
	 */
	protected void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	/**
	 * @return the salario
	 */
	protected double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * @return the nome
	 */
	protected String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
