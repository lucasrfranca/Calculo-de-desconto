package br.com.visao;

import javax.swing.JOptionPane;
import br.com.controle.Desconto;

public class Objeto {
	
	public static void main(String[] args) {
		
		Desconto desc = new Desconto();
		
		desc.setValor(Double.valueOf(JOptionPane.showInputDialog("Digite o total")));
		
		double valorComDesconto = desc.calcularDesconto();
		String mensagem = "Valor com desconto: R$" + valorComDesconto;
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
}
