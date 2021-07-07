package decagon.tolulope.JavaAlgorithms;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToOrdinal(175));
    }

    public static String numberToOrdinal( Integer number ) {

        //convert number to String
        String numberAsString = number.toString();

        //convert the number String to array
        String[] numberArray = numberAsString.split("");
        if (number < 10) {
            if (number > 3) {
                return number.toString() + "th";
            } else if (number == 3) {
                return number.toString() + "rd";
            } else if (number == 2) {
                return number.toString() + "nd";
            } else if(number == 1){
                return number.toString() + "st";
            }else {
                return "0";
            }
        }
        //test for teen
        else if((number >= 10 && number <= 20) || (number >= 110 && number <= 120)){
            return number.toString() + "th";
        }
        //test for number between 20 and 120
        else if(number > 20 && number <  120){
            if(numberArray[numberArray.length-1].equals("0")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("9")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("8")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("7")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("6")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("5")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("4")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("3")){
                return number.toString() + "rd";
            }else if (numberArray[numberArray.length-1].equals("2")){
                return number.toString() + "nd";
            }else if (numberArray[numberArray.length-1].equals("1")){
                return number.toString() + "st";
            }else{
                return "0";
            }

        }
        //test for numbers above 121
        else if(number > 121){
            if(numberArray[numberArray.length-1].equals("0")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("9")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("8")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("7")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("6")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("5")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("4")){
                return number.toString() + "th";
            }else if (numberArray[numberArray.length-1].equals("3")){
                return number.toString() + "rd";
            }else if (numberArray[numberArray.length-1].equals("2")){
                return number.toString() + "nd";
            }else if (numberArray[numberArray.length-1].equals("1")){
                return number.toString() + "st";
            }else{
                return "0";
            }
        } else {
            return "0";
        }
    }

}
