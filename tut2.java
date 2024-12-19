import java.util.Scanner;

/*public class tut2{
    //  Static method: belongs to the class, can be called without creating an object
    
    static void myMethod(){
        System.out.println("This is a method to print Person's name");
    }
    
    //(public) method: requires an object of the class to be invoked
    
    public void addNum(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=scan.nextInt();

        System.out.print("Enter second number: ");
        int num2=scan.nextInt();

        scan.close();
        System.out.println("SUM: "+(num1+num2));
    }
    public static void main(String[]args){
        myMethod();   //static methods can be called directly

        tut2 Add=new tut2(); 
        Add.addNum();  //Public methods like "addNum()" must be called by creating objects

    }
}*/

//  ------------------

public class tut2{
    public void setInitialSpeed(int iSpeed){
       
        if(iSpeed>30 || iSpeed<0){
            System.out.print("Plz provide a value in range of (0 - 30)");
        }
        else{
            System.out.println("The initial speed of car is set as "+iSpeed+" km/hr");
        }
    }
    public void requestChangeInSpeed(){
        Scanner getSpeed=new Scanner(System.in);
        
        System.out.print("\nEnter the speed you want to change to: ");
        int changeSpeed=getSpeed.nextInt();

        getSpeed.close();   

        try{
            if(changeSpeed<0 || changeSpeed>150){
                throw new IllegalArgumentException("Speed value not in range. plz enter value ranging from 0 - 150");
                
            }
            else{
                System.out.print("\nThe new speed of car is "+changeSpeed+" km/hr");
            }
            
        }
        finally {
            System.out.println("\nThe 'exception handling' is finished.");
        }
        
    }
    public static void main(String[]args){
        tut2 speedController=new tut2();

        //both are public methods so they should be accessed by objects
        speedController.setInitialSpeed(10);
        speedController.requestChangeInSpeed();

    }
}
