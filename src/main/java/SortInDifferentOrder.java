import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortInDifferentOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter letters: ");
        String str = reader.nextLine();
        List<Character> list = new ArrayList<Character>();
        for(char c : str.toCharArray()) {
            list.add(c);
            //System.out.println(c);
        }
        sortInAlphabeticalOrder(list);
        sortNonAlphabeticalOrder(list);
        sortHalfAlphabeticalHalfNonAlphabeticalOrder(list);

    }

    public static void sortInAlphabeticalOrder(List<Character> list){
        System.out.println("In alphabetical order: ");
        int top = list.size()-1;
        int down = 0;
        //Character temp = 0;

        for(int i = down; i <= top; i++ ){
          down = i;
          for(int j = i+1; j<=top; j++){
                if(list.get(j)<list.get(down)){
                    down=j;
                }
          }
        if(list.get(down) == list.get(i)){

        }


         // temp = list.get(i);
            Collections.swap(list, down, i);
       //   list.get(i)= list.get(down);
       //   list.get(down) = temp;
            System.out.print(list.get(i)+ "   ");

        }
        System.out.println();
    }

    public static void sortNonAlphabeticalOrder(List<Character> list){
        System.out.println("In non-alphabetical order: ");
        int top = list.size()-1;
        int down = 0;
        //Character temp = 0;
        for(int i = down; i <= top; i++ ){
            down = i;
            for(int j = i+1; j<=top; j++){
                if(list.get(j)>list.get(down)){
                    down=j;
                }
            }
            if(list.get(down) == list.get(i)){

            }


            // temp = list.get(i);
            Collections.swap(list, down, i);
            //   list.get(i)= list.get(down);
            //   list.get(down) = temp;
            System.out.print(list.get(i)+ "   ");

        }
        System.out.println();
    }

    public static void sortHalfAlphabeticalHalfNonAlphabeticalOrder(List<Character> list){
        System.out.println("Half of them in alphabetical order, half of them non alphabetical order: ");
        List<Character> tempList = new ArrayList<Character>();
        int top = list.size()-1;
        int down = 0;
        Character r = 'r';
        //int indexR = list.indexOf(r);
        for(int i = down; i <= top; i++ ){
           if(list.get(i) <= r){
               //System.out.println(" a to r ");
                   down = i;
                   for(int j = i+1; j<=top; j++){
                       if(list.get(j)<list.get(down)){
                           down=j;
                       }
                   }
                   if(list.get(down) == list.get(i)){
                   }
                   Collections.swap(list, down, i);
                   System.out.print( list.get(i) + "   ");



           }else{


               tempList.add(list.get(i));

           }



        }
        int top1 = tempList.size()-1;
        int down1 = 0;
        for(int i = down1; i <= top1; i++ ) {

            //System.out.println(" a to r ");
            down1 = i;
            for (int j = i + 1; j <= top1; j++) {
                if (tempList.get(j) > tempList.get(down1)) {
                    down1 = j;
                }
            }
            if (tempList.get(down1) == tempList.get(i)) {
            }
            Collections.swap(tempList, down1, i);
            System.out.print(tempList.get(i) + "   ");

        }
    }

}
