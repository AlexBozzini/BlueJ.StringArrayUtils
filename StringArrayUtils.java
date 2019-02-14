import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int arrayLength = array.length;
        return array[arrayLength - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int arrayLength = array.length;
        return array[arrayLength -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
      for (String s: array){
          if(s.equals(value))
            return true;
        }
        return false;
}

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       for (int i = 0; i < array.length / 2; i++){
           String temp = array[i];
           array [i] = array[array.length - i - 1];
           array [array.length - i - 1] = temp;
        }
        return array;
      
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.toString(array).equals(Arrays.toString(reverse(array)));
}

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
       for (char letter = 'a'; letter <= 'z'; letter ++){
           String value = Arrays.toString(array).toLowerCase();
           String containsLetter = String.valueOf(letter);
           if (!value.contains(containsLetter)){
               return false;
        } 
}
return true;
}

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < Integer.valueOf(array.length); i++){
            if (value.equals(array[i])){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        Integer count = 0;
        for (int i = 0; i < Integer.valueOf(array.length); i++){
            
            if (valueToRemove.equals(array[i-count])){
                String[] endOfTheArray = Arrays.copyOfRange(array, i-count+1, array.length);
                for(int j = 0; j < endOfTheArray.length; j++) {
                    array[i-count + j] = endOfTheArray[j];    
                }
                count++;
            }
        }
        return Arrays.copyOf(array, array.length - count);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
      Integer count = 0;
        for (int i = 1; i < Integer.valueOf(array.length); i++){
            
            if (array[i].equals(array[i - 1])){
                String[] endOfTheArray = Arrays.copyOfRange(array, i-count+1, array.length);
                for(int j = 0; j < endOfTheArray.length; j++) {
                    array[i-count + j] = endOfTheArray[j];    
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(array, array.length - count)));
        return Arrays.copyOf(array, array.length - count);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
