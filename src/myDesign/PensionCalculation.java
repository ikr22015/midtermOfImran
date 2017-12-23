package myDesign;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PensionCalculation {
    public static int calculatePension(int salary, String dateOfJoining){
        LocalDate start = LocalDate.of(1980,9,7);
        //LocalDate end = LocalDate.of(2014, 2, 28); // use for age-calculation: LocalDate.now()
        LocalDate today = LocalDate.now();
        long jobAge = ChronoUnit.YEARS.between(start, today);
        //System.out.println(jobAge); // 17

        int pension = 0;
        if(jobAge < 2) {
            pension = (salary * 8) / 100;
        }else if (jobAge > 2){
            pension = (salary * 10) / 100;
        }

        return pension;
    }
}
