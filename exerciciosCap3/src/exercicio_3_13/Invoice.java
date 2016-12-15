package exercicio_3_13;
/*
 * 3.13 Crie uma classe chamada Invoice para que uma loja de suprimentos de inform�tica
 * possa utiliz�-la para representar uma fatura de um item vendido na loja. Uma Invoice
 * (fatura) deve incluir quatro partes das informa��es como vari�veis de inst�ncia - 
 * o n�mero (tipo String), a descri��o (tipo String), a quantidade comprada de um item
 * (tipo int) e o pre�o por item (double). Sua classe deve ter um construtor que
 * inicializa as quatro vari�veis de inst�ncia. Forne�a um m�todo set e um get para
 * cada vari�vel de inst�ncia. Al�m disso, forne�a um m�todo chamado getInvoiceAmount
 * que calcula a quantidade de fatura(isto �, multiplica a quantidade pelo pre�o por 
 * item), e depois retorna a quantidade como um valor double. Se a quantidade n�o for 
 * positiva, ela deve ser configurada como 0. Se o pre�o por item n�o for positivo,
 * ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest
 * que demonstra as capacidades da class Invoice.
*/

public class Invoice 
{
	
	private String numero; // vari�vel de inst�ncia que armazena o n�mero
	private String descricao; // vari�vel de inst�ncia que armazena a descri��o
	private int quantidade; // vari�vel de inst�ncia que armazena a quantidade
	private double preco; // vari�vel de inst�ncia que armazena o pre�o
	
	// construtor
	public Invoice( String num, String desc, int qtd, double prec )
	{
		numero = num;
		descricao = desc;
		
		// valida os valores preco e quantidade s�o maiores que zero
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
	} // fim do m�todo getNumero
	
	// altera o campo numero da fatura
	public void setNumero( String numero )
	{
		this.numero = numero;
	} // fim do m�todo setNumero
	
	// retorna a descri��o da fatura
	public String getDescricao() 
	{
		return descricao;
	} // fim do m�todo getDescricao
	
	// altera o campo descri��o da fatura
	public void setDescricao( String descricao ) 
	{
		this.descricao = descricao;
	} // fim do m�todo setDescricao
	
	// retorna a quantidade da fatura
	public int getQuantidade() 
	{
		return quantidade;
	} // fim do m�todo getQuantidade
	
	// altera o campo quantidade da fatura
	public void setQuantidade( int quantidade ) 
	{
		this.quantidade = quantidade;
	} // fim do m�todo setQuantidade
	
	// retorna o pre�o da fatura
	public double getPreco()
	{
		return preco;
	} // fim do m�todo getPreco
	
	// altera o campo preco da fatura
	public void setPreco( double preco ) 
	{
		this.preco = preco;
	} // fim do m�todo setPreco
	
	// retorna o valor total da fatura
	public double getInvoiceAmount()
	{
		return quantidade * preco;
	} // fim do m�todo getInvoiceAmount
} // fim da classe Invoice 