package xuexie;

import java.util.HashMap;
import java.util.Map;

public final class Immutable2 {

	private final String str;
	private final Map<String, String> map ;

	public  Immutable2(String str,Map<String,String> map1) {
		this.str = str;
		Map<String,String> temp = new HashMap<>();
		for(Map.Entry<String, String> entry : map1.entrySet()) {
			temp.put(entry.getKey(), entry.getValue());
		}
		this.map = temp;
		
	}


	public String getStr() {
		return str;
	}


	public Map<String, String> getMap() {
		return map;
	}

	
}
