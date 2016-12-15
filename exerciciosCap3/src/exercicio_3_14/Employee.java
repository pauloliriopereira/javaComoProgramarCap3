package exercicio_3_14;

/*
 * 3.14 Crie uma classe chamada Employee que inclua três variáveis de instância - um primeiro
 *  nome(tipo String), um sobrenome(tipo String) e um salário mensal(double). Forneça um 
 *  construtor que inicializa as três variáveis de instância. Forneça um método set e get 
 *  para cada variável de instância. Se o salário mensal não for positivo, não configure 
 *  seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstra as 
 *  capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual de 
 *  ário anual de cada objeto. Então dê a cada Employee um aumento de 10% e exiba 
 *  novamente o salário anual de cada Employee.
 */

public class Employee 
{
	private String nome;  // variável de instância que armazena o nome
	private String sobreNome; // variável de instância que armazena o sobrenome
	private double salario; // variável de instância que armazena o salário
	
	// construtor
	public Employee( String employeeNome, String employeeSobreNome, double employeeSalario )
	{
		nome = employeeNome;
		sobreNome = employeeSobreNome;
		
		// valida o valor de salário
		if( employeeSalario > 0 )
		{
			salario = employeeSalario;
		}
	} // fim do construtor
	
	// retorna o valor do campo nome
	public String getNome()
	{
		return nome;
	} // fim do método getNome
	
	// configura ou altera o valor do campo nome
	public void setNome( String employeeNome )
	{
		nome = employeeNome;
	} // fim do método setNome
	
	// retorna o valor do campo sobreNome
	public String getSobreNome()
	{
		return sobreNome;
	} // fim do método getSobreNome
	
	// configura ou altera o valor do campo nome
	public void setSobreNome( String employeeSobreNome )
	{
		sobreNome = employeeSobreNome;
	} // fim do método setSobreNome
	
	// retorna o valor do campo salário
	public double getSalario()
	{
		return salario;
	} // fim do método getSalario
	
	// configura ou altera o valor do campo nome
	public void setSalario( double employeeSalario )
	{
		salario = employeeSalario;
	} // fim do método setSalario
	
}