# Team Samenwerking Guide

## 🎯 Project: Recruitment Portal

Een JavaFX applicatie voor sollicitanten en bedrijven om te matchen op basis van kwaliteiten.

## 👥 Voor Nieuwe Teamleden

### Stap 1: Clone het Project

```bash
git clone https://github.com/TasnimOusallami/Challenge-.git
cd Challenge-
```

### Stap 2: Open in IntelliJ IDEA

1. Open IntelliJ IDEA
2. File → Open
3. Selecteer de `Challenge-` folder
4. Wacht tot IntelliJ het project indexeert

### Stap 3: JavaFX SDK Installeren

1. Download JavaFX SDK: https://gluonhq.com/products/javafx/
2. Pak uit naar een locatie (bijv. `C:\javafx-sdk-21`)
3. In IntelliJ:
   - File → Project Structure → Libraries
   - Klik + → Java
   - Selecteer de `lib` folder van JavaFX SDK
   - Klik OK

### Stap 4: Run Configuration

1. Run → Edit Configurations
2. Klik + → Application
3. Vul in:
   - Name: `Recruitment Portal`
   - Main class: `Main`
   - VM options: `--module-path "PAD_NAAR_JAVAFX/lib" --add-modules javafx.controls,javafx.fxml`
4. Klik OK

### Stap 5: Run het Project

1. Klik op de groene Run knop
2. De applicatie start met de home pagina

## 📚 Project Documentatie

Lees deze bestanden om het project te begrijpen:

1. **README.md** - Project overzicht en structuur
2. **SETUP_INSTRUCTIES.md** - Gedetailleerde setup
3. **FLOWS_VERSIE_3.md** - Alle navigatie flows
4. **IMPLEMENTATIE_OVERZICHT.md** - Technische details
5. **VERSIE_3_SAMENVATTING.md** - Laatste wijzigingen

## 🔄 Dagelijkse Workflow

### Ochtend (Start van de dag)

```bash
# Haal laatste wijzigingen op
git pull origin main

# Check of alles up-to-date is
git status
```

### Tijdens het Werken

```bash
# Maak een feature branch voor je taak
git checkout -b feature/jouw-naam-taak-beschrijving

# Bijvoorbeeld:
git checkout -b feature/tasnim-diploma-upload-verbetering
```

### Einde van de Dag

```bash
# Check wat je hebt gewijzigd
git status

# Voeg wijzigingen toe
git add .

# Commit met duidelijke message
git commit -m "Feature: Diploma upload verbeterd met preview"

# Push naar GitHub
git push origin feature/jouw-branch-naam
```

### Pull Request Maken

1. Ga naar GitHub repository
2. Klik "Compare & pull request"
3. Vul beschrijving in:
   - Wat heb je gedaan?
   - Waarom?
   - Hoe te testen?
4. Vraag een teamlid om review
5. Na goedkeuring: Merge naar main

## 🎨 Code Conventies

### Java Naming

```java
// Classes: PascalCase
public class VacatureController { }

// Methods: camelCase
private void handleLogin(ActionEvent event) { }

// Variables: camelCase
private String gebruikersNaam;

// Constants: UPPER_SNAKE_CASE
private static final String DEFAULT_STYLE = "style.css";
```

### FXML Naming

```xml
<!-- IDs: camelCase met beschrijvende namen -->
<TextField fx:id="emailField" />
<Button fx:id="loginButton" onAction="#handleLogin" />
```

### Package Structuur

```
src/
├── controllers/     - Alle controller classes
├── models/          - Data models (Gebruiker, Bedrijf, Vacature)
├── utils/           - Utility classes (SessionManager)
├── views/           - FXML bestanden
└── styles/          - CSS bestanden
```

## 🐛 Bug Fixes

### Bug Gevonden?

1. Maak een GitHub Issue:
   - Titel: Korte beschrijving
   - Beschrijving: Stappen om te reproduceren
   - Screenshots indien mogelijk
   - Label: `bug`

2. Maak een hotfix branch:
```bash
git checkout -b hotfix/bug-beschrijving
```

3. Fix de bug en test grondig

4. Commit en push:
```bash
git add .
git commit -m "Hotfix: Bug beschrijving opgelost"
git push origin hotfix/bug-beschrijving
```

5. Maak Pull Request met label `hotfix`

## ✨ Nieuwe Features

### Feature Planning

1. Bespreek feature met team
2. Maak GitHub Issue met label `enhancement`
3. Wijs issue toe aan jezelf
4. Maak feature branch

### Feature Development

```bash
# Maak branch
git checkout -b feature/feature-naam

# Ontwikkel feature
# Test grondig
# Commit regelmatig

git add .
git commit -m "Feature: Deel 1 van feature-naam"
# ... meer commits ...

# Push naar GitHub
git push origin feature/feature-naam
```

### Feature Review

1. Maak Pull Request
2. Beschrijf wat de feature doet
3. Voeg screenshots/video toe
4. Vraag om code review
5. Verwerk feedback
6. Merge na goedkeuring

## 🧪 Testing

### Voor Elke Commit

Test deze flows:

**Sollicitant:**
1. Registreer → Login → Bedrijfselectie
2. Selecteer bedrijf → Vacature lijst → Vacature details
3. Solliciteer → Check melding
4. CV pagina → Upload diploma
5. NFC-kaart bestellen

**Bedrijf:**
1. Registreer → Login → Vacature overzicht
2. Selecteer vacature → Gebruikerslijst
3. Selecteer gebruiker → Gebruiker details
4. Verstuur bericht → Check melding

**Algemeen:**
1. Uitloggen werkt overal
2. Iconen verschijnen na login
3. Navigatie knoppen werken
4. Geen console errors

## 📋 Taken Verdelen

### Gebruik GitHub Projects

1. Ga naar Projects tab op GitHub
2. Maak kaarten voor taken
3. Wijs taken toe aan teamleden
4. Verplaats kaarten: To Do → In Progress → Done

### Voorbeeld Taken

- [ ] Vacature zoekfunctie toevoegen
- [ ] Profiel foto upload
- [ ] Email notificaties
- [ ] Database integratie
- [ ] Unit tests schrijven
- [ ] UI verbeteringen
- [ ] Performance optimalisatie

## 🔒 Belangrijke Regels

### DO's ✅

- Pull altijd voor je begint
- Maak feature branches
- Schrijf duidelijke commit messages
- Test je code
- Review elkaars code
- Vraag om hulp als je vast zit
- Documenteer complexe code
- Gebruik meaningful variable names

### DON'Ts ❌

- Commit niet direct naar main
- Push niet zonder te testen
- Commit niet .idea/ bestanden
- Commit niet .class bestanden
- Overschrijf niet andermans werk
- Laat geen merge conflicts onopgelost
- Gebruik geen vage commit messages ("fix", "update")

## 💬 Communicatie

### Daily Standup (Optioneel)

Bespreek dagelijks:
1. Wat heb ik gisteren gedaan?
2. Wat ga ik vandaag doen?
3. Zijn er blockers?

### Code Review Comments

Wees constructief:
- ✅ "Goed gebruik van SessionManager hier!"
- ✅ "Misschien kunnen we deze methode opsplitsen voor betere leesbaarheid?"
- ❌ "Dit is fout"
- ❌ "Waarom heb je dit zo gedaan?"

## 🆘 Hulp Nodig?

### Git Problemen

**Merge conflict:**
```bash
git status  # Zie welke bestanden conflicten hebben
# Open bestanden, los conflicten op
git add .
git commit -m "Merge conflicts opgelost"
```

**Verkeerde branch:**
```bash
git stash  # Bewaar wijzigingen tijdelijk
git checkout correcte-branch
git stash pop  # Haal wijzigingen terug
```

**Commit ongedaan maken:**
```bash
git reset --soft HEAD~1  # Behoud wijzigingen
git reset --hard HEAD~1  # Verwijder wijzigingen (voorzichtig!)
```

### JavaFX Problemen

- Check VM options in Run Configuration
- Controleer of JavaFX SDK correct is toegevoegd
- Rebuild project: Build → Rebuild Project

### Code Problemen

1. Check console voor errors
2. Gebruik debugger (breakpoints)
3. Vraag teamlid om mee te kijken
4. Maak GitHub Issue

## 📞 Contact

- GitHub Issues voor bugs/features
- Pull Request comments voor code review
- Team chat voor dagelijkse communicatie

## 🎉 Succes!

Veel plezier met het ontwikkelen van de Recruitment Portal! 🚀
