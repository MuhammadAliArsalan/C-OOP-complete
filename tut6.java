// INHERITANCE

/*class tut6 {
    protected String brand="Ford";

    public void car(){
        System.out.println("Hoo!Hoo!");
    }
   
}
class Vehicle extends tut6{
    private int model=2014;

    public static void main(String[] args) {
        Vehicle car=new Vehicle();
        car.car();

        System.out.println("Car's model is  "+car.model);
        System.out.println("Car's model is "+car.brand);
        
    }
}*/
import java.util.Scanner;

public class tut6{

    private String StdName;
    private int RollNo;

    public void setDetails(){
        Scanner getInp=new Scanner(System.in);

        System.out.print("Enter student's name: ");
        StdName=getInp.nextLine();

        System.out.print("Enter student's Roll Number: ");
        RollNo=getInp.nextInt();

        getInp.nextLine();
           
    } 
    public void getDetails(){
        System.out.println("Student's Name: "+StdName);
        System.out.println("Roll Number is: "+RollNo);

    }

}

//Shared Scanner Object:

// Pass a single Scanner object to all input methods to avoid conflicts.
// Close the Scanner only once, after all inputs are complete.
class Student extends tut6{
    private String Department;
    private double CGPA;

    public void setExtraDetail(Scanner getInp){
       
        System.out.print("Enter the department student is enrolled in: ");
        this.Department=getInp.nextLine();

        System.out.print("Enter the CGPA of student: ");
        this.CGPA=getInp.nextDouble();

    }
    public void getExtraDetail(){
        System.out.println("Department: "+this.Department);
        System.out.println("CGPA:  "+this.CGPA);

    }

    public static void main(String[] args) {
         
        Scanner getInp = new Scanner(System.in);

        Student details=new Student();
        details.setDetails();    
        details.setExtraDetail(getInp);

        System.out.println("\t\tSTUDENT's INFORMATION");
        details.getDetails();
        details.getExtraDetail();

        getInp.close();  
    }
}
