package exrcicio_3_11;

// Construtor GradeBook utilizado para especificar o nome
// do curso na hora em que cada objeto GradeBook � criado.

public class GradeBookTest 
{
	// m�todo main indica a execu��o de programa
	public static void main( String[] args ) 
	{
		// cria objeto GradeBook
		GradeBook gradeBook1 = new GradeBook( 
			"CS101 bIntroduction to Java Programming",
			"Paulo L�rio" );
		GradeBook gradeBook2 = new GradeBook( 
			"CS102 Data Structures in Java",
			"Paulo L�rio de Oliveira Pereira" );
		
		// exibe valor inicial de courseName e nomeInstrutor para cada GradeBook
		System.out.printf( 
			"gradeBook1 course name is: %s\n",
			gradeBook1.getCourseName() );
		
		// exibe mensagem de boas-vindas
		gradeBook1.displayMessage();
		
		System.out.printf( 
				"gradeBook2 course name is: %s\n",
				gradeBook2.getCourseName() );
		
		// exibe mensagem de boas-vindas
		gradeBook2.displayMessage();
	}
}