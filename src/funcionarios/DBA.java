package funcionarios;
import descontosBehavior.DescontoDBA;

public class DBA extends Funcionario{
	public DBA(double salario, String name){
		setDesconto(new DescontoDBA());
		setSalario(salario);
		setNome(name);
	}
}
