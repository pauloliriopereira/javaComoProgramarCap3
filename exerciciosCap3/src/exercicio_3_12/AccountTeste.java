package exercicio_3_12;

// entrada e saída de números de ponto flutuante com objetos Account.
import java.util.Scanner;

public class AccountTeste 
{
	// método main inicia a execução do aplicativo Java
	public static void main( String[] args ) 
	{
		Account account1 = new Account( 50.00 ); // cria o objeto Account
		Account account2 = new Account( -7.53 ); // cria o objeto Account
		
		// exibe o saldo inicial de cada objeto
		System.out.printf( "account balance: $%.2f \n",
				account1.getBalance() );
		System.out.printf( "account balance: $%.2f \n\n",
				account2.getBalance() );
		
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		double depositAmount; // quantia de depósito lida a partir do usuário
		
		System.out.print( "Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // entrada do usuário
		System.out.printf( "\nadding %.2f to account1 balance\n\n",
				depositAmount );
		account1.credit( depositAmount ); // adiciona o saldo de account1
		
		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f \n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n",
				account2.getBalance() );
		
		//prompt
		System.out.print( "Enter deposit amount for account2: " ); // prompt
		depositAmount = input.nextDouble(); // entrada do usuário
		System.out.printf( "\nadding %.2f to account2 balance\n\n",
				depositAmount );
		account2.credit( depositAmount ); // adiciona ao saldo de account2
		
		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f \n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n",
				account2.getBalance() );
				
		double debitAmount; // quantia de debitada lida a partir do usuário
				
		System.out.print( "Enter debit amount for account1: " ); // prompt
		debitAmount = input.nextDouble(); // entrada do usuário
		System.out.printf( "\nadding %.2f to account1 balance\n\n",
				debitAmount );
		account1.debit( debitAmount ); // adiciona o saldo de account1
				
		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f \n",
			account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n",
			account2.getBalance() );
				
		//prompt
		System.out.print( "Enter debit amount for account2: " );
		debitAmount = input.nextDouble(); // entrada do usuário
		System.out.printf( "\nadding %.2f to account2 balance\n\n",
				debitAmount );
		account2.debit( debitAmount ); // debita ao saldo de account2
				
		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f \n",
			account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n",
			account2.getBalance() );
		
		input.close();
	}// fim do método main
} // fim da classe AccountTest