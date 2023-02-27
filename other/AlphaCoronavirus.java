class AlphaCoronavirus extends Virus {
	private String name;
	private double probabilityOfMutating;

	public AlphaCoronavirus(double probabilityOfMutating) {
		this.name = "Alpha Coronavirus";
		this.probabilityOfMutating = probabilityOfMutating;
	}


	public Virus spread(double random) {
		if (random <= this.probabilityOfMutating) {
			return new SARS_CoV_2(this.probabilityOfMutating);
		} else {
			return new AlphaCoronavirus(0.9 * this.probabilityOfMutating);
		}
	}

	public boolean test(String name) {
		return this.name == name;
	}

	@Override
	public String toString() {
		return this.name + " with " + probabilityOfMutating + " probability of mutating";
	}

}

