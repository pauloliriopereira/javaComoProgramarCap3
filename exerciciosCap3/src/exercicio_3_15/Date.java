package exercicio_3_15;

/*
 * 3.15 Crie uma classe chamada Date que inclua tr�s vari�veis de inst�ncia - m�s(tipo int), 
 * dia(tipo int) e ano(tipo int). Forne�a um construtor que inicializa as tr�s vari�veis de 
 * inst�ncia e suponha que os valores fornecidos estejam corretos. Forne�a um m�todo set e 
 * um get para cada vari�vel de inst�ncia. Forne�a um m�todo displayDate que exibe o m�s, 
 * o dia e o ano separados por barras normais(/). Escreva um aplicativo de teste chamado
 *  DateTest que demonstra as capacidades da classe Date.
 */

public class Date 
{
	private int dia;  // vari�vel de inst�ncia que armazena o dia
	private int mes; // vari�vel de inst�ncia que armazena o mes
	private int ano; // vari�vel de inst�ncia que armazena o ano
	
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
	} // fim do m�todo getDia
	
	// configura ou altera o valor do campo dia
	public void setDia( int dateDia )
	{
		dia = dateDia;
	} // fim do m�todo setDia
	
	// retorna o valor do campo mes
	public int getMes()
	{
		return mes;
	} // fim do m�todo getMes
	
	// configura ou altera o valor do campo mes
	public void setMes( int dateMes )
	{
		mes = dateMes;
	} // fim do m�todo setMes
	
	// retorna o valor do campo ano
	public int getAno()
	{
		return ano;
	} // fim do m�todo getAno
	
	// configura ou altera o valor do campo ano
	public void setAno( int dateAno )
	{
		ano = dateAno;
	} // fim do m�todo setAno
	
	// visualiza o valor de data do objeto Date
	public String displayDate()
	{
		return getDia() + "/" + getMes() + "/" +getAno();
	} // fim do m�todo displayDate
}