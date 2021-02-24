package br.edu.infnet.prjatmoo.visao;

import java.util.Scanner;

import br.edu.infnet.prjatmoo.controle.ContaCtrl;

public class TelaDeposito implements Tela {

	private ContaCtrl contaCtrl = new ContaCtrl();
	
	private double valor;
	
	public void apresentar() {
		
		System.out.println(" Deposito ");
		System.out.print("Informe o valor: ");
		Scanner scanner = new Scanner(System.in);
		valor = scanner.nextDouble();
		contaCtrl.depositar(valor);
		
	}
}
