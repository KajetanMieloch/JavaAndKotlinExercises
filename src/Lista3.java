import java.util.*;

public class Lista3 {
    static HashMap numberOfOccurrences(String sentence){
        int n;
        HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
        for (String word : words) {
            if(wordsMap.get(word) != null) {
                n = wordsMap.get(word) + 1;
            }
            else{
                n = 1;
            }
            wordsMap.put(word, n);
        }
        return wordsMap;
    }

    static List<Integer> findDuplicates(List<Integer> lst) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer num : lst) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        return new ArrayList<>(duplicates);
    }
    static HashMap addToBoolean(){
        HashMap<Integer, Boolean> booMap = new HashMap<Integer, Boolean>();
        for(int i = 1; i <= 20; i++){
            if(i%2 == 0){
                booMap.put(i, Boolean.TRUE);
            } else {
                booMap.put(i, Boolean.FALSE);
            }
        }
        return booMap;
    }


    public static void main(String[] args) {
        //zad1
        String input = "To jest przykładowe zdanie. To zdanie jest tylko przykładowe.";
        System.out.println(numberOfOccurrences(input));

        //zad2
        List<Integer> lst = new ArrayList<>(List.of(0, 1, 1, 1, 4, 4, 4, 9, 3, 3, 3, 3, 3, 3));
        System.out.println(findDuplicates(lst));

        //zad3
        System.out.println(addToBoolean());

    }
}
