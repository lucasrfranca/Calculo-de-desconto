package br.com.controle;

public class Desconto {
	
	private double valor, res;

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calcularDesconto () {
		
		if (valor<500) {
			
			res = valor - (valor*0.05);
			
		}
		
		else {
			
			res = valor - (valor*0.10);
			
		}
		
		return this.res;
		
	}
}
