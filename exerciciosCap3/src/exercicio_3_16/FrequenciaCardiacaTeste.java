package exercicio_3_16;

import java.util.Scanner;

public class FrequenciaCardiacaTeste {

	public static void main(String[] args) 
	{
		// variáveis locais para construir o objeto freq1
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		
		// capiturando entradas do usuário
		Scanner entrada = new Scanner( System.in );
		System.out.print( "Insira o seu nome: " );
		nome = entrada.nextLine();
		
		System.out.print( "Insira o seu sobrenome: " );
		sobrenome = entrada.nextLine();
		
		System.out.print( "Insira a data de nascimento: " );
		dia = entrada.nextInt();
		mes = entrada.nextInt();
		ano = entrada.nextInt();
		
		// criando uma instância de FrequenciaCardiaca
		FrequenciaCardiaca freq1 = new FrequenciaCardiaca( nome, sobrenome, new Date( dia, mes, ano ) );
		
		// imprimindo na tela os valores do objeto freq1
		System.out.printf( "\nCalculo de Frequencia Cardiaca\n" );
		System.out.printf( "\nNome: %s %s\n", freq1.getNome(), freq1.getSobreNome() );
		System.out.printf( "Idade: %d anos\n", freq1.calculaIdade() );
		System.out.printf( "Freq. Card. Max: %d\n", freq1.calculaFreqMax() );
		System.out.printf( "Freq. Card. Ideal: %.2f\n", freq1.calculaFreqIdeal() );

		entrada.close();
	}

}
