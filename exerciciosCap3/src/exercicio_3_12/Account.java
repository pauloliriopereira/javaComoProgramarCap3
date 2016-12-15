package exercicio_3_12;

/*
 * 3.12 Modifique a classe Account para fornecer um método chamado debit 
 * que retira dinheiro de uma Account. Assegure que a quantidade de débito
 *  não exceda o saldo de Account. Se exceder, o saldo deve ser deixado 
 *  inalterado e o método deve imprimir uma mensagem que indica 
 *  “Debit amount exceeded account balance”. Modifique a classe AccountTest 
 *  para testar o método debit.
 */

public class Account 
{
	private double balance; // variável de instância que armazena o saldo
	
	// construtor
	public Account( double initialBalance )
	{
		// valida que initialBalance é maior que 0.0:
		// se não, o saldo é inicializado com o valor padão 0.0
		if ( initialBalance > 0.0 ) 
		{
			balance = initialBalance;
		}
	} // fim do construtor Account
	
	// credita uma quantia á conta
	public void credit( double amount )
	{
		balance = balance + amount; // adiciona quantia ao saldo
	} // fim do método credit
	
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
	} // fim do método debit
	
	// retorna o saldo da conta
	public double getBalance()
	{
		return balance; // fornece o valor de saldo ao método chamador
	} // fim do método getBalance
} // fim da classe Account