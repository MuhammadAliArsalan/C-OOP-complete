
/*public class tut5 {
    private String PName;

    public void SetName(String SName){
        this.PName=SName;
    }

    public String getName(){
        return PName;

    }
   
public static void main(String[] args) {
    tut5 person=new tut5();
    person.SetName("Muhammad Ali");
    System.out.println(person.getName());
}*/

//import java.util.Scanner;

public class tut5{
    private String StdName;
    private double GradePointsAvg;
    private String Dept;

    public void setDetails(String Name,double GPA,String Dept)
    {
        this.StdName=Name;
        this.GradePointsAvg=GPA;
        this.Dept=Dept;

    }
    public String getDetails(){
        return "Student's name is "+StdName+", current CGPA is "+GradePointsAvg+
        ", and is enrolled in "+Dept+" department";
        
    }
    public static void main(String[] args) {
        tut5 showDet=new tut5();
        showDet.setDetails("M.Ali", 3.098, "Software Engg");
        System.out.print("-----STUDENT PROGRESS------");
        System.out.println("\n"+showDet.getDetails());
    }
}




    

