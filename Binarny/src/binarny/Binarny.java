package binarny;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;


public class Binarny
{

	public static void zmiana_na_binarny(int liczba)
	{
		int binarny[] = new int[100];
                
		int wiersz = 0;
                
		while (liczba > 0)
		{
			binarny[wiersz++] = liczba % 2;
                        
			liczba = liczba / 2;
		}
		for (int i = wiersz - 1; i >= 0; i--)
		{
			System.out.print(binarny[i]);
		}
	}


	public static void main(String[] args)
	{
            System.out.println("Podaj wartość która ma byc zmieniona na binnarną ");
            
            List < Integer > ASCII = new ArrayList < > ();
		
            Scanner scan = new Scanner(System.in);
            
            String scanner = scan.nextLine();

            char[] znaki = scanner.toCharArray();
            
            System.out.println("zmieniony napis na binarny");

            for (char znak: znaki)
            {
                ASCII.add((int) znak);
            }
            for (Integer ASCIIs: ASCII)
            {
		zmiana_na_binarny(ASCIIs);
            }
            System.out.println("");
	}
}







