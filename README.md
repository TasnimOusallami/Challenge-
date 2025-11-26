# Recruitment Portal - JavaFX Applicatie

## Projectstructuur

```
src/
├── Main.java                          # Hoofdapplicatie
├── module-info.java                   # Module configuratie
├── controllers/                       # Alle controllers
│   ├── HomeController.java
│   ├── LoginSollicitantController.java
│   ├── LoginBedrijfController.java
│   ├── RegisterSollicitantController.java
│   ├── RegisterBedrijfController.java
│   ├── CVController.java
│   ├── BedrijfSelectieController.java
│   ├── VacatureListController.java
│   ├── VacatureDetailController.java
│   ├── AantalGebruikersController.java
│   ├── GebruikerDetailController.java
│   ├── SollicitatieController.java
│   └── NFCKaartController.java
├── models/                            # Data modellen
│   ├── Gebruiker.java
│   ├── Bedrijf.java
│   └── Vacature.java
├── views/                             # FXML bestanden
│   ├── HomeView.fxml
│   ├── LoginSollicitantView.fxml
│   ├── LoginBedrijfView.fxml
│   ├── RegisterSollicitantView.fxml
│   ├── RegisterBedrijfView.fxml
│   ├── CVView.fxml
│   ├── BedrijfSelectieView.fxml
│   ├── VacatureListView.fxml
│   ├── VacatureDetailView.fxml
│   ├── AantalGebruikersView.fxml
│   ├── GebruikerDetailView.fxml
│   ├── SollicitatieView.fxml
│   └── NFCKaartView.fxml
└── styles/
    └── style.css                      # Stylesheet
```

## Functionaliteit

### Home Pagina
- Rechtsboven: Profiel-icoon (👤) en NFC-kaart icoon (💳)
- Twee registratie knoppen:
  - "Registreer voor sollicitant"
  - "Registreer voor bedrijf"
- Tekst is zwart voor betere leesbaarheid

### Sollicitant Portaal Flow
1. **Registratie** → Aparte registratie voor sollicitanten
2. **Login** → Bedrijfselectie
3. **Bedrijfselectie** → Klik op bedrijf → Vacature lijst
4. **Vacature lijst** → Dubbelklik op vacature → Vacature details
5. **Vacature details** → Toon functienaam, status, adres, werkuren, dienstverband, salaris
6. **Solliciteer knop** → "Sollicitatie verstuurd!" bevestiging
7. **CV pagina** (via profiel-icoon):
   - Vaardigheden en werkervaring (bewerkbaar)
   - Diploma's uploaden
   - Uitloggen knop

### Bedrijfsportaal Flow
1. **Registratie** → Aparte registratie voor bedrijven
2. **Login** → Aantal gebruikers
3. **Aantal gebruikers** → Dubbelklik op gebruiker → Gebruiker details
4. **Gebruiker Details**:
   - Vaardigheden en werkervaring
   - Diploma's lijst
   - Neem contact op sectie met tekstvak voor bericht
   - "Verstuur bericht" knop

### NFC-Kaart Functionaliteit
1. Klik op kaart-icoon (💳) rechtsboven
2. Bestel NFC-kaart scherm
3. "Bestel" knop → "NFC-kaart besteld!" bevestiging

## Vereisten

- Java 11 of hoger
- JavaFX SDK 11 of hoger
- IntelliJ IDEA (aanbevolen)

## Setup in IntelliJ IDEA

1. Open het project in IntelliJ IDEA
2. Ga naar File → Project Structure → Libraries
3. Voeg JavaFX SDK toe als library
4. Ga naar Run → Edit Configurations
5. Voeg VM options toe:
   ```
   --module-path "PATH_TO_JAVAFX_SDK/lib" --add-modules javafx.controls,javafx.fxml
   ```
6. Run Main.java

## Navigatie

Alle schermen hebben:
- 🏠 Home knop (terug naar hoofdpagina)
- ← Terug knop (vorige pagina)
- → Volgende knop (placeholder)
- 👤 Profiel knop (naar CV pagina, waar van toepassing)
- "Uitloggen" knop (rode knop, terug naar home)

## Dummy Data

- Gebruikers lijst bevat 10 voorbeeldgebruikers
- Bedrijven: Microsoft, McDonalds, ING, Philips, NVIDIA, Google, Amazon, Meta, Apple, Heineken
- Vacatures met verschillende informatie:
  - Microsoft: Software Engineer, Technical Support
  - Elk met unieke status, adres, werkuren, dienstverband en salaris
- CV data is vooraf ingevuld voor demonstratie
- Diploma's: Bachelor en Master voorbeelden

## Styling

De applicatie gebruikt een blauw-groen kleurenschema:
- Primaire kleur: #2b8a9e (teal)
- Secundaire kleur: #5eb3d1 (licht blauw)
- Gradient achtergrond op meerdere pagina's
