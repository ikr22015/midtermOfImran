package datastructure;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		// Reading data from by BufferReader
		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		String data = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(textFile));
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}// End FileReader


		//Inserting data into MongoDB
		try {
			BufferedReader br = new BufferedReader(new FileReader(textFile));
			data = br.readLine();


			MongoClient mongo = new MongoClient("localhost", 27017);
			MongoDatabase database = mongo.getDatabase("dataStructure");
			MongoCollection<org.bson.Document> collection = database.getCollection("selfDrivingCar");

			Document document = new Document().append("data", data);
			collection.insertOne(document);
		}catch (Exception e){
			e.printStackTrace();
		}


		//Retrieving data
		try{
			MongoClient mongo = new MongoClient("localhost", 27017);
			MongoDatabase database = mongo.getDatabase("dataStructure");
			MongoCollection<org.bson.Document> collection = database.getCollection("selfDrivingCar");

			FindIterable<Document> iterDoc = collection.find();

			int i = 1;

			Iterator it = iterDoc.iterator();
			while (it.hasNext()){
				System.out.println(it.next());
				i++;
			}
		}catch (Exception e){
			e.printStackTrace();
		}





	}

}
