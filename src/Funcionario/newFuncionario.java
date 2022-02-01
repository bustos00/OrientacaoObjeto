package Funcionario;

public class newFuncionario {

	String nome;
	double salario;
	String cargo; 
	String departamento;
	
	public void imprimir() {
		
		System.out.println("Dados"+ "\nNome: "+ nome+"\nCargo "+ cargo+"\nDepartamento"+departamento+"\nsalario"+ salario);
		
	}
	
	public void construtor() {
		
		System.out.println("\nNome do Funcionario : " + nome);
		System.out.println("\nCargo do Funcionario:" + cargo);
		System.out.println("\nDepartamento do funcionario: " + departamento);
		System.out.println("\nSalario do Funcionario: " + salario);
	}

	

}


