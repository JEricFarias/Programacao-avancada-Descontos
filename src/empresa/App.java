package empresa;

import funcionarios.Desenvolvedor;

public class App {
	public static void main (String [] args){
		// imprimir o desconto
		
		Desenvolvedor programador = new Desenvolvedor(3000, "Chico");
		
		System.out.println("Valor Descontado: " + programador.calcularDesconto());
	}

}
