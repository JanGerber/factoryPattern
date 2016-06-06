<h1>Factory Pattern</h1>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Fabrikmethode.svg/438px-Fabrikmethode.svg.png" alt="Factory-Patter">

1. Abstrakter Erzeuger
 <p> Als erstes  erzeugen wir einen abstrakten Hersteller, der einen Konstruktor enthält der die Implementierung an die Unterklasse delegiert und eine abstrakte Methode erzeugeFahrzeuge enthält. </p>
2. Konkrete Erzeuger
 <p> Die Klasser abstrakterHersteller wird von den Klassen BMW und Volkswagen abgeleitet. Diese beiden Klassen implementieren nun die abstrakte Methode("erzeugeFahrzeug") aus der Klasse abstrakterHersteller. </p>
3. Abstraktes Produkt
 <p> Kommen wir nun zur Erstellung des Produkts, dass durch den Erzeuger erzeugt werden soll. Hierfür erstllen wir zuerst eine abstrakte Klasse "AbstraktesFahrzeug". Die Klasse enthählt zu einem Variablen und getter um auf die Variablen zugreifen. Zusätzlich enthählt die Klasse einen Konstruktor um dem Fahrzeug bereits beim Erzeugen erste Informationen mitzugeben.  </p> 
4. Konkrete Produkte
<p>Der letzte Bestandteil des Factory Pattern ist die Implementierung des konkreten Produkts. Die konkreten Produkte sind dabei der I8, Golf und der Passa. Sie haben wiederum einen Konstruktor bei dem Sie dem Fahrzeug erste Fahrzeugdaten mitgeben. </p>
5. Testen des implementierten Factory Pattern
<p> </p>
