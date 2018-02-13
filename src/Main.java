import java.util.*;

public class Main {
    public static void main(String[] args) {
        String elements[] = {"Abe", "Abe","Abe", "Hund", "Hund", "Hamster"};
        List<String> strList = new LinkedList<>(Arrays.asList(elements));

        contains3(strList);
    }

    public static boolean contains3(List<String> list) {
        HashMap<String, Integer> strMap = new HashMap<>();
        boolean count3;
        Iterator<String> itr = list.iterator();
        System.out.println(list);

        while (itr.hasNext()) {
            String word = itr.next();
            if (strMap.containsKey(word)) {
                strMap.put(word, strMap.get(word) + 1);
            } else {
                strMap.put(word, 1);
            }
        }

        if (strMap.containsValue(3));
        {
            count3 = true;
            System.out.println(strMap.containsValue(3));
        }
        return count3;
    }
}



