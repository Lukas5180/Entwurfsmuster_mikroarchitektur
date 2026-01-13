# Aufgabe 1

# Entwurfsmuster (Design Patterns)

## Definition
Entwurfsmuster sind bewährte, wiederverwendbare Lösungsvorlagen für wiederkehrende Designprobleme in der Softwareentwicklung. Sie beschreiben bewährte Praktiken, um Code flexibler, wartbarer und erweiterbarer zu gestalten, ohne konkreten Code bereitzustellen.

## Beschreibung (GoF-Format)
Die standardisierte Beschreibung der "Gang of Four" (GoF) umfasst:
- **Name und Klassifikation**: Kurze Bezeichnung und Kategorie
- **Motivation**: Problembeispiel und Lösungsidee
- **Anwendbarkeit**: Wann das Muster geeignet ist
- **Struktur**: UML-Klassendiagramme
- **Teilnehmer**: Beteiligte Klassen/Objekte
- **Kollaborationen**: Interaktionen zwischen Teilnehmern
- **Konsequenzen**: Vorteile und Nachteile
- **Implementierung**: Praktische Hinweise
- **Beispielcode**: Konkrete Implementierung
- **Bekannte Anwendungen**: Realwelt-Beispiele
- **Verwandte Muster**: Alternativen und Ergänzungen

## Kategorien
### Erzeugungsmuster (Creational)
Steuern die Objekterstellung:
- **Singleton**: Genau eine Instanz einer Klasse
- **Factory Method**: Flexibles Erzeugen von Objekten
- **Abstract Factory**: Familien verwandter Objekte

### Strukturmuster (Structural)
Organisieren Klassen- und Objektbeziehungen:
- **Adapter**: Anpassen unterschiedlicher Schnittstellen
- **Decorator**: Dynamische Funktionalitäts-Erweiterung
- **Composite**: Baumartige Strukturen von Objekten

### Verhaltensmuster (Behavioral)
Definieren Interaktionen zwischen Objekten:
- **Observer**: Änderungsbenachrichtigungen
- **Strategy**: Austauschbare Algorithmen
- **Command**: Aktionen als Objekte kapseln

## Zweck und Vorteile
- **Zeitersparnis**: Bewährte Lösungen statt Neuerfindung
- **Wiederverwendbarkeit**: Standardisierte Bausteine
- **Kommunikation**: Gemeinsame Fachsprache im Team
- **Wartbarkeit**: Flexiblere, erweiterbare Systeme
- **Fehlerreduktion**: Getestete Lösungen

## Mikroarchitektur
Mikroarchitektur beschreibt das detaillierte interne Design einzelner Softwarekomponenten. Entwurfsmuster bilden hier die Bausteine für:
- Klassenbeziehungen und Vererbungshierarchien
- Objektinteraktionen und Schnittstellen
- Interne Abläufe (z. B. Pipelining, Caching)
Unterscheidet sich von Makroarchitektur (Systemstruktur).



# Aufgabe 2

# GoF Entwurfsmuster - Vertiefung

## Chain of Responsibility (Verhaltensmuster)
**Zweck**: Entkoppelt Sender von Empfänger. Anfrage läuft Kette entlang, bis Handler sie bearbeitet.
**Struktur**: Handler-Interface → ConcreteHandler (setNext() + handleRequest())  
**Beispiel**: Hilfesystem: Button → Dialog → Fenster → Anwendung  
**Vorteile**: Flexibel, Handler-Reihenfolge runtime änderbar

## Template Method (Verhaltensmuster)
**Zweck**: Algorithmus-Skelett fixiert, Schritte überschreibbar. 
**Struktur**: AbstractClass {
  templateMethod() { step1(); step2(); step3(); }
  abstract step2();
}  
**Beispiel**: HTTP-Request: connect() → send() → receive() → disconnect()  
**Vorteile**: Code-Duplikation vermeidet "Hollywood Principle"

## Decorator (Strukturmuster)
**Zweck**: Dynamisch Funktionalität erweitern, transparent.  
**Struktur**: Component → ConcreteComponent  
Decorator → ConcreteDecorator (überschreibt + Component.call())  
**Beispiel**: InputStream → BufferedInputStream → DataInputStream  
**Vorteile**: Unbegrenzte Kombinationen statt Subklassen

## Builder (Erzeugungsmuster)
**Zweck**: Komplexe Objekte schrittweise, immutable Resultat. 
**Struktur**: Product + Builder.setX().setY().build() → Director  
**Beispiel**: MazeGame mit Room, Door fluenter Builder  
**Vorteile**: Telescoping Constructor Problem lösen

## Adapter (Strukturmuster)
**Zweck**: Inkompatible Schnittstellen kompatibel machen.
**Struktur**: Target-Interface → Adapter(request()) → Adaptee.specificRequest()  
**Beispiel**: MediaPlayer (MP3) → Adapter (VLC) → AdvancedMedia  
**Varianten**: Object Adapter (Komposition), Class Adapter (Vererbung)

## Observer (Verhaltensmuster)
**Zweck**: 1:n State-Änderungsbenachrichtigung. 
**Struktur**: Subject(attach/detach/notify) → Observer.update()  
**Beispiel**: WeatherData → Current/Statistic/Forecast Display  
**Vorteile**: Loose Coupling, Publisher/Subscriber
