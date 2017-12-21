package math;

public class MissingNumCal {
    static int getMissingNum(int a[], int n){
        int i;
        int total;

        total = (n+1)*(n+2)/2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }
}
