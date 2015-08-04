package fileoperations;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
		
		return entry1.getValue().compareTo(entry2.getValue());
	}

}
