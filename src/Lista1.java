public class Lista1 {

    static String intToString(Integer number){
        String textOfNumber = "";
        if(number % 3 == 0) {
            textOfNumber += "trzy";
        }
        if (number % 5 == 0) {
            textOfNumber += "piec";
        }
        if (number % 7 == 0){
            textOfNumber += "siedem";
        }
        if (number % 11 == 0){
            textOfNumber += "jedenascie";
        }
        if (number % 13 == 0){
            textOfNumber += "trzynascie";
        }
        if (number % 15 == 0){
            textOfNumber += "pietnascie";
        }
        if (number % 21 == 0){
            textOfNumber += "dwadziesciajeden";
        }

        return textOfNumber;
    }

    public static void main(String[] args) {
        System.out.println(intToString(15015));
    }


}