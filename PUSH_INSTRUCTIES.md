# 🚀 Push naar GitHub - Laatste Stap

## ✅ Wat is al gedaan:

1. ✅ Git repository geïnitialiseerd
2. ✅ Remote toegevoegd: `https://github.com/TasnimOusallami/Challenge-.git`
3. ✅ Alle bestanden gecommit (50 bestanden, 4129+ regels code)
4. ✅ Branch hernoemd naar `main`
5. ✅ Documentatie toegevoegd

## 🔐 Authenticatie Instellen

Je moet nu authenticeren met GitHub. Kies één van deze methoden:

### Methode 1: Personal Access Token (Makkelijkst)

**Stap 1: Token Aanmaken**
1. Ga naar: https://github.com/settings/tokens
2. Klik "Generate new token" → "Generate new token (classic)"
3. Vul in:
   - Note: `IntelliJ Recruitment Portal`
   - Expiration: `90 days` (of langer)
   - Scopes: Vink aan `repo` (alle checkboxes onder repo)
4. Klik "Generate token"
5. **KOPIEER DE TOKEN** (je ziet deze maar één keer!)

**Stap 2: Push met Token**

Open Terminal in IntelliJ (Alt+F12) en voer uit:

```bash
git push -u origin main
```

Wanneer gevraagd:
- Username: `TasnimOusallami`
- Password: **[PLAK JE TOKEN HIER]**

### Methode 2: GitHub Desktop (Visueel)

1. Download GitHub Desktop: https://desktop.github.com/
2. Installeer en log in met je GitHub account
3. File → Add Local Repository
4. Selecteer: `C:\Users\Lenovo\IdeaProjects\untitled4`
5. Klik "Publish repository"
6. Vink "Keep this code private" uit (of aan, jouw keuze)
7. Klik "Publish repository"

### Methode 3: IntelliJ Git Integration

1. In IntelliJ: VCS → Git → Push (of Ctrl+Shift+K)
2. Klik "Push"
3. Log in met GitHub account wanneer gevraagd
4. Klik "Authorize" in de browser

## 📋 Push Commando

Als je authenticatie hebt ingesteld, voer uit in Terminal:

```bash
git push -u origin main
```

Je zou moeten zien:

```
Enumerating objects: 52, done.
Counting objects: 100% (52/52), done.
Delta compression using up to 8 threads
Compressing objects: 100% (48/48), done.
Writing objects: 100% (52/52), 45.67 KiB | 2.28 MiB/s, done.
Total 52 (delta 12), reused 0 (delta 0), pack-reused 0
To https://github.com/TasnimOusallami/Challenge-.git
 * [new branch]      main -> main
Branch 'main' set up to track remote branch 'main' from 'origin'.
```

## ✅ Verificatie

Na succesvolle push:

1. Ga naar: https://github.com/TasnimOusallami/Challenge-
2. Ververs de pagina
3. Je zou moeten zien:
   - ✅ 50 bestanden
   - ✅ README.md wordt getoond
   - ✅ Alle folders: src/, controllers/, views/, etc.
   - ✅ Laatste commit: "Docs: Team samenwerking en GitHub instructies toegevoegd"

## 👥 Voor Teamleden

Zodra het project op GitHub staat, kunnen teamleden het clonen:

```bash
git clone https://github.com/TasnimOusallami/Challenge-.git
cd Challenge-
```

Zie `TEAM_SAMENWERKING.md` voor volledige instructies.

## 🔄 Volgende Stappen

Na de eerste push:

**Dagelijkse workflow:**
```bash
# Ochtend: haal updates op
git pull origin main

# Werk aan je code
# ...

# Einde dag: push wijzigingen
git add .
git commit -m "Beschrijving van wijzigingen"
git push origin main
```

**Voor nieuwe features:**
```bash
git checkout -b feature/nieuwe-functie
# Werk aan feature
git add .
git commit -m "Feature: beschrijving"
git push origin feature/nieuwe-functie
# Maak Pull Request op GitHub
```

## 🆘 Problemen?

### "Authentication failed"
- Check of je token correct is
- Token moet `repo` scope hebben
- Probeer opnieuw met nieuwe token

### "Repository not found"
- Check of repository bestaat: https://github.com/TasnimOusallami/Challenge-
- Check of je toegang hebt tot de repository
- Probeer: `git remote -v` om remote URL te checken

### "Permission denied"
- Check of je ingelogd bent met het juiste GitHub account
- Check of je write access hebt tot de repository

### "Failed to push some refs"
- Iemand anders heeft gepusht
- Voer eerst uit: `git pull origin main`
- Los eventuele conflicten op
- Push opnieuw: `git push origin main`

## 📞 Hulp Nodig?

Als de push niet lukt:

1. Check de error message zorgvuldig
2. Zoek de error op Google
3. Vraag een teamlid om hulp
4. Check GitHub Docs: https://docs.github.com/en/get-started

## 🎉 Succes!

Zodra de push succesvol is, staat je volledige Recruitment Portal project op GitHub en kunnen teamleden ermee aan de slag! 🚀

---

**Volgende stappen na succesvolle push:**
1. ✅ Verifieer op GitHub.com
2. ✅ Deel de repository link met teamleden
3. ✅ Lees `TEAM_SAMENWERKING.md` voor workflow
4. ✅ Begin met ontwikkelen!
