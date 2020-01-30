public class Pessoa {
	private String nome;
	private String dataDeNascimento;
	private double altura;
	
	public void dados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Data de nascimento: " + this.getDataDeNascimento());
		System.out.println("Altura: " + this.getAltura());
	}
	
	public void calcularIdade() {
		String idade = "";
		for(int i = 6; i < 10; i++) {
			idade += "" + this.getDataDeNascimento().charAt(i);
		}
		System.out.println("Sua idade é: " + (- Integer.parseInt(idade) + 2020));
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	public void setDataDeNascimento(String d) {
		this.dataDeNascimento = d;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double a) {
		this.altura = a;
	}
}
