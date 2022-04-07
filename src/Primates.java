public class Primates extends Mammal {
	private boolean greatApe;

	public Primates(String continent, String furColor, String name, boolean greatApe) {
		super(continent, furColor, name);
		this.setGreatApe(greatApe);
	}

	public boolean getGreatApe() {
		return greatApe;
	}

	public void setGreatApe(boolean greatApe) {
		this.greatApe = greatApe;
	}

}
