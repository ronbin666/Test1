package shejimoshi.factory.abstractfactory;

public class NYFactory implements IPersonFactory {

	public IBoy getBoy() {
		// TODO Auto-generated method stub
		return new NYBoy();
	}

	public IGril getGirl() {
		// TODO Auto-generated method stub
		return new NYGirl();
	}

}
