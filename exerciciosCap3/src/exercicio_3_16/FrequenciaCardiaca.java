package exercicio_3_16;

/*
 * 3.16 Crie uma classe chamada FrequenciaCardiaca. Os atributos da classe devem 
 * incluir o nome, sobrenome e data de nascimento(consistindo em atributos separados 
 * para o m�s, dia e ano de nascimento). Sua classe deve ter um construtor que 
 * recebe esses dados como par�metors. Para cada atributo forne�a m�todos set e
 * get. A classe tamb�m deve incluir um m�todo que calcula e retorna a idade
 * da pessoa(em anos), um m�todo que calcula e retorna a frequ�ncia card�aca m�xima 
 * da pessoa e um m�todo que calcula e retorna a frequ�ncia card�aca-alvo da pessoa.
 * Escreva um aplicativo Java que solicite as informa��es da pessoa, instancie um
 * objeto da classe FrequanciaCardiaca e imprime as informa��es a partir desse
 * objeto - incluindo o nome, sobrenome e data de nascimento da pessoa - calcule e
 * imprima a idade da pessoa(em anos), intervalo de frequ�ncia card�aca m�xima e 
 * frequ�ncia card�aca-alvo.
 */

public class FrequenciaCardiaca 
{
	private String nome;  // vari�vel de inst�ncia que armazena o nome
	private String sobrenome; // vari�vel de inst�ncia que armazena o sobrenome
	private Date dataDeNascimento; // vari�vel de inst�ncia que armazena o data de nascimento
	
	// contrutor
	public FrequenciaCardiaca( String freqCardNome, String freqCardSobrenome, Date freqCardData )
	{
		nome = freqCardNome;
		sobrenome = freqCardSobrenome;
		dataDeNascimento = freqCardData;
	} // fim do construtor
	
	// retorna o valor do campo nome
	public String getNome()
	{
		return nome;
	} // fim do m�todo getNome
	
	// configura ou altera o valor do campo nome
	public void setNome( String freqCardNome )
	{
		nome = freqCardNome;
	} // fim do m�todo setNome
	
	// retorna o valor do campo sobrenome
	public String getSobreNome()
	{
		return sobrenome;
	} // fim do m�todo getSobreNome
	
	// configura ou altera o valor do campo sobrenome
	public void setSobreNome( String freqCardSobrenome )
	{
		sobrenome = freqCardSobrenome;
	} // fim do m�todo setSobreNome
	
	// retorna o valor do campo data de nascimento
	public Date getDate()
	{
		return dataDeNascimento;
	} // fim do m�todo getDate
	
	// configura ou altera o valor do campo sobrenome
	public void setDate( Date freqCardData )
	{
		dataDeNascimento = freqCardData;
	} // fim do m�todo setDate
	
	// retorna a idade em anos
	public int calculaIdade()
	{
		return 2016 - dataDeNascimento.getAno();
	} // fim do m�todo calculaIdade
	
	// retorna o valor da frequencia cardiaca m�xima
	public int calculaFreqMax()
	{
		return 220 - calculaIdade();
	} // fim do m�todo calculaIdade
	
	// retorna o valor ideal de frequencia cardiaca de acordo com a faixa et�ria
	public double calculaFreqIdeal()
	{
		return calculaFreqMax() * 0.75;
	} // fim do m�todo calculaFreqIdeal
}