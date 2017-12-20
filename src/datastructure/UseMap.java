package datastructure;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.security.Key;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		// Create map to store
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		// create list one and store values
		List<String> valuSetOne = new ArrayList<String>();
		valuSetOne.add("Apple");
		valuSetOne.add("Banana");

		// Create list two and store values
		List<String> valuSetTwo = new ArrayList<String>();
		valuSetTwo.add("Orange");
		valuSetTwo.add("Watermelon");

		// Create list three and store values
		List<String> valuSetThree = new ArrayList<String>();
		valuSetThree.add("Mango");
		valuSetThree.add("Pineapple");

		// Put values into the map
		map.put("A", valuSetOne);
		map.put("B", valuSetTwo);
		map.put("C", valuSetThree);

		//Retrieve values with for each loop
		for(Map.Entry<String,List<String>> entry: map.entrySet()){
			String key = entry.getKey();
			List<String> values = entry.getValue();
			System.out.println(key+" " + values);
		}

		Iterator itr = map.entrySet().iterator();
		//Retrieve values with while loop
		while (itr.hasNext()){
			Map.Entry elements = (Map.Entry)itr.next();
			System.out.println(elements.getKey()+" "+elements.getValue());
		}
	}
}
