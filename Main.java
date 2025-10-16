public class Main {
    public static void main(String[] args) {
        // Fixed approach: Use a numeric string and parse it
        Object obj = "123"; // String containing a numeric value
        
        // Proper way to convert String to Integer
        Integer num = Integer.parseInt((String) obj);
        System.out.println(num);
    }
    
    /**
     * Converts an Object containing a String to Integer
     * @param obj Object containing a String with numeric value
     * @return Integer value
     * @throws NumberFormatException if the String doesn't contain a parsable integer
     */
    public static Integer convertToInteger(Object obj) {
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        } else if (obj instanceof Integer) {
            return (Integer) obj;
        } else {
            throw new IllegalArgumentException("Object must be String or Integer");
        }
    }
}
