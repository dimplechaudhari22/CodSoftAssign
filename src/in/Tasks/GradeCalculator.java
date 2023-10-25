package in.Tasks;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.println("Enter the number of subjects you have :");
        int noSub = s.nextInt();

        int allMarks = 0;
        for (int i = 1; i <= noSub; i++) {
            System.out.print("Enter marks obtained in a subject " + i + ": ");
            int marks = s.nextInt();
            allMarks += marks;
        }

        System.out.println("Total Marks: " + allMarks);

        double avergPer = (double) allMarks / (noSub * 100) * 100;
        System.out.println("Average Percentage: " + avergPer + "%");

        String grade = " ";
        if (avergPer >= 90) {
            System.out.println(grade +"A+");
        } else if (avergPer >= 80) {
        	 System.out.println("Grade is : "+grade +"A");
        } else if (avergPer >= 70) {
        	 System.out.println("Grade is : "+grade +"B");
        } else if (avergPer >= 60) {
        	 System.out.println("Grade is : "+grade +"C");
        } else if (avergPer >= 50) {
        	 System.out.println("Grade is : "+grade +"D");
        } else {
        	 System.out.println("Grade is : "+grade +"F");
        }
    }
}
