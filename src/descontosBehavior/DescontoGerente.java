package descontosBehavior;

public class DescontoGerente implements Desconto{

	private double valorDesnconto;
	
	@Override
	public double descontar(double salario) {
		this.valorDesnconto = salario > 3500 ? (salario * .20) : (salario * .15);
		return this.valorDesnconto;
	}

}
