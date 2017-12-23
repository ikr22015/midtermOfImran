package myDesign;
import java.lang.String;
import java.util.Scanner;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class FortuneEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name :");
        String name = sc.nextLine();

        System.out.println("Enter Employee ID :");
        int id = sc.nextInt();
        sc.nextLine();//Consume newline left-over

        System.out.println("Employee's Joining Date : Example January 1, 2010");
        String join = sc.nextLine();

        System.out.println("Enter Employee Department :");
        String department = sc.nextLine();

        System.out.println("Employee's Activity :");
        String activity = sc.nextLine();

        System.out.println("Enter Employee's Hourly Rate : ");
        int hrRate = sc.nextInt();
        sc.nextLine();

        EmployeeInfo employee = new EmployeeInfo(name,id);
        //setter
        employee.setJoindDate(join);
        employee.setDepartment(department);
        //getter
        String joingDate = employee.getJoinDate();
        String employeeDepartment = employee.getDepartment();
        int salary = employee.calculateSalary(hrRate);
        int bonus = employee.calculateEmployeeBonus(salary,Performance.Average);


        try{
            MongoClient mongo = new MongoClient("localhost", 27017);
            MongoDatabase database = mongo.getDatabase("employee");
            MongoCollection<org.bson.Document> collection = database.getCollection("profile");

            Document document = new Document()
                    .append("employee_name", name)
                    .append("employee_id", id)
                    .append("join_date", join)
                    .append("department", employeeDepartment)
                    .append("activity", activity)
                    .append("yearly_salary", salary)
                    .append("employee_bonus", bonus);
            collection.insertOne(document);
            System.out.println("Data inserted successfully...!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
