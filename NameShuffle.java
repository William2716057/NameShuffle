public class NameShuffle {
    public static String nameShuffle(String fullName) {
        // Split into first and last names
        String[] names = fullName.split(" ");

        // Check if contains at least two names
        if (names.length >= 2) {
            // Swap the first and last names
            String shuffledName = names[names.length - 1] + " " + names[0];
            return shuffledName;
        } else {
            // Return the original name if it doesn't contain first and last
            return fullName;
        }
    }

    public static void main(String[] args) {
	//output
        System.out.println(nameShuffle("Homer Simpson"));
        System.out.println(nameShuffle("Peter Griffin"));
    }
}
