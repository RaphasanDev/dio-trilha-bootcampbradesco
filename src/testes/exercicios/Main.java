package testes.exercicios;

import java.util.Scanner;

abstract class Conta {
	protected String titular;
	protected int numeroConta;
	protected double saldo;

	public Conta(String titular, int numeroConta, double saldoInicial) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldoInicial;
	}

	public abstract void sacar(double valor);

	public void depositar(double valor) {
		saldo += valor;
	}

	public void exibirSaldo() {
		System.out.printf("Saldo Atual: %.2f%n", saldo);
	}
}

class ContaCorrente extends Conta {
	private double limiteChequeEspecial;

	public ContaCorrente(String titular, int numeroConta, double saldoInicial, double limiteChequeEspecial) {
		super(titular, numeroConta, saldoInicial);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	@Override
	public void sacar(double valor) {
		if ((saldo - valor) >= -limiteChequeEspecial) {
			saldo -= valor;
			System.out.printf("Saque realizado: %.2f%n", valor);
		} else {
			System.out.println("Saque inválido: Excede limite");
		}
		exibirSaldo(); // Exibe o saldo atualizado
	}
}

class ContaPoupanca extends Conta {
	public ContaPoupanca(String titular, int numeroConta, double saldoInicial) {
		super(titular, numeroConta, saldoInicial);
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.printf("Saque realizado: %.2f%n", valor);
		} else {
			System.out.println("Saque inválido: Saldo insuficiente");
		}
		exibirSaldo(); // Exibe o saldo atualizado
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tipo conta");
		String tipoConta = scanner.nextLine();
		System.out.println("Titular");
		String titular = scanner.nextLine();
		System.out.println("Numero conta");
		int numeroConta = scanner.nextInt();
		System.out.println("Saldo inicial");
		double saldoInicial = scanner.nextDouble();

		Conta conta;

		if (tipoConta.equalsIgnoreCase("Corrente")) {
			System.out.println("Cheque especial");
			double limiteChequeEspecial = scanner.nextDouble();
			conta = new ContaCorrente(titular, numeroConta, saldoInicial, limiteChequeEspecial);
		} else if (tipoConta.equalsIgnoreCase("Poupanca")) {
			conta = new ContaPoupanca(titular, numeroConta, saldoInicial);
		} else {
			System.out.println("Tipo de conta inválido.");
			scanner.close();
			return;
		}

		while (scanner.hasNextDouble()) {
			System.out.println("Saque");
			double valorOperacao = scanner.nextDouble();
			conta.sacar(valorOperacao);
		}

		scanner.close();
	}
}