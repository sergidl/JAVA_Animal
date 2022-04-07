abstract class Mammal {
	private String continent, furColor, name;

	public Mammal(String continent, String furColor, String name) {
		this.setContinent(continent);
		this.setFurColor(furColor);
		this.setName(name);
	}

	public String getContinent() {
		return continent;
	}

	public String getFurColor() {
		return furColor;
	}

	public String getName() {
		return name;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public void setName(String name) {
		this.name = name;
	}

}