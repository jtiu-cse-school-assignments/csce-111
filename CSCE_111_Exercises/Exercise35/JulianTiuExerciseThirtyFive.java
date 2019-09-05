import java.util.ArrayList;
import java.util.Arrays;

public class JulianTiuExerciseThirtyFive
{
    
    public static void main(String[] args){
        
        System.out.println();
        
        int[] x = {1,7,3};
        int[] y = {1,2,4,5};
        int[] z = {5,3,6,1,4};
        hasInt(7, x);
        hasInt(3, y);
        hasInt(4, z);
        
        System.out.println();
        
        String[] v1 = {"fizz", "buzz", "bang", "boom"};
        String[] w1 = {"fizz", "buzz", "bang", "boom"};
        String[] x1 = {"buzz", "bang", "boom"};
        String[] y1 = {"1", "2", "$$#%^", "pico"};
        String[] z1 = {"5", "3", "6", "1", "4"};
        hasString("fizz", v1);
        hasString("Fizz", w1);
        hasString("fizz", x1);
        hasString("buzz", y1);
        hasString("4", z1);
        
        System.out.println();
        
        int[] x2 = {1, 7, 3};
        int[] y2 = {1, 2, 4, 5};
        int[] z2 = {5, 3, 6, 1, 4};
        maxInt(x2);
        maxInt(y2);
        maxInt(z2);
        
        System.out.println();
        
        String[] w3 = {"fizz", "buzz", "bang", "boom"};
        String[] x3 = {"Fizz", "buzz", "bang", "boom"};
        String[] y3 = {"1", "2", "$$#%^", "pico"};
        String[] z3 = {"5", "3", "6", "1", "4"};
        firstString(w3);
        firstString(x3);
        firstString(y3);
        firstString(z3);
        
        System.out.println();
        
        String[] v4 = {"a", "big", "fat", "cat"};
        String[] w4 = {"Fizz", "buzz", "bang", "boom"}; 
        String[] x4 = {"1", "2", "$$#%^", "pico"};
        String[] y4 = {"5", "3", "6", "1", "4"};
        String[] z4 = {"These", "Are", "the", "Good", "Old", "days"};
        longestString(v4);
        longestString(w4);
        longestString(x4);
        longestString(y4);
        longestString(z4);
        
        System.out.println();
        
        int[] w5 = {7,3};
        int[] x5 = {2,7,3};
        int[] y5 = {1,2,4,5};
        int[] z5 = {5,3,6,1,4};
        placeInt(7, w5);
        placeInt(7, x5);
        placeInt(3, y5);
        placeInt(4, z5);
        
        System.out.println();
        
        String[] s6 = {"fizz", "buzz", "bang", "boom"};
        String[] t6 = {"fizz", "buzz", "bang", "boom"};
        String[] u6 = {"fizz", "buzz", "bang", "boom"};
        String[] v6 = {"fizz", "buzz", "bang", "boom"};
        String[] w6 = {"fizz", "buzz", "bang", "boom"};
        String[] x6 = {"buzz", "bang", "boom"};
        String[] y6 = {"1", "2", "$$#%^", "pico"};
        String[] z6 = {"5", "3", "6", "1", "4"};        
        placeString("fizz", s6);
        placeString("buzz", t6);
        placeString("bang", u6);
        placeString("boom", v6);
        placeString("Fizz", w6);
        placeString("fizz", x6);
        placeString("buzz", y6);
        placeString("4", z6);
        
        System.out.println();
        
        array2Ints(7, 3);
        array2Ints(7, 7);
        array2Ints(3, 7);
        array2Ints(3, -4);
        
        System.out.println();
        
        array2Strings("washington", "irving");
        array2Strings("washington", "Irving");
        array2Strings("Washington", "irving");
        array2Strings("washington", "Washington");
        
        
        System.out.println();
        
        int[] w7 = {3,7};
        int[] x7 = {5,3};
        int[] y7 = {3,3};
        int[] z7 = {3, -4};
        sort3Ints(5, w7);
        sort3Ints(7, x7);
        sort3Ints(3, y7);
        sort3Ints(3, z7);
        
        System.out.println();
        
        String[] w8 = {"washington", "irving"};
        String[] x8 = {"washington", "Irving"};
        String[] y8 = {"irving", "wallace"};
        String[] z8 = {"washington", "Washington"};
        sort3Strings("wallace", w8);
        sort3Strings("wallace", x8);
        sort3Strings("Washington", y8);
        sort3Strings("washington", z8);
        
        System.out.println();
        
        int[] u9 = {3, 4};
        int[] v9 = {1, 2};
        int[] w9 = {1, 2};
        int[] x9 = {3, 4};
        int[] y9 = {7, 7};
        int[] z9 = {7, 7};
        merge2Ints(u9, v9);
        merge2Ints(w9, x9);
        merge2Ints(y9, z9);
        
        System.out.println();
        
        String[] o10 = {"a", "b"};
        String[] p10 = {"c", "d"};
        String[] q10 = {"a", "b"};
        String[] r10 = {"c", "D"};
        String[] s10 = {"d", "c"};
        String[] t10 = {"b", "a"};
        String[] u10 = {"My", "Dear"};
        String[] v10 = {"Aunt", "Sally"};
        String[] w10 = {"my", "dear"};
        String[] x10 = {"Aunt", "Sally"};
        String[] y10 = {"Irving", "washington"};
        String[] z10 = {"Irving", "berlin"};
        merge2Strings(o10, p10);
        merge2Strings(q10, r10);
        merge2Strings(s10, t10);
        merge2Strings(u10, v10);
        merge2Strings(w10, x10);
        merge2Strings(y10, z10);
        
        System.out.println();
        
        
        
        System.out.println();
        
        
        
        System.out.println();
        
        
        
        System.out.println();
        
        int[] a1 = {3, 4};
        int[] b1 = {1};
        int[] c1 = {1, 2};
        int[] d1 = {1, 2};
        int[] e1 = {1, 2};
        int[] f1 = {2, 1};
        int[] g1 = {1, 2, 3, 4};
        int[] h1 = {1, 2, 3, 4};
        compare2IntArrays(a1, b1);
        compare2IntArrays(c1, d1);
        compare2IntArrays(e1, f1);
        compare2IntArrays(g1, h1);
        
        System.out.println();
        
        
        String[] a = {"and"};
        String[] b = {"or"};     
        String[] c = {"and", "but"};
        String[] d = {"or"};     
        String[] e = {"a", "b", "c", "d"};
        String[] f = {"a", "b", "c", "d"};      
        String[] g = {"a", "b", "c", "d"};
        String[] h = {"d", "c", "b", "d"};     
        String[] i = {"a", "b", "c", "d"};
        String[] j = {"A", "b", "C", "d"};       
        String[] k = {"Aunt", "Sally"};
        String[] l = {"Aunt", "Sally"};       
        String[] m = {"Aunt", "Sally"};
        String[] n = {"Aunt", "sally"};
        compare2StringArrays(a,b);
        compare2StringArrays(c,d);
        compare2StringArrays(e,f);
        compare2StringArrays(g,h);
        compare2StringArrays(i,j);
        compare2StringArrays(k,l);
        compare2StringArrays(m,n);
                
    }


    /*
    Given an int and an array of ints, return true if the array contains the int, false otherwise.
    
    hasInt(7, {1, 7, 3}) â†’ true
    hasInt(3, {1, 2, 4, 5}) â†’ false
    hasInt(4, {5, 3, 6, 1, 4}) â†’ true
    */
    
    public static boolean hasInt(int number, int[] numbers) {
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number)
            {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    
    
    
    /*
    Given a String and an array of Strings, return true if the array contains the String, false otherwise.
    Note: Capital letters count
    
    hasString("fizz", {"fizz", "buzz", "bang", "boom"}) â†’ true
    hasString("Fizz", {"fizz", "buzz", "bang", "boom"}) â†’ false
    hasString("fizz", {"buzz", "bang", "boom"}) â†’ false
    hasString("buzz", {"1", "2", "$$#%^", "pico"}) â†’ false
    hasString("4", {"5", "3", "6", "1", "4"}) â†’ true
    */
    
    public static boolean hasString(String paramString, String[] strings) {
                
        for(int i = 0; i < strings.length; i++){
            if(strings[i].equals(paramString)){
                
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    
    
    /*
    Given an an array of ints, return the largest int in the array.
    
    maxInt({1, 7, 3}) â†’ 7
    maxInt({1, 2, 4, 5}) â†’ 5
    maxInt({5, 3, 6, 1, 4}) â†’ 6
    */
    
    public static int maxInt(int[] numbers) {
        
        int temp = -1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > temp){
                
                temp = numbers[i];
            }
        }
        System.out.println(temp);
        return temp;
    }
    
    
    /*
    Given an array of Strings, return the first String in alphabetical order.
    Note: Capital letters count
    
    hasString({"fizz", "buzz", "bang", "boom"}) â†’ "bang"
    hasString({"Fizz", "buzz", "bang", "boom"}) â†’ "fizz"
    hasString({"1", "2", "$$#%^", "pico"}) â†’ "1"
    hasString({"5", "3", "6", "1", "4"}) â†’ "1"
    */
    
    public static String firstString(String[] strings) {
        
        String firstWord = "z";
        for(int i = 0; i < strings.length - 1; i++){
            int compare = strings[i].compareTo(firstWord);
            if(compare < 0){
                firstWord = strings[i];
            }
        }
        System.out.println(firstWord);
        return firstWord;
    }
    
    
    
    
    /*
    Given an array of Strings, return an array with the length of the longest string
    
    longestString({"a", "big", "fat", "cat"}) â†’ 3
    longestString({"Fizz", "buzz", "bang", "boom"}) â†’ 4
    longestString({"1", "2", "$$#%^", "pico"}) â†’ 5
    longestString({"5", "3", "6", "1", "4"}) â†’ 1
    longestString("These", "Are", "the", "Good", "Old", "days") â†’ 5
    
    */
    
    public static int longestString(String[] strings){
        
        int temp = 0;
        for(int i = 0; i < strings.length; i++){
            if(strings[i].length() > temp){
                temp = strings[i].length();
            }
        }
        System.out.println(temp);
        return temp;
    }
    
    
    
    /*
    Given an int and an array of ints, return -1 if the array does not contain the int
    Otherwise return the position of the int in the arrary.
    
    placeInt(7, {7, 3}) â†’ 0
    placeInt(7, {2, 7, 3}) â†’ 1
    placeInt(3, {1, 2, 4, 5}) â†’ -1
    placeInt(4, {5, 3, 6, 1, 4}) â†’ 4
    */
    
    public static int placeInt(int number, int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number)
            {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }
    
    
    
    /*
    Given a String and an array of Strings, return -1 if the array does not contain the String
    Otherwise return the position of the String in the arrary.
    
    placeString("fizz", {"fizz", "buzz", "bang", "boom"}) â†’ 0
    placeString("buzz", {"fizz", "buzz", "bang", "boom"}) â†’ 1
    placeString("bang", {"fizz", "buzz", "bang", "boom"}) â†’ 2
    placeString("boom", {"fizz", "buzz", "bang", "boom"}) â†’ 3
    placeString("Fizz", {"fizz", "buzz", "bang", "boom"}) â†’ -1
    placeString("fizz", {"buzz", "bang", "boom"}) â†’ -1
    placeString("buzz", {"1", "2", "$$#%^", "pico"}) â†’ -1
    placeString("4", {"5", "3", "6", "1", "4"}) â†’ 4
    */
    
    public static int placeString(String paramString, String[] strings) {
        for(int i = 0; i < strings.length; i++){
            if(strings[i].equals(paramString))
            {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }
    
    
    
    /*
    Given two ints, return an int array containing the ints in value order.
    
    array2Ints(7, 3) â†’ {3, 7}
    array2Ints(7, 7) â†’ {7, 7}
    array2Ints(3, 7) â†’ {3, 7}
    array2Ints(3, -4) â†’ {-4, 3}
    */
    
    public static int[] array2Ints(int firstNumber, int secondNumber) {
        
        int[] arr = {firstNumber, secondNumber};
        for(int i = 0; i < arr.length - 1; i++){
            
            if(firstNumber < secondNumber){
                arr[i] = firstNumber;
                arr[i+1] = secondNumber;
            }
            else{
                arr[i] = secondNumber;
                arr[i+1] = firstNumber;
            }
            System.out.println("{" + arr[i] + ", " + arr[i+1] + "}");
        }
        return arr;
    }
    
    
    
    /*
    Given two Strings return a String array containing the strings in alphabetical order.
    Note: Capital letters count
    
    array2Strings("washington", "irving") â†’ {"irving", "washington"}
    array2Strings("washington", "Irving") â†’ {"Irving", "washington"}
    array2Strings("Washington", "irving") â†’ {"Washington", "irving"}
    array2Strings("washington", "Washington") â†’ {"Washington", "washington"}
    
    */
    
    public static String[] array2Strings(String firstString, String secondString) {
        
        String[] arr = {firstString, secondString};
        int compare = firstString.compareTo(secondString);
        for(int i = 0; i < arr.length - 1; i++){
            if(compare < 0){
                arr[i] = firstString;
                arr[i+1] = secondString;
            }
            else if( compare > 0){
                arr[i] = secondString;
                arr[i+1] = firstString;
            }
            System.out.println("{" + arr[i] + ", " + arr[i+1] + "}");
        }
        return arr;
      
    }
    
    /*
    Given an int and an array of two ints, return an array of 3 ints sorted in value order.
    
    sort3Ints(5, {3, 7})  â†’  {3, 5, 7}
    sort3Ints(7, {5, 3})  â†’  {3, 5, 7}
    sort3Ints(3, {3, 3})  â†’  {3, 3, 3}
    sort3Ints(3, {3, -4}) â†’  {-4, 3, 3}
    */
    
    public static int[] sort3Ints(int intValue, int[] intArray) {
        int[] arr = new int[]{intValue, intArray[0], intArray[1]};
        Arrays.sort(arr);
        System.out.println("{" + arr[0] + ", " + arr[1] + ", " + arr[2] + "}");
        return arr;
    }
    
    
    
    /*
    Given a String and an array of two Strings,
    return a three String array containing the strings in alphabetical order.
    Note: Capital letters count
    
    sort3Strings("wallace", {"washington", "irving"}) â†’ {"irving", "wallace", "washington"}
    sort3Strings("wallace", {"washington", "Irving"}) â†’ {"Irving", "wallace", "washington"}
    sort3Strings("Washington", {"irving", wallace"}) â†’ {"Washington", "irving", "wallace"}
    sort3Strings("washington", {"washington", "Washington"}) â†’ {"Washington", "washington", "washington"}
    
    */
    
    public static String[] sort3Strings(String stringValue, String[] stringArray) {
        String[] arr = new String[]{stringValue, stringArray[0], stringArray[1]};
        Arrays.sort(arr);
        System.out.println("{" + arr[0] + ", " + arr[1] + ", " + arr[2] + "}");
        return arr;
    }
    
    
    /*
    Given two int arrays of length two, return a length four int array containing the ints in value order.
    Hint: use your array2Ints method
    
    merge2Ints({3, 4}, {1, 2})  â†’ {1, 2, 3, 4}
    merge2Ints({1, 2}, {3, 4})  â†’ {1, 2, 3, 4}
    merge2Ints({7, 7}, {7, 7})  â†’ {7, 7, 7, 7}
    
    */
    
    public static int[] merge2Ints(int[] firstNumbers, int[] secondNumbers) {
        int[] arr = new int[]{firstNumbers[0], firstNumbers[1], secondNumbers[0], secondNumbers[1]};
        Arrays.sort(arr);
        System.out.println("{" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + "}");
        return arr;
    }
    
    
    
    /*
    Given two Strings return a String array containing the strings in alphabetical order.
    Note: Capital letters count
    Hint: use your array2Strings method
    
    merge2Strings({"a", "b"}, {"c", "d"}) â†’ {"a", "b", "c", "d"}
    merge2Strings({"a", "b"}, {"c", "D"}) â†’ {"D", "a", "b", "c"}
    merge2Strings({"d", "c"}, {"b", "a"}) â†’ {"a", "b", "c", "d"}
    merge2Strings({"My", "Dear"}, {"Aunt", "Sally"}) â†’ {"Aunt", "Dear", "My", "Sally"}
    merge2Strings({"my", "dear"}, {"Aunt", "Sally"}) â†’ {"Aunt", "Sally", "dear", "my"}
    merge2Strings({"Irving", "washington"}, {"Irving", "berlin"})  â†’ {"Irving", "Irving", "berlin", "washington"}
    */
    
    public static String[] merge2Strings(String[] firstStrings, String[] secondStrings) {
        String[] arr = new String[]{firstStrings[0], firstStrings[1], secondStrings[0], secondStrings[1]};
        Arrays.sort(arr);
        System.out.println("{" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + "}");
        return arr;
      
    }
    
    /*
    Given an int array, return true if the array contains duplicate values.
    
    duplicateInts({3})  â†’ false
    duplicateInts({1, 2})  â†’ false
    duplicateInts({7, 7})  â†’ true
    duplicateInts({1, 2, 3, 4, 5})  â†’ false
    duplicateInts({1, 2, 3, 2, 4, 5})  â†’ true
    
    */
    
    public static boolean duplicateInts(int[] Numbers) {
        // Write your code here
        return false;
    }
    
    
    
    /*
    Given a String array, return true if the array contains duplicate values.
    Note: Capital letters count
    
    duplicateStrings({"a"}) â†’ false
    duplicateStrings({"a", "b", "c", "d"}) â†’ false
    duplicateStrings({"a", "a"})  â†’ true
    duplicateStrings({"A", "a"})  â†’ false
    duplicateStrings({"these", "are", "the", "times"}) â†’ false
    duplicateStrings({"these", "are", "the", "times", "they", "are"}) â†’ true
    
    duplicateStrings({"my", "dear"}, {"Aunt", "Sally"}) â†’ {"Aunt", "Sally", "dear", "my"}
    duplicateStrings({"Irving", "washington"}, {"Irving", "berlin"})  â†’ {"Irving", "Irving", "berlin", "washington"}
    */
    
    public static boolean duplicateStrings(String[] Strings) {
        // Write your code here
        return false;
      
    }
    
    /*
    Given an int array, return an int array with duplicate ints removed if the array contains duplicate values.
    
    removeDuplicateInts({3})  â†’ {3}
    removeDuplicateInts({1, 2})  â†’ {1, 2}
    removeDuplicateInts({7, 7})  â†’ {7}
    removeDuplicateInts({1, 7, 1, 7, 1})  â†’ {1, 7}
    removeDuplicateInts({1, 2, 3, 4, 5})  â†’ {1, 2, 3, 4, 5})
    removeDuplicateInts({1, 2, 3, 2, 4, 2, 5, 2})  â†’ {1, 2, 3, 4, 5}
    */
    
    public static boolean removeDuplicateInts(int[] Numbers) {
        // Write your code here
        return false;
    }
    
    
    
    /*
    Given a String array, return an String array with duplicate Strings removed if the array contains duplicate values.
    Note: Capital letters count
    
    removeDuplicateStrings({"a"}) â†’ {"a"}
    removeDuplicateStrings({"a", "b", "c", "d"}) â†’ {"a", "b", "c", "d"}
    removeDuplicateStrings({"a", "a"})  â†’ {"a"}
    removeDuplicateStrings({"A", "a"})  â†’ {"A", "a"}
    removeDuplicateStrings({"these", "are", "the", "times"}) â†’ {"these", "are", "the", "times"}
    removeDuplicateStrings({"these", "times", "are", "the", "times", "they", "are"}) â†’ {"these", "times", "are", "the", "they"})
    
    */
    
    public static boolean removeDuplicateStrings(String[] Strings) {
        // Write your code here
        return false;
      
    }
    
    /*
    Given two int arrays return true if the arrays contain the same values in the same order.
    Note: Order matters, see the third example 
    
    compare2IntArrays({3, 4}, {1}) â†’ false
    compare2IntArrays({1, 2}, {1, 2}) â†’ true
    compare2IntArrays({1, 2}, {2, 1}) â†’ false
    compare2IntArrays({1, 2, 3, 4}, {1, 2, 3, 4}) â†’ true
    */
    
    public static boolean compare2IntArrays(int[] firstNumbers, int[] secondNumbers) {
        if(firstNumbers.length != secondNumbers.length){
            System.out.println("false");
            return false;
        }
        else{
            for(int i = 0; i < firstNumbers.length; i++){
                if(firstNumbers[i] == secondNumbers[i]){
                    System.out.println("true");
                    return true;
                }
                else{
                    System.out.println("false");
                    return false;
                }
            }
        }
        System.out.println("false");
        return false;
    }
    
    
    
    /*
    Given two String arrays return true if the arrays contain the same values in the same order.
    Note: Order matters, see the forth example 
    Note: Capatil letters matter, see the final example 
    
    compare2StringArrays({"and"}, {"or"})  â†’ false
    compare2StringArrays({"and", "but"}, {"or"})  â†’ false
    compare2StringArrays({"a", "b", "c", "d"}, {"a", "b", "c", "d"})  â†’ true
    compare2StringArrays({"a", "b", "c", "d"}, {"d", "c", "b", "d"})  â†’ false
    compare2StringArrays({"a", "b", "c", "d"}, {"A", "b", "C", "d"})  â†’ false
    compare2StringArrays({"Aunt", "Sally"}, {"Aunt", "Sally"}) â†’ true
    compare2StringArrays({"Aunt", "Sally"}, {"Aunt", "sally"}) â†’ false
    */
    
    public static boolean compare2StringArrays(String[] firstStrings, String[] secondStrings) {
        if(firstStrings.length != secondStrings.length){
            System.out.println("false");
            return false;
        }
        else{
            for(int i = 0; i < firstStrings.length; i++){
                if(firstStrings[i].equals(secondStrings[i])){                   
                    System.out.println("true");
                    return true;
                }
                else{
                    System.out.println("false");
                    return false;
                }
            }
        }
        System.out.println("false");
        return false;
    }


}