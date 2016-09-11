package descontosBehavior;

public class DescontoDBA implements Desconto{

	private double valorDesconto;
	
	@Override
	public double descontar(double salario) {
		this.valorDesconto = salario > 2000 ? (salario * .15) : (salario * .10);
		return this.valorDesconto;
	}
	

}
