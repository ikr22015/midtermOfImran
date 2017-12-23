package myDesign;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ShowEmployeesInfo {

    public static void main(String[] args) {
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase database = mongo.getDatabase("employee");
        MongoCollection<Document> collection = database.getCollection("profile");

        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);

        for (Document it:iterable){
            String name = (String) it.get("employee_name");
            int id = (int) it.get("employee_id");
            String join = (String) it.get("join_date");
            String department = (String) it.get("department");
            String activity = (String) it.get("activity");
            int salary = (int) it.get("yearly_salary");
            int bonus = (int) it.get("employee_bonus");

            System.out.println(id+" "+name+" "+join+" "+department+" "+activity+" "+salary+" "+bonus);
        }
    }
}
