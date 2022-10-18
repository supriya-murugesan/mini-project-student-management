package studentManagement;

import java.util.Scanner;

public class Student {
        private String firstname;
        private String lastname;
        private int graduationyear;
        private String StudentId;
                private  String course;      
                public String instcode="SB456";
        private static int CostofCourse=2000;
        private static int  id=4001;
        public  int payment;
public Student(){
   Scanner n=new Scanner(System.in);
   System.out.println("Enter Student FirstName:");
   this.firstname=n.nextLine();
   System.out.println("Enter Student LastName:");
   this.lastname=n.nextLine();
   System.out.println("Enter PassedOut Year:");
   this.graduationyear=n.nextInt();
   setStudentId();  
}
private void setStudentId() {
	 id++;
this.StudentId= instcode +""+ id;
}
public void enroll(){
	System.out.println("courses Offered\n1.Java full Stack\n2.Java Framework\n3.Finance andDatabase  Processing\n4.CloudComputing");
	System.out.println("Enter course you want to enroll");
	Scanner n= new Scanner(System.in);
  course=n.nextLine(); 
		System.out.println("course enrolled:"+course);   

}
public void Coursefee() {
	System.out.println("Enter your payment:");
	Scanner n=new Scanner(System.in);
	payment=n.nextInt();
	CostofCourse=CostofCourse-payment;
	System.out.println("Thank you for the payment of  "+payment);
	if(CostofCourse==0) {
		System.out.println("You paid full amount:2000");
	}
	else
		{
		  System.out.println("you have to pay balance amount:" + CostofCourse);
		}
}
public String toString() {
	
	return " Name:"+firstname+" "+lastname + 
			"\n Student_ID:"+ instcode +""+id +
			"\n Graduated Year:"+ graduationyear +
			"\n Course Enrolled:"+ course +
			"\n Amount Details:" + payment+
			"\n Balance:" +CostofCourse;
			
	
}
}
