package utils;

public class GenerateRndStr {

    /**
     * Method for generating a random string of length - n
     * @param n - string length
     * @return  - A string of the specified length
     */
    public static String getAlphaNumericString(int n)
    {
        // chose a random character from this string
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // creating a StringBuffer with the size AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generating a random number between
            // 0 variable length AlphaNumericString
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            // add the character one by one to the end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }
}