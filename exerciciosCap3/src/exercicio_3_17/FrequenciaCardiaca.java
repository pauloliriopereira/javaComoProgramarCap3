package exercicio_3_17;

public class FrequenciaCardiaca 
{
	private Date dataDeNascimento; // vari�vel de inst�ncia que armazena o data de nascimento
	
	// contrutor
	public FrequenciaCardiaca( Date freqCardData )
	{
		dataDeNascimento = freqCardData;
	} // fim do construtor
	
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