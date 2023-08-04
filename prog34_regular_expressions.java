import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prog34_regular_expressions {
    public static void main(String[] args) {
        /*
         * regular expression- sequence of characters that forms a search pattern.
         * 
         * used to search data in text.
         * 
         * can be a single char or it can be more complicated pattern.
         * 
         * suitable for all type of text search and text replace operations
         *
         * java does not have built in regular expression class, but we can import
         * java.util.regex package to work with regular expressions.
         * 
         * package includes following classes -
         * 1. pattern class- defines a pattern
         * 2. matcher - used to search for a pattern
         * 3. patternSyntaxException- indicates syntax error in a regular expression.
         */

        // occurence of iisc in the sentence
        Pattern ptn = Pattern.compile("omkar", Pattern.CASE_INSENSITIVE);

        Matcher matcher = ptn.matcher("omkar shelke");

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("match found");
        } else {
            System.out.println("match not found.");
        }

    }
}
