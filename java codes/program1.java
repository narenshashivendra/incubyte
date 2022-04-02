public class program1 {
    public static final void Add(final String numbers) {
        String[] num_array = numbers.split(",");
        if (num_array.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : num_array) {
                Integer.parseInt(number); 
            }
        }
    }
}