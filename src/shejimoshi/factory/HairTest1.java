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
		
		//����ʵ�ַ�ʽ�ǲ��õģ���Ϊÿһ�����Ͷ���Ҫ�½�һ��hair������Ҫ�ڿͻ�����ʾ���á�
		//�����Ȳ�����ά�����ֲ����ڹ�������ģʽ���Խ��������⡣
		
		
		//=============================================================================
		
//		HairFactory factory = new HairFactory();
//		IHair hair = factory.getHair("left");
//		hair.draw();
		
		//�������Ҳ���ã���������кܶ࣬��Ҫ��ͣ��if else ����ʱ�������÷���
		
		
		//=============================================================================
		
//		HairFactory factory = new HairFactory();
//		IHair hair = factory.getHairByClass("shejimoshi.factory.LeafHair");
//		hair.draw();
		
		//�������Ҳ����ô�ã�����̫���� ��ʱ���Խ������͹ؼ�����һ��ӳ�䣨properties�ļ�����
		// ������ͨ�������ļ�д��ʽ�Ϳ��Դ������ˡ�
		
		//=============================================================================
		
		HairFactory factory = new HairFactory();
		IHair hair = factory.getHairByProperties("right");
		hair.draw();
	}
	

}
