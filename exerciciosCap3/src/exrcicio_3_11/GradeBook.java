package exrcicio_3_11;
/*
 * 3.11 Modifique a classe GradeBook como a seguir:
 * Inclua uma vari�vel de inst�ncia String que representa o nome do instrutor do curso.
 * Forne�a um m�todo set para alterar o nome do instrutor e um m�todo get para recuper�-lo.
 * Modifique o construtor para especificar dois par�metros - uma para o nome do curso e um para o nome do instrutor.
 * Modifique o m�todo displayMessage para gerar sa�da da mensagem de boas-vindas e do nome do curso, seguido por �This course is presented by:� e 
 * o nome do professor.
 */

public class GradeBook 
{
	private String courseName; // nome do curso para esse GradeBook
	private String nomeInstrutor; // nome do intrutor para esse GradeBook
	
	// o construtor inicializa courseName com o argumento String
	public GradeBook( String name, String instrutor )
	{
		courseName = name; // inicializa courseName
		nomeInstrutor = instrutor; // inicializa nomeInstrutor
	}  // fim do construtor
	
	// m�todo para configurar o nome do curso
	public void setCourseName( String name )
	{
		courseName = name; // armazena o nome do curso
	} // fim do m�todo setCourseName
	
	// m�todo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName;
	} // fim do m�todo getCourseName
	
	// m�todo para configurar o nome do instrutor
	public void setNomeInstrutor( String instrutor )
	{
		nomeInstrutor = instrutor; // armazena o nome do curso
	} // fim do m�todo setNomeInstrutor
	
	// m�todo para recuperar o nome do instrutor
	public String getNomeInstrutor()
	{
		return nomeInstrutor;
	} // fim do m�todo getNomeInstrutor
	
	// exibe uma mensagem de boas-vindas para o usu�rio GradeBook
	public void displayMessage()
	{
		// essa instru��o chama getCourseName para obter o
		// nome do curso que esse GradeBook representa
		System.out.printf( "Welcome to the GradeBook for\n%s!\n", getCourseName() );
		System.out.printf( "This course is presented by:\n%s.\n", getNomeInstrutor() );
	} // fim do m�todo displayMessage
}