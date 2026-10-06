class StringOperations {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("First Character: " + str.charAt(0));

        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + reverse);

        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Replace: " + str.replace("World", "Java"));
    }
}