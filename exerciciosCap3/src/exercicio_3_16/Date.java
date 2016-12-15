package exercicio_3_16;

public class Date 
{
	private int dia;  // variável de instância que armazena o dia
	private int mes; // variável de instância que armazena o mes
	private int ano; // variável de instância que armazena o ano
	
	// construtor
	public Date( int dateDia, int dateMes, int dateAno )
	{
		dia = dateDia;
		mes = dateMes;
		ano = dateAno;
	} // fim do construtor
	
	// retorna o valor do campo dia
	public int getDia()
	{
		return dia;
	} // fim do método getDia
	
	// configura ou altera o valor do campo dia
	public void setDia( int dateDia )
	{
		dia = dateDia;
	} // fim do método setDia
	
	// retorna o valor do campo mes
	public int getMes()
	{
		return mes;
	} // fim do método getMes
	
	// configura ou altera o valor do campo mes
	public void setMes( int dateMes )
	{
		mes = dateMes;
	} // fim do método setMes
	
	// retorna o valor do campo ano
	public int getAno()
	{
		return ano;
	} // fim do método getAno
	
	// configura ou altera o valor do campo ano
	public void setAno( int dateAno )
	{
		ano = dateAno;
	} // fim do método setAno
	
	// visualiza o valor de data do objeto Date
	public String displayDate()
	{
		return getDia() + "/" + getMes() + "/" +getAno();
	} // fim do método displayDate
}