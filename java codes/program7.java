import java.util.*;
public class program7{
public static int Add(final String numbers, final String delimiter) {
    int returnValue = 0;
    String[] num_array = numbers.split(delimiter);
    List negativeNumbers = new ArrayList();
    for (String number : num_array) {
        if (!number.trim().isEmpty()) {
            int numberInt = Integer.parseInt(number.trim());
            if (numberInt < 0) {
                negativeNumbers.add(numberInt);
            }
            returnValue += numberInt;
        }
    }
    if (negativeNumbers.size() > 0) {
        throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
    }
    return returnValue;     
}
}
