package inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;

		int maxSize = -1;

		System.out.println("Insira o número de produtos que gostaria de adicionar");

		try {
			do {
				System.out.print("Insira 0 (zero) se não quiser adicionar produtos: ");
				maxSize = sc.nextInt();

				if (maxSize < 0) {
					System.out.println("Valor incorreto inserido");
				} else if (maxSize == 0) {
					System.out.println("Não há produtos!");
				} else {

					Produto[] produtos = new Produto[maxSize];

					for (int i = 0; i < produtos.length; i++) {

						// sc.close(); -- IllegalStateException

						System.out.print("[ PRODUTO - " + (i + 1) + " ]\n");

						System.out.print("Número do produto: ");
						tempNumber = sc.nextInt();

						System.out.print("Nome: ");
						tempName = sc.next();

						System.out.print("Quantidade: ");
						tempQty = sc.nextInt();

						System.out.print("Preço: R$ ");
						tempPrice = sc.nextDouble();

						produtos[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);

					}
					// mostrar os produtos inseridos anteriormente.
					for (Produto produto : produtos) {
						System.out.println(produto);
					}
				}
			} while (maxSize < 0);
		} catch (InputMismatchException e) {
			System.out.println("Tipo incorreto de dados inserido!");
			e.printStackTrace();
			sc.close();
		}

	}
}
