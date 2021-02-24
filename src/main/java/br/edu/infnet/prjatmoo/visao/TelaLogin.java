package br.edu.infnet.prjatmoo.visao;

import java.util.Scanner;

import br.edu.infnet.prjatmoo.controle.LoginCtrl;

public class TelaLogin implements Tela {
	
	private String conta;
	private int pin;
	private LoginCtrl loginCtrl = new LoginCtrl();
	
	public void apresentar() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Bem vindo!");
		System.out.print("Informe o número da conta: ");
		conta = scan.next();
		System.out.print("Informe o PIN: ");
		pin = scan.nextInt();
		loginCtrl.login(conta, pin);
		
	}

}
