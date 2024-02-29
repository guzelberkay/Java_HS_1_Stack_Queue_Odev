package com.berkay;
import java.util.Scanner;
import java.util.Stack;

public class PalindromMu {
    public static void main(String[] args) {
        /**
         * 1-Dışarıdan bir kelime alıp bu kelimeyi bir stack e ekleyelim
         * daha sonra bu stack uzerinde calısıp kelimenin palindrom olup
         * olmadıgını kontrol edelim.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        // Kelimeyi stack e ekleyelim

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<kelime.length();i++){
            stack.push(kelime.charAt(i));  // girilen kelimeyi karakterlere böldük.
        }

        boolean palindromMu = true;
        for (int i = 0; i< kelime.length();i++){
           if (stack.pop()!=kelime.charAt(i)){
               /**
                * stack.pop() methodu stack in en üstündeki karakteri döndürür.
                * ve stack den kaldırır
                */
               palindromMu = false;
               break;
           }
        }
        if (palindromMu){
            System.out.println("Girilen kelime palindrom dur.");
        }else {
            System.out.println("Girilen kelime palindrom degildir.");
        }
    }
}
