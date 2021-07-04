package inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		// Variável que irá solicitar entrada de dados via teclado
		Scanner in = new Scanner(System.in);

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
				maxSize = in.nextInt();
				
				if (maxSize < 0) {
					System.out.println("Valor inválido!");
				} else if (maxSize > 0) {
					do {
						System.out.println("[Produto nº " + maxSize + "]");
						System.out.print("Número/Código do produto: ");
						tempNumber = in.nextInt();
						System.out.print("Nome do produto: ");
						tempName = in.next();
						System.out.print("Quantidade: ");
						tempQty = in.nextInt();
						System.out.print("Valor: R$ ");
						tempPrice = in.nextDouble();
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
				in.close();
				break;
			}
		} while (maxSize < 0);
		System.out.println("Fim do programa!");
	}

}
