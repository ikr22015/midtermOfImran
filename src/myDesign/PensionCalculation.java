package myDesign;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Stack;

public class PensionCalculation {
    public static int calculatePension(int salary, String joiningDate){
        //Spit string date and push into stack
        String[] date = joiningDate.split(",");
        Stack st = new Stack();
        st.push(date);
        //Convert spited string date into integer
        int mm = Integer.parseInt(date[0]);
        int dd = Integer.parseInt(date[1]);
        int yyyy = Integer.parseInt(date[2]);
        System.out.println(yyyy+mm+dd);

        //calculating job age
        LocalDate start = LocalDate.of(yyyy,mm,dd);
        LocalDate today = LocalDate.now();
        long jobAge = ChronoUnit.YEARS.between(start, today);

        //Put two condition to calculate job age
        int pension = 0;
        if(jobAge < 2) {
            pension = (salary * 8) / 100;
        }else if (jobAge > 2){
            pension = (salary * 10) / 100;
        }

        return pension;
    }
}
