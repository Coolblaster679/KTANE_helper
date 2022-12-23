import java.lang.Math;
import java.util.*;
public class Main {
  public static boolean tf() { 
    return (Math.random() * 2 > 1); 
  }
  public static int findIndex(int arr[], int t){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == t) {
        return i;
      }
    }
    return -1;
  }
  public static void strike() {
    int s = bomb.strike();
    if (s > 0) {
      System.out.println(s + " strikes left");
    } else {System.out.println("BOOM!");}
  }
  public static void clear() {
    for (int i = 0; i < 50; i++) {System.out.println();}
  }
  public static boolean[] toMorse(char cha) {
    String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l","m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x","y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",",", ".", "?" };
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.","...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----","..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.","-----", "--..--", ".-.-.-", "..--.." };
    String str = cha + "";
    int index = -1;
    for (int i = 0; i < english.length; i++) {
      if (english[i].equals(str)) {
        index = i;
      }
    }
    boolean[] r = new boolean[morse[index].length()];
    for (int i = 0; i < r.length; i++){
      if (morse[index].charAt(i) == '-') {
        r[i] = true;
      } else {r[i] = false;}
    }
    return r;
  }
  public static Pair<String> diff(String a, String b) {
        return diffHelper(a, b, new HashMap<>());
  }
  private static Pair<String> diffHelper(String a, String b, Map<Long, Pair<String>> lookup) {
        long key = ((long) a.length()) << 32 | b.length();
        if (!lookup.containsKey(key)) {
            Pair<String> value;
            if (a.isEmpty() || b.isEmpty()) {
                value = new Pair<>(a, b);
            } else if (a.charAt(0) == b.charAt(0)) {
                value = diffHelper(a.substring(1), b.substring(1), lookup);
            } else {
                Pair<String> aa = diffHelper(a.substring(1), b, lookup);
                Pair<String> bb = diffHelper(a, b.substring(1), lookup);
                if (aa.first.length() + aa.second.length() < bb.first.length() + bb.second.length()) {
                    value = new Pair<>(a.charAt(0) + aa.first, aa.second);
                } else {
                    value = new Pair<>(bb.first, b.charAt(0) + bb.second);
                }
            }
            lookup.put(key, value);
        }
        return lookup.get(key);
    }
  public static class Pair<T> {
        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public final T first, second;

        public String toString() {
            return "(" + first + "," + second + ")";
        }
    }
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter first how much time you'd like in seconds (no decimals), then how many modules, and lastly which modules. 0 is wires, 1 is button, 2 is keypads, 3 is simon says, 4 is who's on first, 5 is memory, 6 is morse code, 7 is complicated wires, 8 is wire sequences, 9 is mazes, and 10 is passwords. \n\nEnter things one at a time with an enter/return key between them. After you are done, you may need to scroll down.");
    int timee = myObj.nextInt();
    int[] tempm = new int[myObj.nextInt()];
    for (int i = 0; i < tempm.length; i++) {
      switch (myObj.nextInt()) {
        case 0:
          tempm[i] = 5;
          break;
        case 1:
          tempm[i] = 3;
          break;
        case 2:
          tempm[i] = 4;
          break;
        case 3:
          tempm[i] = 6;
          break;
        case 4:
          tempm[i] = 7;
          break;
        case 5:
          tempm[i] = 8;
          break;
        case 6:
          tempm[i] = 9;
          break;
        case 7:
          tempm[i] = 0;
          break;
        case 8:
          tempm[i] = 2;
          break;
        case 9:
          tempm[i] = 10;
          break;
        case 10:
          tempm[i] = 1;
          break;
      }
    }
    bomb b = new bomb(timee,tempm);
    myObj.nextLine();
    clear();
    System.out.println(b.toString() + "\n");
    while (true) {
      boolean cleared = true;
      for (int i = 0; i < bomb.modules.length; i++) {if (!((module)(bomb.modules[i])).isClear()) {cleared = false;}}
      if (bomb.timeLeft() < 0) {
        System.out.println("You ran out of time");
        System.exit(0);
      } else if (cleared) {
        System.out.println("Congrats! You had " + bomb.timeLeft() + " seconds left.");
        System.exit(0);
      }
      System.out.println("What do you what to look at? Type a number to check a module (1 being the first module you entered), a letter to check bomb, and -2 to stop the program");
      int temp2 = -1;
      try {
        temp2 = Integer.parseInt(myObj.nextLine())-1;
        clear();
      } catch(Exception e) {
        System.out.println("\n");
        System.out.println(b.toString());
      }
      if (temp2 == -2) {
        System.exit(0);
      } else if (!(temp2 == -1)) {
        b.check(temp2);
      }
    }
  }
}
