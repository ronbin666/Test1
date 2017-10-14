package shejimoshi.factory.abstractfactory;

public class FactoryTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPersonFactory factory = new MCFactory();
		IBoy boy = factory.getBoy();
		boy.drawBoy();
	}

}
