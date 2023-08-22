import java.util.Scanner;
public class Schedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to a new year at Stevenson!!");
        System.out.println("\nWhat is your 1st period class? ");
        String str1 = sc.nextLine();
        System.out.println("What is your 2nd period class? ");
        String str2 = sc.nextLine();
        System.out.println("What is your 3rd period class? ");
        String str3 = sc.nextLine();
        System.out.println("What is your 4th period class? ");
        String str4 = sc.nextLine();
        System.out.println("What is your 5th period class? ");
        String str5 = sc.nextLine();
        System.out.println("What is your 6th period class? ");
        String str6 = sc.nextLine();
        System.out.println("What is your 7th period class? ");
        String str7 = sc.nextLine();
        System.out.println("What is your 8th period class? ");
        String str8 = sc.nextLine();
        System.out.println("What is your favorite period? ");
        int num9 = sc.nextInt();
        System.out.println("On a 4.0 scale, predict what your GPA will be this semester: ");
        double num10 = sc.nextDouble();
        System.out.println("Your Schedule\n1\t"+str1+"\t8:30\t-\t9:21\n2\t"+str2+"\t9:26\t-\t10:13\n3\t"+str3+"\t10:18\t-\t11:05\n4\t"+str4+"\t11:10\t-\t11:57\n5\t"+str5+"\t12:02\t-\t12:49\n6\t"+str6+"\t12:54\t-\t1:41\n7\t"+str7+"\t1:46\t-\t2:33\n8\t"+str8+"\t2:38\t-\t3:25\n"+"Your favorite class is period "+num9+".\nYour predicted GPA will be "+num10+".");     
        
    }
}
