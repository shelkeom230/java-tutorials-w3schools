public class prog7_strings {
    public static void main(String[] args) {
        String txt = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("the lenght of string is " + txt.length());

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("a")); // first occurence index

        // string concatenation
        String firstName = "omkar";
        String lastName = "shelke";
        System.out.println(firstName + " " + lastName);

        // using concat method
        System.out.println(firstName.concat(lastName));

        // string special characters
        // \'- single quote
        // \" - double quote
        // \\ - backslash

        System.out.println("the panhala is also called as \\ \'panhalgadh\'");
    }
}
