package shejimoshi.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader {

	public Map getProperty(){
		Properties properties = new Properties(); 
		Map<String, String> map = new HashMap<String, String>();
		InputStream inputStream = getClass().getResourceAsStream("className.properties");
		try {
			properties.load(inputStream);
			Enumeration enumeration = properties.propertyNames();
			while (enumeration.hasMoreElements()) {
				String key = (String) enumeration.nextElement();
				String value = properties.getProperty(key);
				map.put(key, value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
