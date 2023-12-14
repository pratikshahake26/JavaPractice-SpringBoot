public class CountLength {

    public static void main(String[] args) {
        String string = "Pratiksha hake";
        int count = 0;
        for(int i = 1; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of characters in a string: " + count);
    }
}

