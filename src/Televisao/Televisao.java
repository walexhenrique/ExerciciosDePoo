public class Televisao {
	private int volume;
	private int canal;
	
	public Televisao() {
		this.setCanal(0);
		this.setVolume(50);
	}
	
	public int getVolume() {
		return this.volume;
	}
	public void setVolume(int v) {
		this.volume = v;
	}
	
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int c) {
		this.canal = c;
	}
}
