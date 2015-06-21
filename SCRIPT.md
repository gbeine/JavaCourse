# Java Einführungskurs

### Einführung

- Java ist OOP
- Sprachfamilie C
- Virtuelle Maschine
- Entwicklung von Klassen
- Zur Laufzeit Objekte = Instanz von Klassen

### BlueJ starten

- Projekt wird automatisch erzeugt
- oben Arbeitsbereich, Klassen anlegen (wie UML)
- unten Laufzeitbereich, Objekte in der VM

### Klasse anlegen

- Punkt, besteht aus drei Bereichen
- Header, Variablen (=Datenstrukturen) und Methoden (=Verhalten des Objektes)
- Klasse ist Kapselung für Daten und Verhalten, Grundprinzip der OOP
- Kommentar für die Klassen

### Punkt bearbeiten

- Zwei Variablen (int x, int y)
- Konstruktur
- Kompilieren + Objekt erzeugen
- unten inspizieren (Doppelklick)

### Unit Test und Punkt bewegen

- Unit Test in BlueJ einschalten
- Einstellungen -> Interface -> Testwerkzeuge
- Rechtsklick auf Klasse, Testklasse erzeugen
- Doppelklick auf Testklasse, Erklären der Struktur
- setUp, tearDown erstmal unnötig, also löschen
- Test Methode für den Punkt schreiben
- Zugriff auf Daten im Punkt nötig
- Getter einführen, Methodendeklaration, Sichtbarkeit kommt später, erstmal nur public, Rückgabewert, Name
- Tests laufen lassen

### Konstruktoren

- Punkt an beliebigen Stellen erzeugen
- Zweiter Konstruktor mit Parametern
- Test für neuen Konstruktor
- Test durchführen
- Standardkonstruktor erklären, hat keine Parameter, eher theoretische Idee, nicht überall praktikabel
- Standardkonstruktor auf neuen Konstruktor zurückführen

### Punkt bewegen

- void erklären
- Test für bewegen schreiben
- Methode move schreiben, mathematische Kurzoperatoren erklären =+, =-, =*, =/

### Klasse Linie einführen

- Klasse anlegen
- Konstruktor als Linie aus zwei Punkten
- Abhängigkeit zwischen Klassen (gerichtet)
- Testklasse anlegen
- Getter für die Linie, Konzept von if/else erklären
- anhand der Getter Delegate-Prinzip erklären

## Aufgabe 1

Linie bewegen inkl. Test
Lösung ist Delegate via Punkt

## Aufgabe 2

Klasse für Kreis erstellen, inkl. Bewegen + Test
Konzepte aus Punkt und Linie wiederholen

### Zeichnen

- WhiteBoard importieren
- Einstellungen -> Bibliotheken -> Hinzufügen
- WhiteBoard erstellen
- Werkzeuge -> Klasse aus Bibliothek verwenden -> teaching.WhiteBoard (dann Tab), Konstruktor auswählen
- WhiteBoard geht auf

### Zeichnen der Linie und Kreise

- Methode draw für Linie und Kreis einführen
- import erklären

### Löschen vom WhiteBoard

- neue Instanzvariable für WhiteBoard und Shape
- Methode draw erweitern, Shape speichern
- Methode remove zum Löschen von Linien und Kreisen

### Null

- remove ohne draw führt zu NullPointer Exception
- remove muss geschützt werden

### Mehrere WhiteBoards

- Zeichnen auf mehreren WhiteBoards ist möglich, führt zur Unfähigkeit zum Löschen
- Zeichnen muss auf WhiteBoard prüfen

### Abstrakte Klassen

- Linie und Kreis teilen identischen Code zum Zeichnen und Löschen
- Lösung ist Abstraktion, Prinzip erklären
- Abstrakte Klasse Zeichenobjekt einführen
- Shape und WhiteBoard nach Zeichenobjekt verschieben
- Kreis und Linie von Zeichenobjekt ableiten
- Extends erklären
- Kompiliert nicht wegen Sichtbarkeit
- Sichtbarkeiten erklären private, protected, public

### Zeichnen & Löschen in abstrakter Klasse

- Methode remove in abstrakte Klasse verschieben
- Funktioniert
- Methode draw in abstrakte Klasse verschieben - geht nicht, wegen unterschiedlicher Zeichenfunktionen
- abstrakte Methoden erklären
- Methode drawForm einführen
- delegate in Vererbungshierarchie erklären
- drawForm in Linie und Kreis einführen
- draw in Linie und Kreis entfernen

### Collections

- einzeln zeichnen ist mühsam, soll erleichtert werden
- Klasse Figur einführen
- Collections erklären (Listen, Mengen, Tabellen)
- Set hinzufügen, HashSet erzeugen
- Objekte zum Set hinzufügen

### Generics und Interfaces

- Warnung beim Kompilieren
- Set sollte mit konkretem Typ verwendet werden
- Linien und Kreise sind unterschiedliche Typen
- Zeichenobjekt ist nicht empfehlenswert, weil es nicht move nicht kennt (und das spätere rotate auch nicht)
- stattdessen Interface Form einführen
- Linie und Kreis implementieren Interface

### Bewegen Figuren

- Methode move einführen
- foreach erklären
- Interface benötigt Methode move

## Aufgabe 3

Figur zeichnen und löschen 
Lösung ist draw und remove mit for each und delegate, müssen auch im Interface eingeführt werden

### Die Uhr - Erstes Programm

- neue Klasse Uhr anlegen
- main Methode erklären (static)
- Uhr zeichnen
- Ziffern sind sehr mühsam

### Rotieren des Punktes

- Methode rotate einführen, Algorithmus vorgeben
- statische Methoden aus Math erklären
- cast auf int erklären, das ist schlecht, aber das lösen wir später -> #TODO

## Aufgabe 4

Rotieren von Linien, Kreisen und Figuren
Lösung ist wieder delegate bzw. foreach

### Uhr fertig machen 

- foreach Schleife mit neuen Punkten
- Figur hinzufügen
- Fazit: ständig neue Punkte ist nicht optimal, aber das lösen wir in Eclipse

### Wechsel auf Eclipse

- Eclipse starten und grob erklären
- Rechtsklick auf Package Explorer 
- New -> Java Project
- Haken entfernen bei 'Use default location'
- Ordner mit dem BlueJ Projekt auswählen
- Finish

### Kaputt in der Eclipse

- WhiteBoard bekannt machen
- Ordner lib öffnen, Rechtsklick auf whiteboard.jar -> Build Path -> Add to Build Path
- JUnit verfügbar machen
- Problems View erläutern
- Problems View -> 'Test cannot be resolved to a type' auswählen -> Rechtsklick -> Quick Fix und 'Add JUnit 4 library to the build path' auswählen
- Projekt ist compilierbar

### Folder und Packages

- Source Folder anlegen 'src' und 'test'
- Rechtsklick auf's Projekt -> New -> Source Folder
- Erklären, warum Code und Tests getrennt werden sollten
- Package 'forms' in 'src' anlegen via Rechtsklick auf Ordner -> New -> Package
- Konzept von Packages erklären
- .java Files auswählen (nicht Tests!) (mit Shift + Maustaste) und Rechtsklick auf eines der Files -> Refactor -> Move -> Package src/forms ausfwählen
- Klassen werden Rot wegen fehlender Package Deklaration
- Via Problems View -> Quick Fix -> 'Add package declaration'
- Package 'forms' in 'test' anlegen via Rechtsklick auf Ordner -> New -> Package
- *Test.java auswählen und Prozedur wiederholen
- Ergebnis sollte ein sauberes Eclipse Projekt sein

Während der folgenden Phase immer darauf achten, dass die Tests regelmäßig ausgeführt werden (Rechtsklick auf das Package, Run As -> JUnit Tests oder in der JUnit View via Rerun Tests)

### Refactoring und Immutable Objects

- Refactoring erklären
- Immutable Objects erklären
- Punkt wäre sinnvoll als immutable, für's Ziffernblatt derzeit immer neue Punkte explizit nötig
- move und rotate anpassen, so dass Punkt erzeugt wird
- Testfall ausführen -> wird rot
- Test korrigieren und ausführen

### Refactoring und Datentypen

- Cast im Punkt (rotieren) ist ungünstig
- Punkt sollte besser mit double arbeiten
- Datentypen der Parameter im Konstruktor ändern
- Rechtsklick auf Warnung der Zuweisungen im Konstruktor -> QuickFix -> Change type of x to double
- Getter werden Rot -> QuickFix -> Change return type to double
- Viele Warnings in der Problem View bzgl assertEquals
- Erklären, was das Rundungsproblem bei double ist und die Toleranz ergänzen

## Aufgabe 5

Linie und Kreis reparieren
Lösung Getter bei Linie auf double umstellen, Zuweisung bei Move und Rotate in Kreis und Linie, asserts müssen um Toleranz ergänzt werden - sonst keine Änderung in den Tests

Nebenbei: wahrscheinlich steht in den imports bei Kreis und Linie noch das teaching.WhiteBoard - das wird aber nicht mehr benötigt
Hier ist ein guter Zeitpunkt, um späte Bindung zu erklären, denn auch wenn die drawForm Methoden die WhiteBoard API nutzen, müssen beide Klassen die Klasse WhiteBoard nicht kennen.
Und hier kann gut Shift+Strg+O zum Fix Imports in der Eclipse erklärt werden.

### Ziffernblatt Uhr kürzer fassen

- Punkte außerhalb der Schleife erstellen
- Punkte immer nur um 30 Grad rotieren
- Ausführen in Eclipse via Rechtsklick -> Run As -> Java Application

### Zeiger einführen und Animieren

- neue Linie als Zeiger
- Zeichnen und in Schleife rotieren
- Animation nicht sichtbar -> refresh nach rotieren und bewegen

### Zeichenoperation zu schnell

- Sleep einführen
- Thread.sleep will try/catch, also einfache Erklärung für Exception Handling
- Rotation des Zeigers wird sichtbar

### Separation of Concerns

- Konzept erklären, Ziel ist, Animation als Klasse
- Step 1: for-Schleife markieren und Refactor -> Extract Method ('animate')
- Step 2: Klasse Animation erzeugen, Methode dorthin verschieben
- Step 3: Animation als Objekt mit Verweis auf zu animierende Form

## Aufgabe 6

Zweiten Zeiger erstellen und animieren
Lösung ist klar, allerdings laufen die Animationen nur nacheinander

### Echte Animationen

- Animationen sollen parallel laufen
- Threads erklären, Klasse Threaded Animation erstellen
- New -> Class -> Interface Runnable auswählen!
- Für 'run' muss Methode animate ohne Parameter laufen
- Also Refactoren, Center in den Konstruktor
- Animationen verpacken und starten

### Zeiger bewegen sich gleichförmig

- Animation kann nur rotieren und das nur sehr konstant
- Mehr Parameter machen den Code komplizierter
- Stattdessen Command Pattern und innere Klassen einführen
- Innere Klasse Rotate einführen, zum Ausführen der Animation
- setAnimation um Kommando zu definieren

### Rotieren und Bewegen ermöglichen

- aktuell kann nur rotiert werden
- zweite innere Klasse als Move
- beide innere Klassen benötigen gemeinsames Interface
- Methode zum Übergeben des Kommandos nutzt Interface, Variable auch vom Typ des Interface

### Animationsreihen ermöglichen

- aktuell sind die Animationen festgelegt
- Ausführen mehrerer Kommandos soll möglich sein
- Einführung von Listen -> Unterschied zum Set erklären
- Animation muss wissen in welchem Frame sie steht
- Frames als Parameter
- Kommandos zur Liste hinzufügen

### Doppelte Kommandos reduzieren

- aktuell wird für jedes Frame explizit ein Kommando benötigt
- stattdessen Kommando ausführen bis neues Kommando kommt
- benötigt Maps -> Unterschiede zu Set und Liste erklären
- currentCommand speichert aktuelles Kommando bis es vom nächsten überschrieben wird

### NullPointer Exception und Kommandos stoppen 

- wird kein Kommando für Frame 0 angegeben, erhalten wir einen NPE
- wir können die Ausführung aus nicht stoppen
- Ließe sich mit "null" als Kommando machen (nicht so toll) oder mit dem Null Object Pattern
- Klasse DoNothing als Kommando einführen -> wichtig: muss Interface Command implementieren, aber leere Methode animate
- currentCommand ist per default ein DoNothing
- Zeiger für 6 Sekunden anhalten

### Singleton

- DoNothing Objekte unterscheiden sich nicht
- idealer Kandidat für ein Singleton
- Konstruktor private machen
- Instance als static final einführen -> static und final bei Variablen erklären
- Aufrufe von Konstruktor durch INSTANCE ersetzen

## Aufgabe 7 (optional)

Für Leute, die ganz schnell fertig sind:
Die Uhr soll die aktuelle Systemzeit darstellen.

### Composite

- Aktuell führt jedes Kommando genau eine Operation aus
- Manchmal will man zwei Operationen in einem Animationsschritt darstellen

## Aufgabe 8

Erstellen einer Klasse, die Rotation und Bewegung in einem Animationsschritt erlaubt.

### Arbeit mit Arrays

- Arrays sind besondere Objekte
- Können sowohl von Klassen als auch von primitiven Typen erstellt werden
- Klasse Polygon einführen (Drawable, Form)
- Tests implementieren mit anonymem Array, Methode NumberOfPoints zur Längenabfrage Array.length einführen
- Methode move implementieren, for-Schleife über das Array, erklären: warum nicht foreach

## Aufgabe 9

Polygon rotieren und zeichnen.
Inklusive Test.
Methode zum Zeichnen von Polygonen ist

    Object shape = WhiteBoard.draw(int[] x, int[] y);

### Dreieck

- Einführen Klasse Dreieck, Spezialfall von Polygon
- Konstruktor von Polygon muss überschrieben werden, weil kein Standardkonstruktor vorhanden ist

## Aufgabe 10

Klasse Rechteck erstellen, Berechnung aus zwei Punkten

## Aufgabe 11 (optional)

Für die fixen: Rechteck aus Punkt, Länge der Diagonalen und Winkel der Diagonalen erstellen

### Rotieren um sich selbst

- Im Interface Form Methode getCenter ergänzen
- Fehler in Linie und Polygon - Kreis hat die ja schon
- In beiden Klassen via Rechtsklick auf Zeilennummer -> Add unimplemented Methods neue Methode ergänzen und implementieren
- Polymorphismus erklären
- Zweite Rotieren Methode nur mit Winkel - bedient sich  der Mittelpunktberechnung und der existierenden Rotate Methode
- Im Kreis gibt es nichts zu tun

Achtung: Mathematisch ist das beim Polygon nicht der Mittelpunkt, aber die echte Mittelpunktberechnung ist zu kompliziert. Für unsere Zwecke reicht das Beispiel.

## Aufgabe 12

Aus der Figure eine Form machen. Es gibt keinen Grund, warum die Figure keine Form sein sollte. Aber es gibt einige Fehler, in die man laufen kann.
- Die Figure benötigt keinen Refresh nach Rotation oder Move
- Rotate um den eigenen Mittelpunkt kann nicht einfach delegiert werden
- Die Figure muss ihren Mittelpunkt aus den Mittelpunkten ihrer Bestandteile berechnen

### Neues Package und Raumschiff zeichnen

- Neues Package game erstellen
- Klasse mit Main Methode erstellen
- WhiteBoard initialisieren
- Raumschiff zeichnen

### GUI zur Bedienung integrieren

- Klasse Cockpit verteilen und in main-Methode integrieren
- Cockpit und WhiteBoard sollten beim Start des Spiels erscheinen
- Methoden zur Rotation und Geschwindigkeit aus dem Cockpit erklären

## Aufgabe 13 Interface Sprite herleiten

Interface Sprite herleiten und erstellen

### Raumschiff zum Sprite refactoren

- Klasse Raumschiff (als Sprite) mit Initialisierung bauen (Refactoring aus der Main-Methode)

### Cockpit mit Raumschiff verbinden

- Listener-Konzept erklären
- Raumschiff als Sprite zum Cockpit hinzufügen
- Raumschiff Events verarbeiten lassen

### Raumschiff fliegen lassen

- Raumschiff um Methode fly ergänzen, berechnet Vektor aus Geschwindigkeit und Richtung und bewegt die Figur
- Endlos-Schleife im Spiel implementieren, um das Raumschiff zu bewegen

### Asteroiden Factory

- Factory Pattern erklären
- Zunächst triviale Factory erstellen
- Nächster Schritt ist, Asteroiden an zufälligen Positionen erscheinen zu lassen
- Echte Fabrik erzeugen, Abhängigkeit zum WhiteBoard eliminieren (sollte Fabrik nicht haben)
- Asteroiden als Animation erstellen und fliegen lassen
