package funcionarios;

import descontosBehavior.DescontoDesenvolvedor;

public class Desenvolvedor extends Funcionario{
	
	public Desenvolvedor(double salario, String nome){
		setDesconto(new DescontoDesenvolvedor()); 
		setSalario(salario);
		setNome(nome);
	}
}
