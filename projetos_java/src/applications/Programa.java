package applications;

import java.util.Scanner;
import java.util.Locale;

import projetos.Calculadora;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem-vindo(a) a calculadora em Java!");
		System.out.print("Digite 1 para a calculadora simples. E 2 para a cientifica. ");
		int calculadora = sc.nextInt();
		System.out.println();
		int escolha;
		double num1, num2, resultado;

		if (calculadora == 1) {
			System.out.println("Bem-vindo(a) a calculadora simples!");
			System.out.print("Digite 1 para adicao, 2 para subtracao, 3 para multiplicacao e 4 para divisao. ");
			System.out.println();
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.print("Digite o primeiro numero da soma: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo numero da soma: ");
				num2 = sc.nextDouble();
				resultado = Calculadora.sum(num1, num2);
				System.out.printf("Soma de %.2f + %.2f = %.2f", num1, num2, resultado);
				break;

			case 2:
				System.out.print("Digite o primeiro numero da subtracao: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo numero da subtracao: ");
				num2 = sc.nextDouble();
				resultado = Calculadora.sub(num1, num2);
				System.out.printf("Subtracao de %.2f - %.2f = %.2f", num1, num2, resultado);
				break;

			case 3:
				System.out.print("Digite o primeiro numero da multiplicacao: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo numero da multiplicacao: ");
				num2 = sc.nextDouble();
				resultado = Calculadora.mult(num1, num2);
				System.out.printf("Multiplicacao de %.2f * %.2f = %.2f", num1, num2, resultado);
				break;

			case 4:
				System.out.print("Digite o primeiro numero da multiplicacao: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo numero da multiplicacao: ");
				num2 = sc.nextDouble();
				if (num2 == 0) {
					System.out.println("Nao eh possivel efetuar uma divisao por ZERO (0)");
				} else {
					resultado = Calculadora.div(num1, num2);
					System.out.printf("Divisao de %.2f / %.2f = %.2f", num1, num2, resultado);
				}
				break;

			}
		}

		else if (calculadora == 2) {
			System.out.println("Bem-vindo a calculadora cientifica!");
			System.out.println("Digite 1 para potencia, 2 para raiz quadrada e 3 para logaritmo.");
			System.out.println();
			escolha = sc.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.print("Digite a base da potencia: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o expoente da potencia: ");
				num2 = sc.nextDouble();
				resultado = Calculadora.pot(num1, num2);
				System.out.printf("Potencia de base %.2f e expoente %.2f = %.2f", num1, num2, resultado);
				break;
				
			case 2:
				System.out.print("Digite o numero da raiz quadrada: ");
				num1 = sc.nextDouble();
				resultado = Calculadora.root(num1);
				System.out.printf("Raiz quadrada de %.2f = %.2f", num1, resultado);
				break;
				
			case 3:
				System.out.print("Digite o numero do logaritmo: ");
				num1 = sc.nextDouble();
				resultado = Calculadora.log(num1);
				System.out.printf("Logatirmo de %.2f = %.2f", num1, resultado);
				break;
			}
		}

		else {
			System.out.println("Escolha Invalida!");
		}

		sc.close();
	}
}
