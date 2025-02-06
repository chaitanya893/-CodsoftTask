import java.util.Scanner;

public class Student_Calculator {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        System.out.println("The Student Grade Calculator");
        System.out.println("Enter the number of subjects");
        int no_sub = sc.nextInt();
        int total = 0;

        for(int i=0;i<no_sub;i++){
            System.out.println("Enter Marks in " + " " + "Subject " +(i+1));
            int s_marks=sc.nextInt();
            total+=s_marks;

        }
        double avg_percent = (double)total/no_sub;
    char s_grade;
    if(avg_percent>=90){
        s_grade='O';// O represents Outstanding
    }

    else if(avg_percent>=80){
        s_grade='A';// A represents Excellent
    }
    else if(avg_percent>=70){
        s_grade='B';// B represents  Very Good
    }
    else if(avg_percent>=60){
        s_grade='C';// C represents Good
    }
    else if(avg_percent>=50){
        s_grade='D';
    }
    else if(avg_percent>=40){
        s_grade='P';// P represents Pass
    }
    else{
        s_grade = 'F'; // F represents Fail
    }
    
    System.out.println("Total marks scored is : "+total);
    System.out.println();
    System.out.println("Average percentage : "+avg_percent +"%");
    System.out.println();
    System.out.println("Student Final Grade : "+s_grade);
    


  }
}
