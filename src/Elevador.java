public class Elevador implements Ilevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeDoElevador;
	private int pessoasDentro;
	
	public Elevador(int c, int t) {
		
		this.setCapacidadeDoElevador(c);
		this.setTotalAndares(t);
		this.setAndarAtual(0);
		this.setPessoasDentro(0);
		
	}
	
	private int getAndarAtual() {
		return this.andarAtual;
	}
	private void setAndarAtual(int a) {
		this.andarAtual = a;
	}
	private int getTotalAndares() {
		return this.totalAndares;
	}
	private void setTotalAndares(int t) {
		this.totalAndares = t;
	}
	private int getCapacidadeDoElevador() {
		return this.capacidadeDoElevador;
	}
	private void setCapacidadeDoElevador(int c) {
		this.capacidadeDoElevador = c;
	}
	private int getPessoasDentro() {
		return this.pessoasDentro;
	}
	private void setPessoasDentro(int p) {
		this.pessoasDentro = p;
	}

	@Override
	public void entra() {
		if(this.getPessoasDentro() < this.getCapacidadeDoElevador()) {
			this.setPessoasDentro(this.getPessoasDentro() + 1);
			System.out.println("Foi adicionado 1 pessoa dentro do elevador!");
		}else {
			System.out.println("Não tem espaço para outra pessoa entrar!");
		}
		
	}

	@Override
	public void sai() {
		
		if(this.getPessoasDentro() > 0) {
			this.setPessoasDentro(this.getPessoasDentro() - 1);
			System.out.println("Saiu 1 pessoa do elevador!");
		}else {
			System.out.println("Não tem pessoas no elevador!");
		}
	}

	@Override
	public void sobe() {
		if(this.getAndarAtual() < this.getTotalAndares()) {
			this.setAndarAtual(this.getAndarAtual() + 1);
			System.out.println("O elevador subiu 1 andar!");
		}else {
			System.out.println("Já estamos no andar mais alto!");
		}
		
	}

	@Override
	public void desce() {
		if(this.getAndarAtual() > 0) {
			this.setAndarAtual(this.getAndarAtual() - 1);
			System.out.println("O elevador desceu 1 andar!");
		}else {
			System.out.println("O elevador já está no terreo");
		}
		
	}
}
