package 策略模式;

public class Platform {
	private Strategy strategy;

	public Platform(Strategy strategy) {
		this.strategy = strategy;
	}

	public void lookAlgorithm() {
		strategy.algorithm();
	}
}
