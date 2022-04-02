public class program4 {
    public static final int Add(final String numbers) {
        int returnValue = 0;
        String[] num_array = numbers.split(",");
        //if (num_array.length > 2) {
          //  throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        //} else {
            for (String number : num_array) {
                if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number);
            }}
        
        return returnValue ;
    }
}