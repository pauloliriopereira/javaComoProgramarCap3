package exercicio_3_17;

public class IMC 
{
	private double altura;
	private double peso;
	
	// construtor
	public IMC( double IMCAltura, double IMCPeso )
	{
		altura = IMCAltura;
		peso = IMCPeso;
	} // fim do contrutor
	
	// calcula o valor do imc apartir dos valores de altura e peso
	public double calculaIMC()
	{
		return peso / ( altura * altura );
	} // fim do metodo calculaIMC
	
	// retorna o valor do campo altura
	public double getAltura()
	{
		return altura;
	} // fim do método getAltura
	
	// configura ou altera o valor do campo altura
	public void setAltura( double IMCAltura )
	{
		altura = IMCAltura;
	} // fim do método setAltura
	
	// retorna o valor do campo peso
	public double getPeso()
	{
		return peso;
	} // fim do método getPeso
	
	// configura ou altera o valor do campo peso
	public void setPeso( double IMCPeso )
	{
		peso = IMCPeso;
	} // fim do método setPeso
	
	// imprime no console a tabela IMC
	public void tabelaIMC()
	{
		System.out.printf( "\n%s\n%s\n%s\n%s\n%s\n",
				"TABELA IMC",
				"Abaixo do peso:  menor que 18,5",
				"Normal:          entre 18,5 e 24,9",
				"Acima do peso:   entre 25 e 29,9",
				"Obeso:           maior ou igual 30" );
	} // fim do método tabelaIMC 
			
} // fim da classe IMC