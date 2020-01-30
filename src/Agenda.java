public class Agenda implements Cagenda {
	private String nome[] = new String[10];
	private int idade[] = new int[10];
	private double altura[] = new double[10];
	
	public Agenda() {
		for(int i = 0; i < 10; i++) {
			nome[i] = "";
		}
		for(int i = 0; i < 10; i++) {
			idade[i] = 0;
		}
		for(int i = 0; i < 10; i++) {
			altura[i] = 0;
		}
	}
	@Override
	public void armazenaPessoa(String n, int id, double alt) {
		for(int i = 0; i < 10; i++) {
			if(this.nome[i].equals("")) {
				this.nome[i] = n;
				this.idade[i] = id;
				this.altura[i] = alt;
				System.out.println("Foi adicionado com sucesso!");
				return;
			}
		}
		System.out.println("A agenda já está cheia para colocar outra pessoa!");
	}
	@Override
	public void removePessoa(String n) {
		for(int i = 0; i < 10; i++) {
			if(this.nome[i].equals(n)) {
				this.nome[i] = "";
				this.idade[i] = 0;
				this.altura[i] = 0;
				System.out.println("Foi removido com sucesso!");
				return;
			}
		}
		System.out.println("Não foi encontrado ninguém com esse nome na agenda!");
	}
	@Override
	public int buscaPessoa(String n) {
		for(int i = 0; i < 10; i++) {
			if(this.nome[i].equals(n)) {
				return i;
			}
		}
		System.out.println("Essa pessoa não está na lista!");
		return 0;
	}
	@Override
	public void imprimeAgenda() {
		for(int i = 0; i < 10; i++) {
			
			if(this.nome[i].equals("")) {
				return;
			}
			
			System.out.println("Nome: " + this.nome[i] + ", idade: " + this.idade[i] + ", altura: " + this.altura[i]);
		}
		
	}
	@Override
	public void imprimePessoa(int i) {
		if(this.nome[i].equals("")) {
			System.out.println("Não tem essa pessoa na lista");
			return;
		}
		System.out.println("Nome: " + this.nome[i] + " idade: " + this.idade[i] + " altura: " + this.altura[i]);
	}
	
	
}
