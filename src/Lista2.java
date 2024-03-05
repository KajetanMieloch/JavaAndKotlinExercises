import java.util.Arrays;
import java.util.*;

public class Lista2 {

    static Integer missingNumber(int[] tab){
        int N = tab.length;

        //////Weryfikacja wejścia\\\\\\
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < N; i++){
            set.add(tab[i]);
            //Sprawdzanie dodatności liczb
            if(tab[i]<0){
                System.out.println(("Tablica zawiera liczby ujemne"));
                return null;
            }
        }
        //Sprawdzanie unikalności
        if(N != set.size()){
            System.out.println(("Elementy nie są unikalne"));
            return null;
        }

        //Spawdzanie czy brakuje 1 elementu
        if(N < tab[N-1]){
            System.out.println("Brakuje więcej niż 1 element");
            return null;
        }



        //Zwracanie brakującego elementu
        Arrays.sort(tab);

        for (int i = 0; i <= N; i++){
            try{
                if(i!=tab[i]){
                    return i;
                }
            }
            catch (Exception e){
                System.out.println("Nie brakuje żadnej liczby");
                return null;
            }
        }
        return null;
    }

    static Boolean isPalindrome(String word){
        String wordL;
        String wordR;
        int len = word.length();
        if(len%2!=0){
            wordL = word.substring(0,(len)/2);
            wordR = word.substring((len+1)/2);
        }
        else{
            wordL = word.substring(0, len/2);
            wordR = word.substring((len)/2);
        }
        System.out.println(wordL);
        System.out.println(wordR);
        
        int partLen = wordR.length();

        for(int i = 0; i < partLen; i++){
            System.out.println(i);
            if(wordL.charAt(i)!=wordR.charAt(partLen-1-i)){
                return false;
            }
        }

        return true;
    }

    static Integer countPascal(int row, int column) {
        if (column == 1 || row == column) {
            return 1;
        } else {
            return countPascal(row - 1, column - 1) + countPascal(row - 1, column);
        }
    }

    static void printPascal(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(countPascal(i, k) + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Zad1
        int[] tab = new int[]{2, 4, 5, 3, 0, 6}; // N = 6
        System.out.println(missingNumber(tab));

        //Zad2
        String word = "abba";
        System.out.println(isPalindrome(word));

        //zad3
        int height = 4;
        printPascal(height);
    }
}