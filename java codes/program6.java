public class program6
{
public static int add(final String numbers) {
    String delimiter = ",|n";
    String numbersWithoutDelimiter = numbers;
    if (numbers.startsWith("//")) {
        int delimiterIndex = numbers.indexOf("//") + 2;
        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
    }
    return Add(numbersWithoutDelimiter, delimiter);
}
 
private static int Add(final String numbers, final String delimiter) {
    int returnValue = 0;
    String[] num_array = numbers.split(delimiter);
    for (String number : num_array) {
        if (!number.trim().isEmpty()) {
            returnValue += Integer.parseInt(number.trim());
        }
    }
    return returnValue;
}
}