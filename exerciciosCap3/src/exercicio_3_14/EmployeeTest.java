package exercicio_3_14;

// classe de teste de Employee

public class EmployeeTest 
{

	public static void main( String[] args ) 
	{
		// criando instâncias de Employee
		Employee employee1 = new Employee( "Paulo", "Lirio", 1500.00 );
		Employee employee2 = new Employee( "Diogo", "Carvalho", 2000.00 );
		
		System.out.println( "Funcionarios" );
		System.out.printf( "Nome: %s %s Salario: %.2f\n\n", 
				employee1.getNome(), 
				employee1.getSobreNome(), 
				employee1.getSalario() );
		
		System.out.printf( "Nome: %s %s Salario: %.2f\n\n", 
				employee2.getNome(), 
				employee2.getSobreNome(), 
				employee2.getSalario() );
		
		// dando almento de 10%
		System.out.println( "Funcionarios" );
		System.out.printf( "Nome: %s %s Salario: %.2f\n\n", 
				employee1.getNome(), 
				employee1.getSobreNome(), 
				employee1.getSalario() * 1.1 );
		
		System.out.printf( "Nome: %s %s Salario: %.2f\n\n", 
				employee2.getNome(), 
				employee2.getSobreNome(), 
				employee2.getSalario() * 1.1 );
	}
}