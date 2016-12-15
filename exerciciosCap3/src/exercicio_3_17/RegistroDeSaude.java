package exercicio_3_17;

public class RegistroDeSaude 
{
	private String nome;  // variável de instância que armazena o nome
	private String sobrenome; // variável de instância que armazena o sobrenome
	private String sexo; // variável de instância que armazena o sexo
	private FrequenciaCardiaca freqCard; // variável de instância que armazena o frequência cardiaca
	private IMC imc; // variável de instância que armazena o imc
	
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
	} // fim do método getNome
	
	// configura ou altera o valor do campo nome
	public void setNome( String regisSauNome )
	{
		nome = regisSauNome;
	} // fim do método setNome
	
	// retorna o valor do campo sobrenome
	public String getSobreNome()
	{
		return sobrenome;
	} // fim do método getSobreNome
	
	// configura ou altera o valor do campo sobrenome
	public void setSobreNome( String regisSauSobrenome )
	{
		sobrenome = regisSauSobrenome;
	} // fim do método setSobreNome
	
	// retorna o valor do campo sexo
	public String getSexo()
	{
		return sexo;
	} // fim do método getSexo
	
	// configura ou altera o valor do campo sexo
	public void setSexo( String regisSauSex )
	{
		sexo = regisSauSex;
	} // fim do método setSexo
	
	// configura ou altera o valor do campo freqCard
	public void setFrequenciaCardiaca( FrequenciaCardiaca regisSauFreqCard )
	{
		freqCard = regisSauFreqCard;
	} // fim do método setFrequenciaCardiaca
	
	// retorna o valor do campo sobrenome
	public FrequenciaCardiaca getFrequenciaCardiaca()
	{
		return freqCard;
	} // fim do método getFrequenciaCardiaca
	
	// configura ou altera o valor do campo imc
	public void setIMC( IMC regisSauImc )
	{
		imc = regisSauImc;
	} // fim do método setIMC
	
	// retorna o valor do campo imc
	public IMC getIMC()
	{
		return imc;
	} // fim do método getIMC
}
