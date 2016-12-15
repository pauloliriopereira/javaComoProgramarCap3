package exercicio_3_13;
/*
 * 3.13 Crie uma classe chamada Invoice para que uma loja de suprimentos de informática
 * possa utilizá-la para representar uma fatura de um item vendido na loja. Uma Invoice
 * (fatura) deve incluir quatro partes das informações como variáveis de instância - 
 * o número (tipo String), a descrição (tipo String), a quantidade comprada de um item
 * (tipo int) e o preço por item (double). Sua classe deve ter um construtor que
 * inicializa as quatro variáveis de instância. Forneça um método set e um get para
 * cada variável de instância. Além disso, forneça um método chamado getInvoiceAmount
 * que calcula a quantidade de fatura(isto é, multiplica a quantidade pelo preço por 
 * item), e depois retorna a quantidade como um valor double. Se a quantidade não for 
 * positiva, ela deve ser configurada como 0. Se o preço por item não for positivo,
 * ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest
 * que demonstra as capacidades da class Invoice.
*/

public class Invoice 
{
	
	private String numero; // variável de instância que armazena o número
	private String descricao; // variável de instância que armazena a descrição
	private int quantidade; // variável de instância que armazena a quantidade
	private double preco; // variável de instância que armazena o preço
	
	// construtor
	public Invoice( String num, String desc, int qtd, double prec )
	{
		numero = num;
		descricao = desc;
		
		// valida os valores preco e quantidade são maiores que zero
		if( qtd > 0 )
		{
			quantidade = qtd;
		}
		
		if( prec >  0.0 )
		{
			preco = prec;
		}
	} // fim do construtor Invoice
	
	// retorna o numero da fatura
	public String getNumero()
	{
		return numero;
	} // fim do método getNumero
	
	// altera o campo numero da fatura
	public void setNumero( String numero )
	{
		this.numero = numero;
	} // fim do método setNumero
	
	// retorna a descrição da fatura
	public String getDescricao() 
	{
		return descricao;
	} // fim do método getDescricao
	
	// altera o campo descrição da fatura
	public void setDescricao( String descricao ) 
	{
		this.descricao = descricao;
	} // fim do método setDescricao
	
	// retorna a quantidade da fatura
	public int getQuantidade() 
	{
		return quantidade;
	} // fim do método getQuantidade
	
	// altera o campo quantidade da fatura
	public void setQuantidade( int quantidade ) 
	{
		this.quantidade = quantidade;
	} // fim do método setQuantidade
	
	// retorna o preço da fatura
	public double getPreco()
	{
		return preco;
	} // fim do método getPreco
	
	// altera o campo preco da fatura
	public void setPreco( double preco ) 
	{
		this.preco = preco;
	} // fim do método setPreco
	
	// retorna o valor total da fatura
	public double getInvoiceAmount()
	{
		return quantidade * preco;
	} // fim do método getInvoiceAmount
} // fim da classe Invoice 