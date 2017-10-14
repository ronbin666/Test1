package mypackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5����
 * �����㷨��MD5��sha1
 * MD5�㷨���ܴ��� byte[]����ͨ��MD5���ܴ������Ϊ����һ�� byte[]���飬����Ϊ16
 * @author Administrator
 *
 */
public class MD5Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final String src = "abc";
		char[] cs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		byte[] bytes = src.getBytes();
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] bs = digest.digest(bytes);
		final StringBuffer buffer = new StringBuffer();
		for(byte b : bs) {
			buffer.append(cs[(b>>4)& 0x0F]);
			buffer.append(cs[(b)& 0x0F]);
			System.out.println("b :" + (b));
			System.out.println("(b)& 0x0F :" + ((b)& 0x0F));
			System.out.println("b>>4 :" + (b>>4));
			System.out.println("(b>>4)& 0x0F :" + ((b>>4)& 0x0F));
		}
		System.out.println(buffer.toString());
		
		System.out.println("112>>4:"+(112>>4));
		System.out.println("-112>>4:"+(-112>>4));
		System.out.println("112<<4:"+(112<<4));
		System.out.println("-112<<4:"+(-112<<4));
	}

}
