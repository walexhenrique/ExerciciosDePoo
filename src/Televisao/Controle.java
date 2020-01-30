public class Controle implements Control{
	
	private Televisao tv;
	
	public Controle(Televisao t) {
		this.setTv(t);
	}
	
	public Televisao getTv() {
		return this.tv;
	}
	
	public void setTv(Televisao t) {
		this.tv = t;
	}
	
	
	@Override
	public void aumentarVolume() {
		this.tv.setVolume(this.tv.getVolume() + 1);
		System.out.println("Voce aumentou em 1 o volume");
	}

	@Override
	public void diminuirVolume() {
		this.tv.setVolume(this.tv.getVolume() - 1);
		System.out.println("Voce diminuiu em 1 o volume");
		
	}

	@Override
	public void aumentarCanal() {
		this.tv.setCanal(this.tv.getCanal() + 1);
		System.out.println("O canal era: " + (this.getTv().getCanal() - 1) + " agora é " + this.getTv().getCanal());
	}

	@Override
	public void diminuirCanal() {
		this.tv.setCanal(this.tv.getCanal() - 1);
		System.out.println("O canal era: " + this.getTv().getCanal() + 1 + " agora é " + this.getTv().getCanal());		
	}

	@Override
	public void trocarCanal(int t) {
		this.tv.setCanal(t);
		System.out.println("O canal foi trocado para: " + t);
	}

	@Override
	public void status() {
		System.out.println("O canal atual é: " + this.getTv().getCanal());
		System.out.println("O Volume atual é: " + this.getTv().getVolume());
		
	}

}
