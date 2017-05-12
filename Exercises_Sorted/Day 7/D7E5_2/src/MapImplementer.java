import java.util.HashMap;
import java.util.Map;

public class MapImplementer implements SimpleMap {

	Map<Integer,String> map = new HashMap<>();
	@Override
	public void put(int key, String name){
		if (!(map.containsKey(key))) {
			map.put(key,name);
		}
	}

	@Override
	public String get(int key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    @Override
    public void remove (int key){
        if (map.containsKey(key)) {
            map.remove(key);
        }
    }

	@Override
	public boolean isEmpty(){
        return map.isEmpty();
	} 
}