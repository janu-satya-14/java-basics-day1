//public class MiniProject1 {
//    public static void main(String[] args) {
//        String student1= "Jhansi";
//        String student2= "Kavita";
//        String student3= "Mythri";
//
//        int age1 = 19;
//        int age2 = 20;
//        int age3 = 21;
//
//        int marks1 = 864;
//        int marks2 = 974;
//        int marks3 = 955;
//
//        int avg=(marks1+marks2+marks3)/3;
//        System.out.println("The average score of all three students is: "+avg);
//    }
//}
//(with Scanner)
import java.util.Scanner;
public class MiniProject1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student 1 Name: ");
        String student1 = sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();
        System.out.print("Marks: ");
        int marks1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 2 Name: ");
        String student2 = sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();
        System.out.print("Marks: ");
        int marks2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 3 Name: ");
        String student3 = sc.nextLine();
        System.out.print("Age: ");
        int age3 = sc.nextInt();
        System.out.print("Marks: ");
        int marks3 = sc.nextInt();

        int totalAvg = (marks1 + marks2 + marks3)/3;
        System.out.println("\nThe average score of all three students is: " + totalAvg);
        sc.close();
    }
}