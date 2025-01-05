//FOR hashSets
//Unique values (no keys), No duplicates allowed, 

import java.util.HashSet;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> Marks=new HashSet<Integer>();

        Marks.add(43);
        Marks.add(67);
        Marks.add(85);
        Marks.add(85);
        Marks.add(92);
        Marks.add(54);
        Marks.add(87);

        System.out.println(Marks);

        //85 appears once  in the set because every item in a set has to be unique.

        for(Integer i:Marks){
            System.out.println(i);
        }
//print "marks are good" if i found in the set
        for(int i=0;i<=100;i++){
            if(Marks.contains(i)){
                System.out.println(i+" Marks are good");
            }
            else{
                System.out.println(i+" Marks are bad");
            }
        }


        
    }
}
