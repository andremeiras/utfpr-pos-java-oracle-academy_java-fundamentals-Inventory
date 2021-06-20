package inventario;

public class Produto {

	// Declarações de campo de instância
	private int numeroItem;
	private String nomeProduto;
	private int quantidadeEstoque;
	private double precoUnitario;
	private boolean ativo = true;

	/*
	 * Construtor padrão que permitirá que o compilador inicialize os valores
	 * padrão. OBS: é necessário informar o construtor vazio quando tem mais de um
	 * construtor, caso contrário será obrigatório ao instanciar o objeto informar
	 * todos os parâmetros do construtor com parâmetros. Quando não informado
	 * explicitamente, o próprio compilador já entende que ele existe
	 */
	public Produto() {
	} // fim construtor padrão

	/*
	 * Sobrecarga do construtor com passagem de parâmetros para todos os
	 * campos/variáveis da classe
	 */
	public Produto(int numeroItem, String nomeProduto, int quantidadeEstoque, double precoUnitario) {
		this.numeroItem = numeroItem;
		this.nomeProduto = nomeProduto;
		this.quantidadeEstoque = quantidadeEstoque;
		this.precoUnitario = precoUnitario;
	} // fim construtor da classe com parâmetros

	// Métodos getters(acessores) & setters(mutadores)

	/*
	 * GET - retornam o valor da variável local (variável de classe)
	 */

	/*
	 * SET - atribuem um valor para a variável local através da passagem de
	 * parâmetro do método. O tipo de dado na passagem de parâmetro do método deve
	 * ser o mesmo tipo da variável local
	 */

	public int getNumeroItem() {
		return numeroItem;
	} // método acessor que retorna o valor da variável numeroItem

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	} // método mutador que atribui valor à variável numeroItem com o valor passado
		// por parâmetro do mesmo tipo da variável local

	public String getNomeProduto() {
		return nomeProduto;
	} // método acessor que retorna o valor da variável nomeProduto

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	} // método mutador que atribui valor à variável nomeProduto com o valor passado
		// por parâmetro do mesmo tipo da variável local

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	} // método acessor que retorna o valor da variável quantidadeEstoque

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	} // método mutador que atribui valor à variável quantidadeEstoque com o valor
		// passado por parâmetro do mesmo tipo da variável local

	public double getPrecoUnitario() {
		return precoUnitario;
	} // método acessor que retorna o valor da variável precoUnitario

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	} // método mutador que atribui valor à variável precoUnitario com o valor passado
		// por parâmetro do mesmo tipo da variável local

	public boolean isAtivo() {
		return ativo;
	} // método acessor para a variável booleana ativo

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	} // método mutador que irá atribuir o valor true ou false para a variável local

	// método para calcular o inventário do produto
	public double getInventoryValue() {
		return quantidadeEstoque * precoUnitario;
	}

	public String toString() {
		String descricaoProduto = "";

		// variável que irá guardar o resultado amigável do produto ativo/descontinuado
		String tempAtivo = "";

		// Informar de forma amigável no console se o produto está ativo/descontinuado
		if (this.ativo) {
			tempAtivo = "Ativo";
		} else {
			tempAtivo = "Descontinuado";
		}

		return descricaoProduto = "---------- INFORMAÇÕES DO PRODUTO -----------\n" + "Número do Item \t\t : "
				+ this.numeroItem + "\n" + "Nome \t\t\t : " + this.nomeProduto + "\n" + "Quantidade em estoque \t : "
				+ this.quantidadeEstoque + "\n" + "Preço \t\t\t : " + this.precoUnitario + "\n"
				+ "Valor do Estoque \t : " + getInventoryValue() + "\n"
				+ "Status do Produto \t : " + tempAtivo + "\n" + "---------------------------------------------" + "\n";
	}
}
