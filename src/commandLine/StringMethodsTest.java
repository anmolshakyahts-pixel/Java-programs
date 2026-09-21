package commandLine;

public class StringMethodsTest {

        public static void main(String[] args) {

            String str = " Hello World! ";
            System.out.println("Original String: \"" + str + "\"");
            System.out.println("Length: " + str.length());
            System.out.println("Character at index 4: " + str.charAt(4));
            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " + str.toLowerCase());
            String trimmed = str.trim();
            System.out.println("Trimmed: \"" + trimmed + "\"");
            System.out.println("Substring (index 0 to 5 of trimmed): " + trimmed.substring(0, 5));
            System.out.println("Replace 'World' with 'Java': " + trimmed.replace("World", "Java"));
            System.out.println("Equals 'Hello World!': " + trimmed.equals("Hello World!"));
            System.out.println("Equals Ignore Case 'hello world!': " + trimmed.equalsIgnoreCase("hello world!"));
            System.out.println("Contains 'World': " + trimmed.contains("World"));
        }
    }

