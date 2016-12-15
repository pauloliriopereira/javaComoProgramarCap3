package exercicio_3_14;

/*
 * 3.14 Crie uma classe chamada Employee que inclua tr�s vari�veis de inst�ncia - um primeiro
 *  nome(tipo String), um sobrenome(tipo String) e um sal�rio mensal(double). Forne�a um 
 *  construtor que inicializa as tr�s vari�veis de inst�ncia. Forne�a um m�todo set e get 
 *  para cada vari�vel de inst�ncia. Se o sal�rio mensal n�o for positivo, n�o configure 
 *  seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstra as 
 *  capacidades da classe Employee. Crie dois objetos Employee e exiba o sal�rio anual de 
 *  �rio anual de cada objeto. Ent�o d� a cada Employee um aumento de 10% e exiba 
 *  novamente o sal�rio anual de cada Employee.
 */

public class Employee 
{
	private String nome;  // vari�vel de inst�ncia que armazena o nome
	private String sobreNome; // vari�vel de inst�ncia que armazena o sobrenome
	private double salario; // vari�vel de inst�ncia que armazena o sal�rio
	
	// construtor
	public Employee( String employeeNome, String employeeSobreNome, double employeeSalario )
	{
		nome = employeeNome;
		sobreNome = employeeSobreNome;
		
		// valida o valor de sal�rio
		if( employeeSalario > 0 )
		{
			salario = employeeSalario;
		}
	} // fim do construtor
	
	// retorna o valor do campo nome
	public String getNome()
	{
		return nome;
	} // fim do m�todo getNome
	
	// configura ou altera o valor do campo nome
	public void setNome( String employeeNome )
	{
		nome = employeeNome;
	} // fim do m�todo setNome
	
	// retorna o valor do campo sobreNome
	public String getSobreNome()
	{
		return sobreNome;
	} // fim do m�todo getSobreNome
	
	// configura ou altera o valor do campo nome
	public void setSobreNome( String employeeSobreNome )
	{
		sobreNome = employeeSobreNome;
	} // fim do m�todo setSobreNome
	
	// retorna o valor do campo sal�rio
	public double getSalario()
	{
		return salario;
	} // fim do m�todo getSalario
	
	// configura ou altera o valor do campo nome
	public void setSalario( double employeeSalario )
	{
		salario = employeeSalario;
	} // fim do m�todo setSalario
	
}