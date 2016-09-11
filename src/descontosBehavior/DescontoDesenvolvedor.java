package descontosBehavior;

public class DescontoDesenvolvedor implements Desconto{

	private double valorDesncontado;
	
	@Override
	public double descontar(double salario) {
		this.valorDesncontado = salario > 2000? (salario * .15) : (salario * .10); 
		return this.valorDesncontado;
	}

}
