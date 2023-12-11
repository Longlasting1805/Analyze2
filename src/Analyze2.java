import java.util.Scanner;

public class Analyze2 {
    public static void main(String[] args) {

        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int passes = 0; // number of passes
        int failures = 0; // number of failures
        int studentCounter = 1; // student counter
        int result; // one exam result (obtains value from user)

        // process 10 students using counter-controlled loop
        while(studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();

            // if...else is nested in the while statement
            if (result == 1){ // if result 1,
                passes += 1; // increment passes;
            }else { // else result is not 1, so
                failures += 1; // increment failures
            } studentCounter += 1; // increment studentCounter so loop eventually terminates


        } // end while

        // termination phase; prepare and display results
        System.out.printf("passed: %d%nFailed: %d%n ", passes, failures);

        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus to instructor");



    }
}
