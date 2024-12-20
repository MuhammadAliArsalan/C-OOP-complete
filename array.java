/*public class array {
    public static void main(String[] args) {

        String[] cars = { "Volvo", "BMW", "toyota", "Suzuki", "Mazda" };
        System.out.print(cars[0]);
        System.out.println("\n"+cars[3]);
        //System.out.println(cars[9]); // Index 9 out of bounds for length
       // System.out.println(cars[-2]);  // -2 out of bound
        System.out.println("-------------------");
        
       int carsLength=cars.length;
       for(int i=0;i<carsLength;i++){    //printing all elements usin for loop
        System.out.println(cars[i]);
        
       }
       for(int i=0;i<carsLength;i=i+2){
        System.out.print("\n"+cars[i]);      //printing elements at 0th, 2nd and 4th index
       }

       //Changing elements of array
       cars[1]="Porsche";
       cars[2]="Nissan";
       System.out.println("\n"+cars[1]+" "+cars[2]);
    }

}*/

import java.util.Scanner;

interface fruitsCollection{
    void setFruitsInArray();
    void getFruitsInArray();
}

class Ali implements fruitsCollection{

    private int noOfFruits;
    private String[] Fruits;

    @Override
    public void setFruitsInArray(){
        Scanner getInp=new Scanner(System.in);
        System.out.print("Enter how many fruits do you want to buy: ");
        noOfFruits=getInp.nextInt();
        getInp.nextLine(); // Consume leftover newline character

        Fruits=new String[noOfFruits];   //initialized empty array

        for(int i=0;i<noOfFruits;i++){
            System.out.print((i+1)+":");
            Fruits[i]=getInp.nextLine();
        }
        getInp.close();
    }

    @Override
    public void getFruitsInArray(){
        System.out.print("\nThe fruits that you bought are as under: \n ");
        for(int j=0;j<noOfFruits;j++){
            System.out.println(Fruits[j]);
        }

    }

}
class Hasan implements fruitsCollection{
    private String[] fruits={"Apple","Plum","Peach","Apricot"};

    @Override
    public void setFruitsInArray(){
        System.out.print("\n\nFruits are already defined");

    }
     
    @Override
    public void getFruitsInArray(){

        System.out.print("\nFruits bought are as under:\n");
        for(String i:fruits){         //using for-each loop
            System.out.println(i);

        }}
}
public class array{
    public static void main(String[] args) {
        Ali fruitss=new Ali();
        fruitss.setFruitsInArray();
        fruitss.getFruitsInArray();

        Hasan fruitss2=new Hasan();
        fruitss2.setFruitsInArray();
        fruitss2.getFruitsInArray();
    }
}