package funcionarios;

import descontosBehavior.DescontoGerente;

public class Gerente extends Funcionario{
	public Gerente(double salario, String name){
		setDesconto(new DescontoGerente());
		setSalario(salario);
		setNome(name);
	}
}
