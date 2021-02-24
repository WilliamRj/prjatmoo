package br.edu.infnet.prjatmoo.visao;

import java.util.Scanner;

import br.edu.infnet.prjatmoo.controle.HomeCtrl;

public class TelaHome implements Tela {

	private int opcao;
	private HomeCtrl homeCtrl = new HomeCtrl();
	
	public void apresentar() {
		
		Scanner scanner = new Scanner(System.in);
		while (opcao <= 3) {
			System.out.println("");
			System.out.println(" Menu ");
			System.out.println("------");
			System.out.println(" 1 - Ver o Saldo ");
			System.out.println(" 2 - Saque ");
			System.out.println(" 3 - Depósito ");
			System.out.println(" 4 - Sair ");
			System.out.println(" Entre com a opção: ");
		
		
			opcao =  scanner.nextInt();
			homeCtrl.abrir(opcao);
		}
	}
	
}
