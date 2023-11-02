package 策略模式;

public class Test {
	public static void main(String[] args) {
		Strategy preStrategy = new PreCopyStrategy();
		Strategy postStrategy = new PostCopyStrategy();
		Strategy CRRTStrategy = new CRRTMotionStrategy();

		Platform preContext = new Platform(preStrategy);
		Platform postContex = new Platform(postStrategy);
		Platform CRRTContex = new Platform(CRRTStrategy);

		preContext.lookAlgorithm();
		postContex.lookAlgorithm();
		CRRTContex.lookAlgorithm();
	}
}
