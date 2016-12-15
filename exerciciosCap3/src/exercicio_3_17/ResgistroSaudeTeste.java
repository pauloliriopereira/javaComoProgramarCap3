package exercicio_3_17;

import java.util.Scanner;

import exercicio_3_17.Date;
import exercicio_3_17.FrequenciaCardiaca;

public class ResgistroSaudeTeste {

	public static void main(String[] args) 
	{
		// variáveis locais para construir o objeto req
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		String sexo;
		double altura;
		double peso;
		
		// capiturando entradas do usuário
		Scanner entrada = new Scanner( System.in );
		System.out.print( "Insira o seu nome: " );
		nome = entrada.nextLine();
				
		System.out.print( "Insira o seu sobrenome: " );
		sobrenome = entrada.nextLine();
		
		System.out.print( "Insira o seu sexo: " );
		sexo = entrada.nextLine();
		
		System.out.print( "Insira o sua altura: " );
		altura = entrada.nextDouble();
		
		System.out.print( "Insira o seu peso: " );
		peso = entrada.nextDouble();
		
		System.out.print( "Insira a data de nascimento: " );
		dia = entrada.nextInt();
		mes = entrada.nextInt();
		ano = entrada.nextInt();
				
		// criando uma instância de RegistroDeSaude
		RegistroDeSaude req = new RegistroDeSaude( nome, 
												   sobrenome, 
												   sexo, 
												   new FrequenciaCardiaca( new Date( dia, mes, ano ) ), 
												   new IMC( altura, peso ) );
				
		// imprimindo na tela os valores do objeto req
		System.out.printf( "\nREGISTRO DE SAUDE\n" );
		System.out.printf( "\nNome: %s %s\n", req.getNome(), req.getSobreNome() );
		System.out.printf( "Sexo: %s\n", req.getSexo() );
		System.out.printf( "Data de Nascimento: %s\n", req.getFrequenciaCardiaca().getDate().displayDate() );
		System.out.printf( "Altura: %.2f\n", req.getIMC().getAltura() );
		System.out.printf( "Peso: %.2f\n", req.getIMC().getPeso() );
		System.out.printf( "Idade: %d anos\n", req.getFrequenciaCardiaca().calculaIdade() );
		System.out.printf( "IMC: %.2f\n", req.getIMC().calculaIMC() );
		System.out.printf( "Freq. Card. Max: %d\n", req.getFrequenciaCardiaca().calculaFreqMax() );
		System.out.printf( "Freq. Card. Ideal: %.2f\n", req.getFrequenciaCardiaca().calculaFreqIdeal() );
		req.getIMC().tabelaIMC();
		
		entrada.close();

	}

}
