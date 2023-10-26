public class Pattern3 {
    public static void main(String [] args) // Begin - main()
    {
        int num = 5; // since you want 5 as the max value for *
        for (int i=num; i>0; i--) { // start with high to low
            // watch out for j<=num, the pattern should print until i only
            for(int j=1; j<=num; j++) { // start of inner loop
                System.out.print(" * "); // watch out for print here, println is not used
            } // end of inner loop
            System.out.print("\n"); // new line
        }// end of outer loop
    } // end of main()
} // end of class