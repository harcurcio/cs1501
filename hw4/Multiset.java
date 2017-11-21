import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Multiset {

	Map<Item, Integer> store;
	
	public Multiset(){
		store = new HashMap<Item, Integer>();
	}
	
	public void add(Item item){
		Integer temp = store.get(item);
		if(temp == null)
			store.put(item, 1);
		else
			store.put(item, temp + 1);
	}
	
	public Integer count(Item item){
		if(store.get(item) == null)
			return 0;
		else
			return store.get(item);
	}
	
	public Iterator<Item> iterator(){
		return store.keySet().iterator();
	}
}
