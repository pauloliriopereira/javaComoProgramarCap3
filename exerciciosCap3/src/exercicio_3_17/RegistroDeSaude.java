package exercicio_3_17;

public class RegistroDeSaude 
{
	private String nome;  // vari�vel de inst�ncia que armazena o nome
	private String sobrenome; // vari�vel de inst�ncia que armazena o sobrenome
	private String sexo; // vari�vel de inst�ncia que armazena o sexo
	private FrequenciaCardiaca freqCard; // vari�vel de inst�ncia que armazena o frequ�ncia cardiaca
	private IMC imc; // vari�vel de inst�ncia que armazena o imc
	
	// construtor
	public RegistroDeSaude( String regisSauNome, String regisSauSobrenome, String regisSauSex, 
			FrequenciaCardiaca regisSauFreqCard, IMC regisSauImc )
	{
		nome = regisSauNome;
		sobrenome = regisSauSobrenome;
		sexo = regisSauSex;
		freqCard = regisSauFreqCard;
		imc = regisSauImc;
	} // fim do construtor
	
	// retorna o valor do campo nome
	public String getNome()
	{
		return nome;
	} // fim do m�todo getNome
	
	// configura ou altera o valor do campo nome
	public void setNome( String regisSauNome )
	{
		nome = regisSauNome;
	} // fim do m�todo setNome
	
	// retorna o valor do campo sobrenome
	public String getSobreNome()
	{
		return sobrenome;
	} // fim do m�todo getSobreNome
	
	// configura ou altera o valor do campo sobrenome
	public void setSobreNome( String regisSauSobrenome )
	{
		sobrenome = regisSauSobrenome;
	} // fim do m�todo setSobreNome
	
	// retorna o valor do campo sexo
	public String getSexo()
	{
		return sexo;
	} // fim do m�todo getSexo
	
	// configura ou altera o valor do campo sexo
	public void setSexo( String regisSauSex )
	{
		sexo = regisSauSex;
	} // fim do m�todo setSexo
	
	// configura ou altera o valor do campo freqCard
	public void setFrequenciaCardiaca( FrequenciaCardiaca regisSauFreqCard )
	{
		freqCard = regisSauFreqCard;
	} // fim do m�todo setFrequenciaCardiaca
	
	// retorna o valor do campo sobrenome
	public FrequenciaCardiaca getFrequenciaCardiaca()
	{
		return freqCard;
	} // fim do m�todo getFrequenciaCardiaca
	
	// configura ou altera o valor do campo imc
	public void setIMC( IMC regisSauImc )
	{
		imc = regisSauImc;
	} // fim do m�todo setIMC
	
	// retorna o valor do campo imc
	public IMC getIMC()
	{
		return imc;
	} // fim do m�todo getIMC
}
