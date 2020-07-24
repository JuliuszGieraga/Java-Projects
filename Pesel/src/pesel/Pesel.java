package pesel;

import java.util.Scanner;

public class Pesel 
{

    public static void main(String[] args) 
    {   
        System.out.println("Podaj PESEL");
        
        Scanner pesel_u = new Scanner(System.in);

        String pesel =pesel_u.nextLine();
        
        if(pesel.length()<11)
        {
            System.out.println("za krótki");
            return;
        }
        else if(pesel.length()>11)
        {
            System.out.println("za dlugi");
            return;
        }
        else
        try
        {
     
        int i = Integer.parseInt(pesel.substring(9, 10).trim());
        
        if(i%2 ==0)
        {
            System.out.println("Kobieta");
        }
        else
        {
            System.out.println("Mężczyzna");
        }
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("błąd");
            
            return;
        }
        System.out.println("Rok urodzenie "+"19"+pesel.substring(0,2));

        try
        {
            int i = Integer.parseInt(pesel.substring(2,4).trim());
            
            int b = Integer.parseInt(pesel.substring(4,6).trim());
            
            int max = 31;
            int min = 1;
            int max2 =30;
            int max3 =28;
            
            if(i == 1)
            {
                if(b<=max && b>=min)
                {
                    System.out.println(b);
                }                    
            }
            else if(i == 2)
            {
                if(b<=max3 && b>=min)
                {
                    System.out.println(b);
                }                   
            }
            else if(i == 3)
            {
                if(b<=max && b>=min)
                {
                    System.out.println(b);
                }                   
            }
            else if(i == 4)
            {
                if(b<=max2 && b>=min)
                {
                    System.out.println(b);
                }                    
            }
             else if(i == 5)
            {
                if(b<=max && b>=min)
                {
                    System.out.println(b);
                }                    
            }
             else if(i == 6)
            {
                if(b<=max2 && b>=min)
                {
                    System.out.println(b);
                }                    
            }
             else if(i == 7)
            {
                if(b<=max && b>=min)
                {
                    System.out.println(b);
                }                    
            }
              else if(i == 8)
            {
                if(b<=max && b>=min)
                {
                    System.out.println(b);
                }                    
            }
              else if(i == 9)
            {
                if(b<=max2 && b>=min)
                {
                    System.out.println(b);
                }
            }
              else if(i == 10)
            {
                if(b<=max && b>=min)
                {
                    System.out.println(b);
                }
            }
              else if(i == 11)
            {
                if(b<=max2 && b>=min)
                {
                    System.out.println(b);
                }  
            }
              else if(i == 12)
            {
                if(b<=max && b>=min)
                {
                    System.out.println(b);
                }    
            }
            else
             {
                if(i>12)
                {
                    System.out.println("blad podanego miesiaca");
                } 
                else if(i<=00)
                {
                    System.out.println("blad podanego miesiaca");
                }
                  }
                String[] tab={"styczeń","luty","marzec","kwiecień","maj","czerwiec","lipiec","sierpień","wrzesień","październik","listopad","grudzień"};

                String index = tab[i-1];
                
                System.out.println(index);
        }
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
            System.out.println("błąd");
            
            return;
        }  
    }
}