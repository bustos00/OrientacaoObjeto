package contaBancaria;

public class contaBancaria {

	String titular;
	int idade;
	int numConta;
	int numTel;
	String endere�o;
	double saldo;
	
	public void metodo() {
		
		System.out.println("\nO nome do titualar da conta"+ titular+"\nNumero de conta"+ numConta+"\nSaldo na conta"+ saldo+"\nO endere�o do titular da conta"+ endere�o+ "\nNumero de telefone dotitular"+ numTel);
	}
	public void monstreDados() {
		
		System.out.println("\nNome do titular:"+ titular);
		System.out.println("\nNumero de conta: "+ numConta);
		System.out.println("\nSaldo na conta: "+ saldo);
		System.out.println("\nEndere�o do titular:"+ endere�o);
		System.out.println("\nIdade:" + idade);
		System.out.println("\nNumero de telefone: "+ numTel);
	}
	
}
