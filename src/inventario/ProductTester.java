package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		// Instância de um novo produto
		Produto cd = new Produto();

		// Setando valores para as variáveis do produto
		cd.setNumeroItem(1);
		cd.setNomeProduto("Greatest Hits");
		cd.setQuantidadeEstoque(25);
		cd.setPrecoUnitario(9.99);

		// Instância de um novo produto
		Produto caderno = new Produto();

		// Setando valores para as variáveis do produto
		caderno.setNumeroItem(2);
		caderno.setNomeProduto("Caderno de caligrafia");
		caderno.setQuantidadeEstoque(32);
		caderno.setPrecoUnitario(15.50);

		// Instanciando novos produtos com parâmetros passados no construtos
		Produto dvd = new Produto(3, "Beatles - Live in New York", 5, 25.50);
		Produto discoVinil = new Produto(4, "The darkside of the moon", 100, 4.50);
		Produto CDLinux = new Produto(5, "CD Linux Debian", 20, 1.00);
		Produto CDWindows = new Produto(6, "CD Windows 10", 85, 250.49);
		CDWindows.setAtivo(false); // setando o produto para "Descontinuado"

		// Variável que irá solicitar entrada de dados via teclado
		Scanner sc = new Scanner(System.in);

		// variáveis temporárias para receber os valores digitados do produto
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;

		/*
		 * CADASTRO p1
		 */
		System.out.println("[CADASTRO p1]");

		// Solicitando entrada de dados do usuário que irá armazenar em cada variável
		System.out.print("Digite o número do produto: ");
		tempNumber = sc.nextInt();

		System.out.print("Digite o nome do produto: ");
		tempName = sc.next();

		System.out.print("Digite a quantidade de produtos em estoque: ");
		tempQty = sc.nextInt();

		System.out.print("Digite o valor unitário do produto: ");
		tempPrice = sc.nextDouble();

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
		tempNumber = sc.nextInt();

		System.out.print("Digite o nome do produto: ");
		tempName = sc.next();

		System.out.print("Digite a quantidade de produtos em estoque: ");
		tempQty = sc.nextInt();

		System.out.print("Digite o valor unitário do produto: ");
		tempPrice = sc.nextDouble();

		sc.close();

		// Instancia de Produto passando os parâmetros digitados pelo usuário para o
		// construtor
		Produto p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);
		// FIM CADASTRO p2

		// saída dos valores do produto informado no console
		System.out.println();
		System.out.println(cd);
		System.out.println(dvd);
		System.out.println(discoVinil);
		System.out.println(CDLinux);
		System.out.println(CDWindows);
		System.out.println(p1);
		System.out.println(p2);
	}

}
