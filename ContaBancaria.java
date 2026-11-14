package conta;

import java.util.Scanner;

public class ContaBancaria {

	private String titular;
	private double saldo = 0;

	public ContaBancaria(String titular) {
		this.titular = titular;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("Deposito realizado com sucesso e saldo atualizado.");
		} else {
			System.out.println("Erro: o valor do deposito deve ser maior que zero.");
		}
	}

	public double sacar(double valor) {
		if (valor <= 0) {
			return -2;
		} else if (saldo < valor) {
			return -1;
		} else {
			saldo = saldo - valor;
			return saldo;
		}
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ContaBancaria conta1 = new ContaBancaria("Aisha");

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("ESCOLHA UMA OPCAO:");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("0 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
				case 1:
					System.out.println("Informe o valor que deseja depositar:");
					double valorDeposito = entrada.nextDouble();
					conta1.depositar(valorDeposito);
					break;

				case 2:
					System.out.println("Qual valor voce deseja sacar?");
					double valorSacar = entrada.nextDouble();
					double resultado = conta1.sacar(valorSacar);

					if (resultado == -2) {
						System.out.println("Erro: valor invalido para saque.");
					} else if (resultado == -1) {
						System.out.println("Erro: saldo insuficiente na sua conta.");
					} else {
						System.out.println("Saque realizado com sucesso! Novo valor do saldo: " + resultado);
					}
					break;

				case 3:
					System.out.println("O seu saldo atual e: " + conta1.getSaldo());
					break;

				case 0:
					System.out.println("Encerrando o programa.");
					break;

				default:
					System.out.println("Opcao invalida! Escolha um numero entre 0 e 3.");
					break;
			}
		}

		entrada.close();
	}

}
