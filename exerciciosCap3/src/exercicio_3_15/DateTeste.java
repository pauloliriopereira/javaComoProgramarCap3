package exercicio_3_15;

// Classe de teste para Date. Criando objetos e testando funcionalidades.

public class DateTeste 
{
	public static void main(String[] args) 
	{
		// criando instâncias de Date
		Date date1 = new Date( 1, 3, 2015 );
		Date date2 = new Date( 5, 6, 2017 );
		
		System.out.println( "Datas" );
		System.out.printf( "Data1: %s\n\n", date1.displayDate() );
		System.out.printf( "Data2: %s\n\n", date2.displayDate() );
	}
}