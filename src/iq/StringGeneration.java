package iq;

public class StringGeneration {
    static void StairCase(int n) {
        for (int i=1; i<=n; i++){
            for (int spaces=n-1; spaces>=i; spaces--){
                System.out.print(" ");
            }
            for (int pounds=1; pounds<=i; pounds++){
                System.out.print("#");
            }
            System.out.println("");
        }

    }


}
