package shejimoshi.factory;

public class HairTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		IHair hair = new LeafHair();
//		hair.draw();
//		
//		IHair hair2 = new RightHair();
//		hair2.draw();
		
		//这种实现方式是不好的，因为每一个发型都需要新建一个hair，而且要在客户端显示调用。
		//这样既不利于维护，又不利于管理，工厂模式可以解决这个问题。
		
		
		//=============================================================================
		
//		HairFactory factory = new HairFactory();
//		IHair hair = factory.getHair("left");
//		hair.draw();
		
		//这个方法也不好，如果类型有很多，就要不停的if else ，这时，可以用反射
		
		
		//=============================================================================
		
//		HairFactory factory = new HairFactory();
//		IHair hair = factory.getHairByClass("shejimoshi.factory.LeafHair");
//		hair.draw();
		
		//这个方法也不怎么好，类名太长。 这时可以将类名和关键字做一个映射（properties文件），
		// 这样，通过类名的简写方式就可以创建类了。
		
		//=============================================================================
		
		HairFactory factory = new HairFactory();
		IHair hair = factory.getHairByProperties("right");
		hair.draw();
	}
	

}
