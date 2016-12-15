package exercicio_3_12;

/*
 * 3.12 Modifique a classe Account para fornecer um m�todo chamado debit 
 * que retira dinheiro de uma Account. Assegure que a quantidade de d�bito
 *  n�o exceda o saldo de Account. Se exceder, o saldo deve ser deixado 
 *  inalterado e o m�todo deve imprimir uma mensagem que indica 
 *  �Debit amount exceeded account balance�. Modifique a classe AccountTest 
 *  para testar o m�todo debit.
 */

public class Account 
{
	private double balance; // vari�vel de inst�ncia que armazena o saldo
	
	// construtor
	public Account( double initialBalance )
	{
		// valida que initialBalance � maior que 0.0:
		// se n�o, o saldo � inicializado com o valor pad�o 0.0
		if ( initialBalance > 0.0 ) 
		{
			balance = initialBalance;
		}
	} // fim do construtor Account
	
	// credita uma quantia � conta
	public void credit( double amount )
	{
		balance = balance + amount; // adiciona quantia ao saldo
	} // fim do m�todo credit
	
	// debita uma quantia da conta
	public void debit( double amount )
	{
		if( balance >= amount ) 
		{
			balance = balance - amount; // subtrai quantia do saldo
		}
		else
		{
			System.out.println( "Debit amount exceeded account balance" );
		}
	} // fim do m�todo debit
	
	// retorna o saldo da conta
	public double getBalance()
	{
		return balance; // fornece o valor de saldo ao m�todo chamador
	} // fim do m�todo getBalance
} // fim da classe Account