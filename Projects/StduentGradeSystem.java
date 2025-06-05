import java.util.*;
class StudentGradeMark
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Student Name-----");
        String name = scan.nextLine();
        int[] marks = new int[5];
        System.out.println("-----Enter the 5 subject Marks-----");
        for(int i = 0; i < 5; i++)
        {
            marks[i] = scan.nextInt();
        }
        System.out.println("Student Name :"+name);
        System.out.println("5 subject marks :");
        int total = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Subject "+i+" "+marks[i]);
            total += marks[i];
        }
        if(total <= 500)
        {
            System.out.println("Total marks : "+total);
        }
        else
        {
            System.out.println("Your mark is above 500.Something you mistake in marks");
        }
        double average = (double)total / 5.0;
        System.out.println("average mark :"+average);
        char grade;
        if(average >= 90)
        {
            grade = 'A';
        }
        else if(average >= 80)
        {
            grade = 'B';
        }
        else if(average >= 70)
        {
            grade = 'C';
        }
        else if(average >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Grade :"+grade);
    }
}