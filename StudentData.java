package studentManagement;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {		
      System.out.println("Enter the number of students to enroll");
      Scanner n=new Scanner(System.in);
      int NumberOfStudents=n.nextInt();
      Student[]students=new Student[NumberOfStudents];
      for(int i=0;i<NumberOfStudents;i++) {
    	  students[i]=new Student();
    	  students[i].enroll();
          students[i].Coursefee();
           System.out.println(students[i].toString());
      }
     
	
	}
	
	
	

}
