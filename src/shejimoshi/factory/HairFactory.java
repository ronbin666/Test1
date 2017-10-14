package shejimoshi.factory;

import java.util.Map;

public class HairFactory {

    public IHair getHair(String str) {
    	if ("left".equals(str)) {
    		return new LeafHair();
    	} else if ("right".equals(str)) {
    		return new RightHair();
    	} else {
    		return null;
    	}
    }
    
    public IHair getHairByClass(String classname) {
    	try {
			IHair hair = (IHair) Class.forName(classname).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
	
    public IHair getHairByProperties(String name) {
    	PropertiesReader reader = new PropertiesReader();
    	Map map = reader.getProperty();
    	String className = (String) map.get(name);
    	try {
			IHair hair = (IHair) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
}
