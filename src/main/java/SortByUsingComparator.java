import java.util.*;

public class SortByUsingComparator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter letters: ");
        String str = reader.nextLine();
        List<Character> list = new ArrayList<Character>();
        for(char c : str.toCharArray()) {
            list.add(c);
        }

        CharComparator charc = new CharComparator();
        System.out.println(list);
        Collections.sort(list, charc);
        System.out.println(list);
    }
}

class CharComparator implements Comparator<Character>{
    public int compare(Character o1, Character o2) {
        final Character r = 'r';
        List<Character> tempList = new ArrayList<Character>();
        //System.out.println(o1 + " and " + o2);
        if((o2 <= r) || (o1 <= r)) {
            if (o1 > o2) {
                return 1;

            }
            if (o1 < o2) {
                return -1;
            }

       } if((o2 > r) || (o1 > r)){
            if (o1 < o2) {
                return 1;
            }
            if (o1 > o2) {
                return -1;
            }
            return 0;
        }
        return 0;
    }


}
