# GitHub Setup Instructies

## ✅ Git Repository Geïnitialiseerd

Het project is klaar om naar GitHub gepusht te worden!

## 📋 Wat is er gedaan:

1. ✅ `.gitignore` bestand aangemaakt voor Java/IntelliJ
2. ✅ Git repository geïnitialiseerd (`git init`)
3. ✅ Remote toegevoegd: `https://github.com/TasnimOusallami/Challenge-.git`
4. ✅ Alle bestanden toegevoegd (`git add .`)
5. ✅ Eerste commit gemaakt
6. ✅ Branch hernoemd naar `main`

## 🔐 Authenticatie Nodig

Om naar GitHub te pushen, heb je authenticatie nodig. Er zijn twee opties:

### Optie 1: Personal Access Token (Aanbevolen)

1. Ga naar GitHub.com → Settings → Developer settings → Personal access tokens
2. Klik "Generate new token (classic)"
3. Geef de token een naam (bijv. "IntelliJ Project")
4. Selecteer scopes: `repo` (volledige controle over repositories)
5. Klik "Generate token"
6. **Kopieer de token** (je ziet deze maar één keer!)

7. Push met token:
```bash
git push -u origin main
```
Wanneer gevraagd om wachtwoord, plak je de token.

### Optie 2: SSH Key

1. Genereer SSH key:
```bash
ssh-keygen -t ed25519 -C "jouw-email@example.com"
```

2. Voeg SSH key toe aan GitHub:
   - Kopieer de public key: `cat ~/.ssh/id_ed25519.pub`
   - Ga naar GitHub → Settings → SSH and GPG keys → New SSH key
   - Plak de key

3. Wijzig remote naar SSH:
```bash
git remote set-url origin git@github.com:TasnimOusallami/Challenge-.git
git push -u origin main
```

## 🚀 Push Commando

Als authenticatie is ingesteld, voer uit:

```bash
git push -u origin main
```

## 👥 Voor Teamleden

### Project Clonen

```bash
git clone https://github.com/TasnimOusallami/Challenge-.git
cd Challenge-
```

### JavaFX SDK Instellen

1. Download JavaFX SDK van https://gluonhq.com/products/javafx/
2. Volg de instructies in `SETUP_INSTRUCTIES.md`

### Werken met Git

**Voordat je begint:**
```bash
git pull origin main
```

**Na wijzigingen:**
```bash
git add .
git commit -m "Beschrijving van wijzigingen"
git push origin main
```

**Nieuwe branch maken:**
```bash
git checkout -b feature/nieuwe-functie
# Maak wijzigingen
git add .
git commit -m "Nieuwe functie toegevoegd"
git push origin feature/nieuwe-functie
```

## 📁 Project Structuur

```
Challenge-/
├── .gitignore
├── README.md
├── SETUP_INSTRUCTIES.md
├── CHANGELOG.md
├── NAVIGATIE_FLOWS.md
├── FLOWS_VERSIE_3.md
├── IMPLEMENTATIE_OVERZICHT.md
├── VERSIE_3_SAMENVATTING.md
├── src/
│   ├── Main.java
│   ├── controllers/      (17 controllers)
│   ├── models/           (3 models)
│   ├── utils/            (SessionManager)
│   ├── views/            (17 FXML bestanden)
│   └── styles/           (CSS)
└── .idea/                (IntelliJ configuratie - genegeerd)
```

## 🔄 Git Workflow voor Team

### 1. Feature Branch Workflow

```bash
# Haal laatste wijzigingen op
git pull origin main

# Maak nieuwe feature branch
git checkout -b feature/mijn-feature

# Werk aan je feature
# ... maak wijzigingen ...

# Commit je wijzigingen
git add .
git commit -m "Feature: beschrijving"

# Push naar GitHub
git push origin feature/mijn-feature

# Maak Pull Request op GitHub
# Na review: merge naar main
```

### 2. Hotfix Workflow

```bash
# Voor urgente fixes
git checkout -b hotfix/bug-beschrijving
# Fix de bug
git add .
git commit -m "Hotfix: beschrijving"
git push origin hotfix/bug-beschrijving
# Merge direct naar main na review
```

### 3. Conflicten Oplossen

```bash
git pull origin main
# Als er conflicten zijn:
# 1. Open de bestanden met conflicten
# 2. Los de conflicten op (verwijder <<<, ===, >>> markers)
# 3. Test de code
git add .
git commit -m "Conflicten opgelost"
git push origin main
```

## 📝 Commit Message Conventies

Gebruik duidelijke commit messages:

```
Feature: Nieuwe NFC-kaart functionaliteit toegevoegd
Fix: Login bug opgelost voor bedrijven
Update: Styling aangepast voor CV pagina
Refactor: SessionManager code verbeterd
Docs: README bijgewerkt met nieuwe instructies
```

## ⚠️ Belangrijke Regels

1. **Altijd pullen voor pushen**: `git pull origin main`
2. **Test je code** voordat je commit
3. **Gebruik duidelijke commit messages**
4. **Maak feature branches** voor grote wijzigingen
5. **Review elkaars code** via Pull Requests
6. **Commit niet de .idea/ folder** (staat in .gitignore)
7. **Commit niet compiled .class files** (staat in .gitignore)

## 🆘 Hulp Nodig?

**Ongedane wijzigingen terugdraaien:**
```bash
git checkout -- bestandsnaam
```

**Laatste commit ongedaan maken:**
```bash
git reset --soft HEAD~1
```

**Status bekijken:**
```bash
git status
git log --oneline
```

**Verschillen bekijken:**
```bash
git diff
git diff bestandsnaam
```

## 📞 Contact

Bij vragen over Git of het project, neem contact op met het team!
