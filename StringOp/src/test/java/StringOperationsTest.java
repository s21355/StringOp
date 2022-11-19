import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class StringOperationsTest {
    private static StringOperations stringOperations;

// Init stringOperations
    @BeforeAll
    public static void setUp() {
        stringOperations = new StringOperations();
    }

//Reverse tests

    @Test
    public void testReverse() {
        String input = "mice";
        String reverse = stringOperations.reverse(input);
        Assertions.assertEquals(reverse, "ecim");
    }

    @Test
    public void testReverseCapitalize() {
        String input = "Mice";
        String reverse = stringOperations.reverse(input);
        Assertions.assertEquals(reverse, "eciM");
    }

    @Test
    public void testReverseSpecial() {
        String input = "#@@";
        String reverse = stringOperations.reverse(input);
        Assertions.assertEquals(reverse, "@@#");
    }

    @Test
    public void testReverseNumber() {
        String input = "03211";
        String reverse = stringOperations.reverse(input);
        Assertions.assertEquals(reverse, "11230");
    }

    @Test
    public void testReverseSpaces() {
        String input = "mn  i e";
        String reverse = stringOperations.reverse(input);
        Assertions.assertEquals(reverse, "e i  nm");
    }

    @Test
    public void testReverseEmpty() {
        String input = "";
        Assertions.assertThrows(NullPointerException.class,()->stringOperations.reverse(input));
    }

//Concat tests

    @Test
    public void testConcatAdd() {
        String input1 = "John";
        String input2 = "Doe";
        String concat = stringOperations.concat(input1, input2);
        Assertions.assertEquals(concat, "JohnDoe");
    }

    @Test
    public void testConcatAddSpecial() {
        String input1 = "John@#$&";
        String input2 = "Doe^#!";
        String concat = stringOperations.concat(input1, input2);
        Assertions.assertEquals(concat, "John@#$&Doe^#!");
    }

    @Test
    public void testConcatAddNumber() {
        String input1 = "0101";
        String input2 = "9999";
        String concat = stringOperations.concat(input1, input2);
        Assertions.assertEquals(concat, "01019999");
    }

    @Test
    public void testConcatAddSpaces() {
        String input1 = "End of  the";
        String input2 = "Sentence ";
        String concat = stringOperations.concat(input1, input2);
        Assertions.assertEquals(concat, "End of  theSentence ");
    }

    @Test
    public void testConcatEmpty() {
        String input1 = "";
        String input2 = "";
        Assertions.assertThrows(NullPointerException.class,()->stringOperations.concat(input1, input2));
    }

//Palindrome tests

    @Test
    public void testIsPalindrom(){
        String input= "hannah";
        Assertions.assertTrue(stringOperations.isPalindrome(input));
    }

    @Test
    public void testIsPalindromCapitalize(){
        String input= "Hannah";
        Assertions.assertTrue(stringOperations.isPalindrome(input));
    }

    @Test
    public void testIsPalindromSpecial(){
        String input= "%%!%%";
        Assertions.assertTrue(stringOperations.isPalindrome(input));
    }

    @Test
    public void testIsPalindromNumber(){
        String input= "01233210";
        Assertions.assertTrue(stringOperations.isPalindrome(input));
    }

    @Test
    public void testIsPalindromSpaces(){
        String input= "Han nah";
        Assertions.assertTrue(stringOperations.isPalindrome(input));
    }

    @Test
    public void testIsPalindromEmpty(){
        String input= "";
        Assertions.assertThrows(NullPointerException.class,()->stringOperations.isPalindrome(input));
    }

//Clear

    @AfterAll
    static void tearDown() {
        stringOperations = null;
    }

}