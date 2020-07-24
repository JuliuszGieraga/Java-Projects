package palindrom;

import java.util.Scanner;


public class Palindrom {

   public static void main(String[] args) 
   {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int h = A.length();
        int kk = 0;
        int k = (h - 1);
        for (int i = 0; i < h; i++) 
        {
            if (A.charAt(k) != A.charAt(i)) 
            {
                kk = 1;
                break;
            }
            k--;
        }

        if (kk == 1)
            System.out.println("Nie jest palindromem");
        else {
            System.out.println("Jest palindromem");
        }
        
        
    }
    
}
