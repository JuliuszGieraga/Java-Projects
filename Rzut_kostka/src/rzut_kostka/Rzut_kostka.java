
package rzut_kostka;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class Rzut_kostka 
{
    public static void wielokrotnyrzut()
    {
        System.out.println("================");
        System.out.println("RZUT WIELOKROTNY");
        System.out.println("================");
        
        System.out.println("Podaj liczbe scian w kostce");
        
        System.out.println("========================================================");
        System.out.println("PAMIETAJ ILOSC OCZEK MUSI BYC PARZYSTA ORAZ WIEKSZA OD 4");
        System.out.println("========================================================");
       
        Scanner iloscoczek = new Scanner(System.in);
        
        Random ran = new Random(); 
        
        int ilosc = iloscoczek.nextInt();
        
        if(ilosc < 4)
        {
            System.out.println("Podałeś za małą ilość");
            
            return ;
        }
        else if(ilosc %2 != 0)
        {
            
            System.out.println("Ilosc ścian nieparzysta");
            return;
        }
        System.out.println("Podaj ile razy ma sie powtórzyc");
        
        Scanner iloscpow = new Scanner(System.in);
        
        int powtorzenia =iloscpow.nextInt();
        
        for(int i = 1;i <= powtorzenia;i++)
        {
            int randomowa = ran.nextInt(ilosc);
        
            if(randomowa == 0)
            {
                System.out.println(i + ". Wyslosowana liczba to : " + 1);
            } 
            else
            {
                System.out.println(i +  ". Wyslosowana liczba to : " + randomowa);
            }
        }
    }
    public static void wybor2()
    {
        System.out.println("Jezeli chcesz wrocic do menu wcisnij 1");
        
        System.out.println("Jezeli chcesz losowac jeszcze raz wcisnij 2");
        
        System.out.println("Jezeli chcesz zakonczyc wcisnij 3");
        
        Scanner wybor2 = new Scanner(System.in);
        
        int Wybor = wybor2.nextInt();
        
       if(Wybor == 1) 
        {
            menu();
        }
        else if(Wybor == 2)
        {
            wielokrotnyrzut();
            wybor2();
        } 
        else if(Wybor == 3)
        {
            System.out.println("Dziekuje za skorzystanie z programu :D");
        }    
        else
        {
            System.out.println("Nie rozumniem");
            wybor();
        }
    }
    
    public static void rzut ()
    {
        System.out.println("===============");
        System.out.println("RZUT POJEDYNCZY");
        System.out.println("===============");
        
        System.out.println("Podaj liczbe scian w kostce");
        
        System.out.println("========================================================");
        System.out.println("PAMIETAJ ILOSC OCZEK MUSI BYC PARZYSTA ORAZ WIEKSZA OD 4");
        System.out.println("========================================================");
        
        
        Scanner iloscoczek = new Scanner(System.in);
        
        Random ran = new Random(); 
        
        int ilosc = iloscoczek.nextInt(); 
        
        if(ilosc < 4  )
        {
            System.out.println("Podałeś za małą ilość");
            
            return ;
        }
        else if(ilosc %2 != 0)
        {
            
            System.out.println("Ilosc ścian nieparzysta");
            return;
        }
        
        int randomowa = ran.nextInt(ilosc);
        
        if(randomowa == 0)
        {
            System.out.println("Wyslosowana liczba to : " + 1);
            return;
        } 
        else
        {
            System.out.println("Wyslosowana liczba to : " + randomowa);
            return;
        }
        
        
    }
    
    public static void wybor()
    {
        System.out.println("Jezeli chcesz rzucic jeszcze raz wcisnij 1");
        
        System.out.println("Jezeli chcesz zamknac program 2");
        
        System.out.println("Jezeli chesz wrocic do menu 3");
        
        Scanner taklubnie = new Scanner(System.in); 
 
        int odpowiedz = taklubnie.nextInt();
  
        if(odpowiedz == 1) 
        {
            rzut();
            wybor();
            return;
        }
        else if(odpowiedz == 2)
        {
            System.out.println("Dziekuje za skorzystanie z programu :D");
            return;
        } 
        else if(odpowiedz == 3)
        {
            menu();
            return;
        }    
        else
        {
            System.out.println("Nie rozumniem");
            wybor();
            return;
        }
    }
    public static void menu()
    {
     System.out.println("1.Pojedynczy rzut\n2.Wielokrotny rzut\n3.Zamknij Program");
     
     Scanner rzut = new Scanner(System.in);
     
     int wybor = rzut.nextInt();
     
     if(wybor==1)
     {
        rzut();
        wybor();
        return;
     }
     else if(wybor==2) 
     {
        wielokrotnyrzut();
        wybor2();
        return;
     }
     else if (wybor ==3)
     {
         System.out.println("Zamknij program");
         return ;
     }    
     else
        System.out.println("Nie rozumiem");
        menu();
        return;
    }
    public static void main(String[] args) 
    {

        menu();
    
    }
   
}    
 
    
