package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
        for(int f = 1;f <= 10;f++){
            for (int sp = 10-f;sp >= 0;sp--){
                System.out.print(" ");
            }
            for (int s = f;s >= 1; s--){
                System.out.print("*"+"");
            }
            for (int x = 2;x <= f; x++){
                System.out.print("*"+"");
            }
            System.out.println(); //for line break
        }







         }
  }
