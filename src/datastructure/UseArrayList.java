package datastructure;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		/*********Demonstrating ArrayList***********/

		ArrayList<String> aList = new ArrayList<String>();

		//Add data
		aList.add("Kajol");
		aList.add("Rekha");
		aList.add("Madhuri");
		aList.add("Preety");
		aList.add("Bobita");

		//Remove data
		aList.remove(aList.get(3));

		//Retrieving data using whole loop
		Iterator itr = aList.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//Retrieving data using for each loop
		for (String als:aList){
			System.out.println(als);
		}

		//Storing all the sorted data into one of the databases.
		try {
			//mongoDB Connection
			MongoClient mongo = new MongoClient("localhost", 27017);
			MongoDatabase database = mongo.getDatabase("dataStructure");
			MongoCollection<Document> collection = database.getCollection("arrayLstNames");

			//Inserting data into mongo collection
			for (int i = 0; i < aList.size(); i++) {
				Document document = new Document().append("Name", aList.get(i));
				collection.insertOne(document);
			}

		}catch (Exception e){
			e.printStackTrace();
		}

	

	}

}
