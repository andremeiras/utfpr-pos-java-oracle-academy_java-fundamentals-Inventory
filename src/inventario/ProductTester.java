package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		Produto cdGreatestHits = new Produto();
		cdGreatestHits.setNumeroItem(1);
		cdGreatestHits.setNomeProduto("Greatest Hits");
		cdGreatestHits.setQuantidadeEstoque(25);
		cdGreatestHits.setPrecoUnitario(9.99);

		System.out.println(cdGreatestHits);

		Produto caderno = new Produto();
		caderno.setNumeroItem(2);
		caderno.setNomeProduto("Caderno de caligrafia");
		caderno.setQuantidadeEstoque(32);
		caderno.setPrecoUnitario(15.50);

		System.out.println(caderno);

		Produto dvdBeatles = new Produto(3, "Beatles - Live in New York", 5, 25.50);
		System.out.println(dvdBeatles);

		Produto cdPinkFloyd = new Produto(4, "The darkside of the moon", 100, 4.50);
		System.out.println(cdPinkFloyd);

		Produto cdLinux = new Produto(4, "CD Linux Debian", 20, 1.00);
		System.out.println(cdLinux);

		Produto cdWindows = new Produto(4, "CD Windows 10", 85, 250.49);
		System.out.println(cdWindows);

	}

}
