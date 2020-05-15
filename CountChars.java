import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class CountChars {

  public static void main (String[] args) {
    int total_characters = 0;
    int total_digits = 0;
    int total_alphabets = 0;
    int total_symbols = 0;
    int total_spaces = 0;
    String string = new String();
    Scanner scanner = new Scanner(in);

    out.print("\n" + " Enter a string: ");
    string = scanner.nextLine();
    out.println("\n" + " Given string is " + string);
    out.println();

    char[] characters = new char[string.length()];
    characters = string.toLowerCase().toCharArray();

    for (int i = 0; i < characters.length; i++) {
      total_characters++;

      if (checkAlpha(characters[i])) {
        total_alphabets += 1;
      }
      else if (checkDigit(characters[i])) {
        total_digits += 1;
      }
      else if (checkSymbol(characters[i])) {
        total_symbols += 1;
      }
      else {
        total_spaces += 1;
      }

    }

    out.println(" #################### ");
    out.println(" Total Characters: " + total_characters);
    out.println(" Total Alphabets: " + total_alphabets);
    out.println(" Total Symbols: " + total_symbols);
    out.println(" Total Digits: " + total_digits);
    out.println(" Total Spaces: " + total_spaces);
  }

  public static boolean checkAlpha (char ch) {
    char[] alphabets = new char[]{'a', 'b', 'c', 'd' ,'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    for (char c: alphabets) {
      if (ch == c) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean checkSymbol (char ch) {
    char[] symbols = new char[]{'!', '@', '#', '$' , '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '[', ']', '{', '}', ':', ';', '\'', '\"', ',', '<', '.', '>', '/', '?', '\\', '|', '`', '~'};
    for (char c: symbols) {
      if (ch == c) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean checkDigit (char ch) {
    char[] digits = new char[]{'0','1','2','3','4','5','6','7','8','9'};
    for (char c: digits) {
      if (ch == c) {
        return true;
      }
    }
    return false;
  }
  
}