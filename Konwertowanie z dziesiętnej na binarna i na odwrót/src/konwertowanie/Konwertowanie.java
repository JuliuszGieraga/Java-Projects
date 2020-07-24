
package konwertowanie;

import java.util.Scanner;
 
class Konwertowanie
{
        public static void main(String args[])
        {
            System.out.println("Podaj 1 aby z binarnej na dziesietna lub 2 aby z dziesietnej na binarna");
            
            Scanner sc1 = new Scanner(System.in);
            
            int l =sc1.nextInt();
            
            if(l==1)
            {
                Scanner s = new Scanner(System.in);
            
                System.out.println("Podaj liczbe binarna");
            
                int potega=s.nextInt();
            
                int  liczba = 0, p = 0;
            
                while(potega != 0)
                {
                    liczba +=((potega%10) * Math.pow(2,p));
                    potega/=10;
                    p++;
                }
                System.out.println("Podana liczba to " + liczba + " w postaci dziesietnej");
            
            }
            else if(l==2)
            {
        int dziesietna,
            licz, 
            i=1, 
            j;
            
        int bin_num[] = new int[100];
        
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Podaj liczbe dziesietna ");
        
        dziesietna = scan.nextInt();
		
        licz = dziesietna;
		
        while(licz != 0)
        {
            bin_num[i++] = licz%2;
            licz = licz/2;
        }
		
        System.out.print("Binarna postac to ");
        
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
            }
            else
            {
                System.out.println("blad");
            }
            
        }
        }