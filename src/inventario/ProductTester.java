package inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		// Variável que irá solicitar entrada de dados via teclado
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Scanner scDou = new Scanner(System.in);

		int maxSize = -1;

		// variáveis temporárias para receber os valores digitados do produto
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		do {
			try {
				System.out.println("Insira o número de produtos que gostaria de adicionar");
				System.out.println("Insira 0 (zero) se não quiser adicionar produtos:");
				maxSize = scInt.nextInt();

				if (maxSize < 0) {
					System.out.println("Valor inválido!");
				} else if (maxSize > 0) {
					do {
						System.out.print("[Produto nº " + maxSize + "]\n");
						System.out.print("Número/Código do produto: ");
						tempNumber = scInt.nextInt();
						System.out.print("Nome do produto: ");
						tempName = scStr.nextLine();
						System.out.print("Quantidade: ");
						tempQty = scInt.nextInt();
						System.out.print("Valor: R$ ");
						tempPrice = scDou.nextDouble();
						System.out.println();
						maxSize--;
					} while (maxSize > 0);
				} else if (maxSize == 0) {
					System.out.println("Não há produtos!");
				} else {
					System.out.println("Saindo do programa!");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Tipo incorreto de dados inserido!");

				break;
			}
		} while (maxSize < 0);
		System.out.println("Fim do programa!");
	}

}
