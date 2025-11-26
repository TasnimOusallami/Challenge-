# Setup Instructies - Recruitment Portal

## Stap 1: JavaFX SDK Downloaden

1. Download JavaFX SDK van: https://gluonhq.com/products/javafx/
2. Kies de juiste versie voor jouw OS (Windows/Mac/Linux)
3. Pak het bestand uit naar een locatie op je computer (bijv. `C:\javafx-sdk-21`)

## Stap 2: IntelliJ IDEA Configureren

### Libraries Toevoegen
1. Open het project in IntelliJ IDEA
2. Ga naar **File → Project Structure** (Ctrl+Alt+Shift+S)
3. Selecteer **Libraries** in het linkermenu
4. Klik op **+** en selecteer **Java**
5. Navigeer naar de `lib` map in je JavaFX SDK folder
6. Selecteer alle JAR bestanden en klik **OK**
7. Klik **Apply** en **OK**

### Run Configuration Instellen
1. Ga naar **Run → Edit Configurations**
2. Klik op **+** en selecteer **Application**
3. Vul de volgende velden in:
   - **Name**: Recruitment Portal
   - **Main class**: Main (klik op ... en selecteer Main)
   - **VM options**: 
     ```
     --module-path "C:\javafx-sdk-21\lib" --add-modules javafx.controls,javafx.fxml
     ```
     (Vervang het pad met jouw JavaFX SDK locatie)
4. Klik **Apply** en **OK**

## Stap 3: Project Runnen

1. Klik op de groene **Run** knop (of druk Shift+F10)
2. De applicatie zou moeten starten met de Home pagina

## Troubleshooting

### Error: "JavaFX runtime components are missing"
- Controleer of de VM options correct zijn ingesteld
- Zorg dat het pad naar JavaFX SDK klopt

### Error: "Module not found"
- Controleer of alle JavaFX libraries zijn toegevoegd
- Rebuild het project: **Build → Rebuild Project**

### FXML Load Error
- Controleer of alle FXML bestanden in de `src/views/` map staan
- Controleer of de CSS file in `src/styles/` staat

## Navigatie Testen

### Sollicitant Flow:
1. Home → Klik "Sollicitantportaal"
2. Login (vul willekeurige gegevens in)
3. Profiel → Klik "Upload Diploma" → Klik "Verder"
4. Bedrijfselectie → Klik op een bedrijf (bijv. Microsoft)
5. Bedrijf Details → Klik op een vacature
6. Sollicitatie → Klik "Verstuur"

### Bedrijf Flow:
1. Home → Klik "Bedrijfsportaal"
2. Login (vul willekeurige gegevens in)
3. Aantal Gebruikers → Dubbelklik op een gebruiker
4. Gebruiker Details → Bekijk informatie + diploma's

## Extra Functionaliteit

- Alle navigatieknoppen (🏠, ←, →, 👤) zijn werkend
- Diploma upload functionaliteit werkt met FileChooser
- Alle schermen zijn responsive en scrollbaar waar nodig
