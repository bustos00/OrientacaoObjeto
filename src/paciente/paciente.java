package paciente;

public class paciente {

	String nome;
	String numeroCpf;
	String endereço;
	int  numSus;
	
	public void metodo() {
		
		System.out.println("\nNome: "+ nome+"\nnumcpf: "+ numeroCpf+ "\nEndereço"+ endereço+ "\nnumsus: "+numSus);
	}
	
	
	public void estrutura() {
		
		System.out.println("\nNome do paciente: "+ nome);
		System.out.println("\nNumero CPF: "+ numeroCpf);
		System.out.println("\nEndereço : "+ endereço);
		System.out.println("\nNumero cartão sus: "+ numSus);
	}
	
}
