# Rzut kostką
Opis projektu rzutu kostka

Program Stworzony w NEATBEANS 8.2

Aby zobaczyć kod należy wejść w plik src
# Program
- Prosi o podanie wartości która bedzie odpowiadać danej metodzie
- Po przez Scanner wprowadza dane do dalszego działania
- Po wyborze spośród 3 opcji wykonuje sie dalej 
- Dla 1 bedzie to Pojedynczy rzut kostką
- Nastepnie zostaniesz poproszony o wprowadzenie liczby parzystej
  większej bądź równej 4. Będzie to liczba oczek na kostce
- Gdy liczba zostanie wprowadzona. Program losuje z przedziału 
  od 1 do wybranej przez Ciebie liczby i wypisuje
  Wylosowana liczba to : jakaś liczba
- Po zakończonej operacji wyskakuje menu 
  Jeżeli chcesz powtórzyć rzut wciśnij 1
  Jeżeli chcesz zamknąć program wciśnij 2
  Jeżeli chcesz wrócić do menu wcisnij 3   
- W przypadku 2 jest to Wielokrotny rzut kostką
- Tak jak w przypadku 1 wybierasz liczbe oczek
- Gdy liczba zostanie podana nalezy wprowadzić ilość powtórzeń rzutu
- Program bedzie losować z podanego przedziału n razy 
  gdzie n jest liczba podaną przez użytkownika
- Gdy program się skończy wyskoczy  menu jak dla 1
- W przypadku 3 Program sie zamyka   

# Opis Programu dla 1

Program działa na prostej zasadzie
Na początku mamy menu w którym Scanner sprawdza czy dana wartość jest prawidłowa
Nastepnie gdy przejdzie przez ten etap odpala sie metoda odpowiedzialna za dany
wybór 
W przypadku jedynki jest to Pojedyczy rzut.
Zostają sprawdzone parametry wprowadzone przez uzytkownika 
Takie jak Czy liczba większa od 4 i czy parzysta 
Jeżeli tak program sie wykonuje 
Zastosowałem tu funkcje Random która losuje mi z przedziału podanego wcześniej 
Po zakonczeniu Liczba zostaje wypisana wraz z menu do dalszego działania lub 
Zakończenia 

# Opis Programu dla 2

Dla drugiego przypadku w wiekszości jest zbudowany na podstawie 1 
Jedyne co zostało usprawnione to dodałem pętle for która ma sie wykonywać tyle 
razy ile podał użytkownik
Po zakończeniu wyskoczy nam menu wyboru jak w przypadku 1

# Opis Programu dla 3

Dla wybroru 3 zwróci nam jedynie 
Zamykam Program