# PESEL
Opis projektu sprawdzającego date urodzenia oraz płeć.

Program Stworzony w NEATBEANS 8.2

Aby zobaczyć kod należy wejść w plik src

# Program
- Wprowadzasz wartość poprzez Scanner
- Następnie sprawdzane są wymiary parametru
- W razie problemu wypisuje błąd
- Następnie jest dzielony na fragmenty takie jak
  pierwsze dwa rok urodzenia
  kolejne dwa miesiąc
  nastepne dzien urodzenia
- na tej podstawie ustala 
  płeć rok dzień miesiać 
- np wprowadzamy pesel
  78051954671
  Jeżel komuś trafiłem w pesel to czysty przypadek :D
  Wypisuje nam

- Mężczyzna   //(ponieważ przed ostatnia liczba określa płeć jezeli parzytka Kobieta jeśli nie Mężczyzna )
  Rok urodzenia 1978
  19
  Maj

# Opis Programu

Scanner przyjmuje jeden wyraz.
Sprawdza nastepnie czy kobieta czy mężczyzna na podstawie przed ostatniej cyfry.
Rok urodzenia jest dopisaniem do 19 roku urodzenia np.78 zatem 1978
Sprawdza także czy dzien podany w danym miesiącu istnieje np 30 luty nie istnieje 
Zastosowałem także tablice miesiecy do wypisywania nazw danego miesiąca.