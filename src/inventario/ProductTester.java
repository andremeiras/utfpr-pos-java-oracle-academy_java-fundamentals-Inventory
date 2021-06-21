package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		// Variável que irá solicitar entrada de dados via teclado
		Scanner in = new Scanner(System.in);

		int maxSize = 0;

		// variáveis temporárias para receber os valores digitados do produto
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;

		do {
			try {
				System.out.println(
						"Insira o número de produtos que gostaria de adicionar\nInsira 0 (zero) se não quiser adicionar produtos:");
				maxSize = in.nextInt();
				if (maxSize < 0) {
					System.out.println("Valor incorreto inserido.");
				} else {
					for (int i = 0; i <= maxSize; i++) {
						System.out.print("Digite o número do produto: ");
						tempNumber = in.nextInt();

						System.out.print("Digite o nome do produto: ");
						tempName = in.next();

						System.out.print("Digite a quantidade de produtos em estoque: ");
						tempQty = in.nextInt();

						System.out.print("Digite o valor unitário do produto: ");
						tempPrice = in.nextDouble();
						i++;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (maxSize != 0);

		/*
		 * CADASTRO p1
		 */
		System.out.println("[CADASTRO p1]");

		// Solicitando entrada de dados do usuário que irá armazenar em cada variável
		System.out.print("Digite o número do produto: ");
		tempNumber = in.nextInt();

		System.out.print("Digite o nome do produto: ");
		tempName = in.next();

		System.out.print("Digite a quantidade de produtos em estoque: ");
		tempQty = in.nextInt();

		System.out.print("Digite o valor unitário do produto: ");
		tempPrice = in.nextDouble();

		// Instancia de Produto passando os parâmetros digitados pelo usuário para o
		// construtor
		Produto p1 = new Produto(tempNumber, tempName, tempQty, tempPrice);
		System.out.println();
		// FIM CADASTRO p1

		/*
		 * CADASTRO p2
		 */
		System.out.println("[CADASTRO p2]");
		// Solicitando entrada de dados do usuário que irá armazenar em cada variável
		System.out.print("Digite o número do produto: ");
		tempNumber = in.nextInt();

		System.out.print("Digite o nome do produto: ");
		tempName = in.next();

		System.out.print("Digite a quantidade de produtos em estoque: ");
		tempQty = in.nextInt();

		System.out.print("Digite o valor unitário do produto: ");
		tempPrice = in.nextDouble();

		in.close();

		// Instancia de Produto passando os parâmetros digitados pelo usuário para o
		// construtor
		Produto p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);
		// FIM CADASTRO p2

	}

}
