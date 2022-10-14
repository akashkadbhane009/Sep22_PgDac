import java.util.Scanner;

/*5. Write a program to implement a class “student” with the following members. Name of the student. Marks of the
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning
of the above. 
@006_Akash_Kadbhane_JH
*/

class Student{
        String name;
        int sub1,sub2,sub3;

        Student(String name ,int sub1,int sub2,int sub3){
                this.name=name;
                this.sub1=sub1;
                this.sub2=sub2;
                this.sub3=sub3;
                
       }
        void total(String name ,int sub1,int sub2,int sub3){
                int total=sub1+sub2+sub3;
                double avg=total/3;
                print(name,total,avg);
        }
        void print(String name,int total,double avg){
                System.out.println("Name= "+name);
                System.out.println("Total marks= "+total);
                System.out.println("Average= "+avg);
        }
       

}
public class StudentOop {
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Name=");
                String name =sc.nextLine();
                System.out.print("Enter Marks in subject1=");        
                int sub1 =sc.nextInt();
                System.out.print("Enter Marks in subject2=");
                int sub2 =sc.nextInt();
                System.out.print("Enter Marks in subject3=");
                int sub3 =sc.nextInt();
                sc.close();
                Student stud1 = new Student(name, sub1, sub2, sub3);
                stud1.total(name,sub1,sub2,sub3);
                
        }
}
