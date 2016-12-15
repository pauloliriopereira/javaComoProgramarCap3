package exercicio_3_16;

/*
 * 3.16 Crie uma classe chamada FrequenciaCardiaca. Os atributos da classe devem 
 * incluir o nome, sobrenome e data de nascimento(consistindo em atributos separados 
 * para o mês, dia e ano de nascimento). Sua classe deve ter um construtor que 
 * recebe esses dados como parâmetors. Para cada atributo forneça métodos set e
 * get. A classe também deve incluir um método que calcula e retorna a idade
 * da pessoa(em anos), um método que calcula e retorna a frequência cardíaca máxima 
 * da pessoa e um método que calcula e retorna a frequência cardíaca-alvo da pessoa.
 * Escreva um aplicativo Java que solicite as informações da pessoa, instancie um
 * objeto da classe FrequanciaCardiaca e imprime as informações a partir desse
 * objeto - incluindo o nome, sobrenome e data de nascimento da pessoa - calcule e
 * imprima a idade da pessoa(em anos), intervalo de frequência cardíaca máxima e 
 * frequência cardíaca-alvo.
 */

public class FrequenciaCardiaca 
{
	private String nome;  // variável de instância que armazena o nome
	private String sobrenome; // variável de instância que armazena o sobrenome
	private Date dataDeNascimento; // variável de instância que armazena o data de nascimento
	
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
	} // fim do método getNome
	
	// configura ou altera o valor do campo nome
	public void setNome( String freqCardNome )
	{
		nome = freqCardNome;
	} // fim do método setNome
	
	// retorna o valor do campo sobrenome
	public String getSobreNome()
	{
		return sobrenome;
	} // fim do método getSobreNome
	
	// configura ou altera o valor do campo sobrenome
	public void setSobreNome( String freqCardSobrenome )
	{
		sobrenome = freqCardSobrenome;
	} // fim do método setSobreNome
	
	// retorna o valor do campo data de nascimento
	public Date getDate()
	{
		return dataDeNascimento;
	} // fim do método getDate
	
	// configura ou altera o valor do campo sobrenome
	public void setDate( Date freqCardData )
	{
		dataDeNascimento = freqCardData;
	} // fim do método setDate
	
	// retorna a idade em anos
	public int calculaIdade()
	{
		return 2016 - dataDeNascimento.getAno();
	} // fim do método calculaIdade
	
	// retorna o valor da frequencia cardiaca máxima
	public int calculaFreqMax()
	{
		return 220 - calculaIdade();
	} // fim do método calculaIdade
	
	// retorna o valor ideal de frequencia cardiaca de acordo com a faixa etária
	public double calculaFreqIdeal()
	{
		return calculaFreqMax() * 0.75;
	} // fim do método calculaFreqIdeal
}