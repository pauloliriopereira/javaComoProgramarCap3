package exrcicio_3_11;
/*
 * 3.11 Modifique a classe GradeBook como a seguir:
 * Inclua uma variável de instância String que representa o nome do instrutor do curso.
 * Forneça um método set para alterar o nome do instrutor e um método get para recuperá-lo.
 * Modifique o construtor para especificar dois parâmetros - uma para o nome do curso e um para o nome do instrutor.
 * Modifique o método displayMessage para gerar saída da mensagem de boas-vindas e do nome do curso, seguido por “This course is presented by:” e 
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
	
	// método para configurar o nome do curso
	public void setCourseName( String name )
	{
		courseName = name; // armazena o nome do curso
	} // fim do método setCourseName
	
	// método para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName;
	} // fim do método getCourseName
	
	// método para configurar o nome do instrutor
	public void setNomeInstrutor( String instrutor )
	{
		nomeInstrutor = instrutor; // armazena o nome do curso
	} // fim do método setNomeInstrutor
	
	// método para recuperar o nome do instrutor
	public String getNomeInstrutor()
	{
		return nomeInstrutor;
	} // fim do método getNomeInstrutor
	
	// exibe uma mensagem de boas-vindas para o usuário GradeBook
	public void displayMessage()
	{
		// essa instrução chama getCourseName para obter o
		// nome do curso que esse GradeBook representa
		System.out.printf( "Welcome to the GradeBook for\n%s!\n", getCourseName() );
		System.out.printf( "This course is presented by:\n%s.\n", getNomeInstrutor() );
	} // fim do método displayMessage
}