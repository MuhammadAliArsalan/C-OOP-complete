
import java.util.ArrayList;
import java.util.Collections;

/*public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> Cars=new ArrayList<String>();

        //ADDING ITEMS
        Cars.add("Volvo");
        Cars.add("Mercedes");
        Cars.add("Ford");

        Cars.add(1,"Mazda");

        System.out.println(Cars);

        //GET AN ITEM
        String item1=Cars.get(2);
        String item2=Cars.get(0);
        System.out.println(item1+" "+item2);

        //SET AN ITEM

        Cars.set(3,"Toyota");
        Cars.add(4,"Suzuki"); // Inserts an element at the specified index.
        System.out.println(Cars);

        //REMOVE AN ELEMENT
       String item3= Cars.remove(2);
       Cars.remove(3);
       System.out.println(item3);
       System.out.println(Cars);

       //SIZE OF ARRAY
       int sizeOfArray=Cars.size();
       System.out.println("The number of elements in arraylist are "+sizeOfArray);

       //SORTING ELEMENTS
       Collections.sort(Cars);

       //LOOPING THROUGH ARRAYLIST
       System.out.println("--ALL CARS--");
       for(int i=0;i<Cars.size();i++){
        System.out.println(Cars.get(i));
       }
    }    
}*/

public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> Marks=new ArrayList<Integer>();

        //ADDING ELEMENTS

        Marks.add(87);
        Marks.add(92);
        Marks.add(54);
        Marks.add(85);
        Marks.add(4,43);
        Marks.add(5,67);

        System.out.println(Marks);    //[87, 92, 54, 85, 43, 67]

        Marks.set(5,90);
        System.out.println(Marks);  //[87, 92, 54, 85, 43, 90]

        boolean contains=Marks.contains(43);  //Checks whether an item exist in the list
        System.out.println(contains); //true
        
        for(int i:Marks){
            System.out.println(i);
        }
        Collections.sort(Marks);
        
        System.out.println("--------------------");
        for(int i=0;i<Marks.size();i++){
            System.out.println(Marks.get(i));
        }

        //ClEAR ALL ELEMENTS
        Marks.clear();
        System.out.println(Marks);  //return empty list []
    }
}
