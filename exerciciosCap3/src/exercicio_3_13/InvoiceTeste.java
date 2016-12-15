package exercicio_3_13;

// testa a classe Invoice e apresenta resultados no console

public class InvoiceTeste 
{

	public static void main( String[] args ) 
	{
		Invoice obj1 = new Invoice( "0001", "pessoal", 50, 1500 );  // cria um objeto Invoice
		Invoice obj2 = new Invoice( "0002", "RH", 1, 1000 );  // cria um objeto Invoice
		Invoice obj3 = new Invoice( "0003", "TI", -7, -1000 );  // cria um objeto com valores invalidos Invoice
		Invoice obj4 = new Invoice( "0004", "TI2", -7, 1000 );  // cria um objeto com valor inválido de quantidade Invoice
		Invoice obj5 = new Invoice( "0005", "TI3", 7, -1000 );  // cria um objeto com valor inválido de preço Invoice
		System.out.printf( "Numero: %s\nDescricao: %s\nQuantidade: %d\nPreco: %.2f\nValor da Fatura: %.2f\n\n", 
				obj1.getNumero(),
				obj1.getDescricao(),
				obj1.getQuantidade(),
				obj1.getPreco(),
				obj1.getInvoiceAmount());
		System.out.printf( "Numero: %s\nDescricao: %s\nQuantidade: %d\nPreco: %.2f\nValor da Fatura: %.2f\n\n", 
				obj2.getNumero(),
				obj2.getDescricao(),
				obj2.getQuantidade(),
				obj2.getPreco(),
				obj2.getInvoiceAmount());
		System.out.printf( "Numero: %s\nDescricao: %s\nQuantidade: %d\nPreco: %.2f\nValor da Fatura: %.2f\n\n", 
				obj3.getNumero(),
				obj3.getDescricao(),
				obj3.getQuantidade(),
				obj3.getPreco(),
				obj3.getInvoiceAmount());
		System.out.printf( "Numero: %s\nDescricao: %s\nQuantidade: %d\nPreco: %.2f\nValor da Fatura: %.2f\n\n", 
				obj4.getNumero(),
				obj4.getDescricao(),
				obj4.getQuantidade(),
				obj4.getPreco(),
				obj4.getInvoiceAmount());
		System.out.printf( "Numero: %s\nDescricao: %s\nQuantidade: %d\nPreco: %.2f\nValor da Fatura: %.2f\n\n", 
				obj5.getNumero(),
				obj5.getDescricao(),
				obj5.getQuantidade(),
				obj5.getPreco(),
				obj5.getInvoiceAmount());
	} // fim do método main
}  // fim da classe InvoiceTeste