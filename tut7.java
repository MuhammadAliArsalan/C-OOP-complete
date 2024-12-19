//ABSTRACTION

/*abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dogs Bark!!!");
    }
}
public class tut7{
public static void main(String[]args){
    Dog myDog=new Dog();
    myDog.makeSound();

}}*/

/*interface carSound{
    public void start();
}
class Car implements carSound{
    @Override
    public void start(){
        System.out.println("Car starts with a key ");
    }
}
public class tut7{
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
    }
}*/
import java.util.Scanner;

abstract class Methods{
    abstract void getStdDetail();
    abstract void setGPs();
    abstract void calcPercent();
}
class Result extends Methods{
    private int sizeOfArray;
    private int[] marks;

    @Override
    public void setGPs(){
        Scanner scan=new Scanner(System.in);
        System.out.print("\nEnter the number of subjects: ");
        sizeOfArray=scan.nextInt();

        // Initialize the array after the size is set
        marks = new int[sizeOfArray];
        
        System.out.print("\n");
        for(int i=0;i<sizeOfArray;i++){
            System.out.print("Enter marks in subject "+(i+1)+": ");
            marks[i]=scan.nextInt();
        }
        
    }
    private String StdName;

    @Override
    public void getStdDetail(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        StdName=scan.nextLine();
        System.out.println("Student's name: " + StdName);   
        
    }
    
    private int TotalMarks=0;
    private double Percent;
    private int MaxMarks=550;

    @Override
    public void calcPercent(){
        System.out.print("\nThe Total marks of "+sizeOfArray+" subject are ");
        for(int i=0;i<sizeOfArray;i++){
            TotalMarks=TotalMarks+marks[i];     
        }
        Percent=((double)TotalMarks/MaxMarks)*100;

        System.out.println("\nTOTAL: "+TotalMarks);
        System.out.println("\nPERCENT: "+Percent);
    }
     
}
public class tut7{
    public static void main(String[] args) {
        Result result=new Result();
        result.getStdDetail();
        System.out.print("-----------------");
        result.setGPs();
        System.out.print("-----------------");
        result.calcPercent();   
    }
}