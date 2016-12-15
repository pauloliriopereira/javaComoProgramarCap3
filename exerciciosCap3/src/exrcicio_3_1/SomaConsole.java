package exrcicio_3_1;

// Programa de adição de inteiros que exibi o resultado da soma na tela.

import javax.swing.JOptionPane;

public class SomaConsole
{
	// método principal inicia a execussão do programa
	public static void main( String[] args )
	{
		String number1; // primeira parcela
		String number2; // segunda parcela
		int sum;  // resultado da soma de number1 e number2
		String mensagem; // mostra o resultado da soma na tela
		
		number1 = JOptionPane.showInputDialog( "Primeira parcela: " ); //caixa de diálogo
		
		number2 = JOptionPane.showInputDialog( "Segunda parcela: " ); //caixa de diálogo
		
		sum = Integer.parseInt( number1 ) + Integer.parseInt( number2 );
		
		mensagem = String.format( "A soma e %d", sum );
		
		JOptionPane.showMessageDialog( null, mensagem );
	} // fim do método main
} // fim da classe Soma