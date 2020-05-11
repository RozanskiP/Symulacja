# Symulacja

### Analiza czasownikowo-rzeczownikowa

Potrzebujemy 3 obiekty, które będą reprezentować klasy społeczne posiadające różne właściwości i zachowania (ilość danej populacji będzie podawana przy starcie programu). Będą to niewolnicy posiadający ubrania i jedzenie, rzemieślnicy posiadający narzędzia i materiały, arystokracja posiadająca złoto i towary. W późniejszej fazie gdy będą mogli awansować (gdy zdobędą 2/3 zadanej populacji) Niewolnicy -> Mieszczanie, Rzemieślnicy-> Handlarze, Arystokracja -> Szlachta. Awans da im możliwość 2 ruchów w jednej turze i po 5% więcej wymaganej do wygranej populacji(nie będą mogły już tego stracić).  Każda z nich będzie przemieszczać się po planszy w sposób losowy, poruszając się w ten sposób po planszy. (1 tura będzie wynosić 1 ruch każdej z klas) (wielkość planszy będzie wpisywana na starcie). Na polach będą znajdowały się losowo generowane (co 2 tury) towary, które będą mogły być zbierane. Po stanięciu przez klasę społeczną na polu obok drugiej klasy społecznej będą mógłby miedzy sobą handlować( w stosunku 1 do 1 czyli np. 1 złoto za 1 jedzenie). Klasa społeczna będzie zwiększać swoją populacje o 1 kiedy będzie posiadać obydwa towary( np. dla niewolnika to będzie 1 ubranie 1 jedzenie = +1 do populacji). Na planszy co 3 tury będą losowo pojawiać się też obiekty, pewne niebezpieczeństwa, które będą oddziaływać na klasy społeczne. Dla niewolników będą dzikie zwierzęta, dla rzemieślników bandyci a dla arystokracji złodzieje. Będą one zabijały losową liczbę osobników danej populacji po wejściu na odpowiednie pole i zabierały odpowiadająca losowej jednostce ilość towarów. Pole niebezpieczeństwa po całym zajściu znika. Na planszy w losowym miejscu będzie znajdować się warsztat i mennica, który po wejściu na zakres jego bufa jednej z klas społecznych będzie przejęte. Warsztat będzie mnożył znalezione towary razy 2 a mennica podniesie poziom towarów danej klasy o 5. Każda klasa ma swoje właściwości: Niewolnicy - mają x%(podawanej przy starcie symulacji) szans na zdobycie 2 towarów i mogą być w warsztacie tylko 3 tury. Rzemieślnicy – mają x%(podawanej przy starcie symulacji) szans na uniknięcie niebezpieczeństwa i tracą ruch co 5 tur.  Arystokracja – zaczyna z x(podawana przy starcie symulacji) większa populacja niż reszta klas i co 3 spotkanie niebezpieczeństwa tracą 2 razy więcej członków populacji. Symulacja kończy się gdy jedna z klas posiada większa populacje niż zadana na początku.

### Download 

* Clone the repository.
  ```
  git clone https://github.com/RozanskiP/Symulacja
  ```
### Diagramy Klas

![Diagramy Klas](https://github.com/RozanskiP/Symulacja/blob/master/Dokumentacja/Diagramy%20Klas.png)

### Diagram sekwencji

![Diagram sekwencji](https://github.com/RozanskiP/Symulacja/blob/master/Dokumentacja/Diagram%20sekwencji.png)



### Autorzy:
**Paweł Różański**, **Wojtek Bednarczyk**
