public class Canis extends Mammal {
	private boolean wild;

	public Canis(String continent, String furColor, String name, boolean wild) {
		super(continent, furColor, name);
		this.setWild(wild);
	}

	public boolean getWild() {
		return wild;
	}

	public void setWild(boolean wild) {
		this.wild = wild;
	}
}
