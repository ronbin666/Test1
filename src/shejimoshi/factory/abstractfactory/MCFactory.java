package shejimoshi.factory.abstractfactory;

public class MCFactory implements IPersonFactory {

	public IBoy getBoy() {
		// TODO Auto-generated method stub
		return new MCBoy();
	}

	public IGril getGirl() {
		// TODO Auto-generated method stub
		return new MCGril();
	}

	
}
