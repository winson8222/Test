class BetaCoronavirus extends Virus {

	private String name = "Beta Coronavirus";
	private double probabilityOfMutating = 0.000;

	public BetaCoronavirus() {
	}


	public Virus spread(double random) {
		return new BetaCoronavirus();
	}

	public boolean test(String name) {
		return this.name == name;
	}

	@Override
	public String toString() {
		return this.name + " with " + probabilityOfMutating + " probability of mutating";
	}

}
