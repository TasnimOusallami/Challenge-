# Navigatie Flows - Versie 3.0

## 🏠 HOME PAGINA (VOOR LOGIN)
**Zichtbaar:**
- Twee registratie knoppen
- Zwarte tekst

**NIET zichtbaar:**
- ❌ Profiel-icoon
- ❌ NFC-kaart icoon

**Acties:**
- "Registreer voor sollicitant" → RegisterSollicitantView
- "Registreer voor bedrijf" → RegisterBedrijfView

---

## 👨‍💼 SOLLICITANT PORTAAL FLOW

### 1. Registratie
**RegisterSollicitantView**
- Vul gegevens in
- "Registreer" → LoginSollicitantView

### 2. Login ✅ ICONEN VERSCHIJNEN
**LoginSollicitantView**
- Vul email + wachtwoord in
- "Log in" → SessionManager.login("sollicitant")
- → BedrijfSelectieView (met iconen!)

### 3. Bedrijfselectie 👤💳
**BedrijfSelectieView**
- Toon 10 bedrijven
- Klik bedrijf → VacatureListView
- 👤 → CVView
- 💳 → NFCKaartView
- "Uitloggen" → Home (iconen weg)

### 4. Vacature Lijst 👤💳
**VacatureListView**
- Toon vacatures van bedrijf
- Dubbelklik vacature → VacatureDetailView
- 👤 → CVView
- 💳 → NFCKaartView
- "Uitloggen" → Home

### 5. Vacature Details 👤💳
**VacatureDetailView**
- Toon alle vacature info
- **"Solliciteer"** → 
  - ✅ Alert: "Je hebt gesoliciteerd"
  - → BedrijfSelectieView
- 👤 → CVView
- 💳 → NFCKaartView
- "Uitloggen" → Home

### 6. CV Pagina 👤💳
**CVView**
- Bewerk vaardigheden/werkervaring
- Upload diploma's
- "Verder naar bedrijven" → BedrijfSelectieView
- 👤 → (al op CV pagina)
- 💳 → NFCKaartView
- "Uitloggen" → Home

### 7. NFC-Kaart 👤💳
**NFCKaartView**
- **"Bestel"** →
  - ✅ Alert: "NFC-kaart besteld"
  - → HomeView
- 👤 → CVView
- 💳 → (al op NFC pagina)

---

## 🏢 BEDRIJFSPORTAAL FLOW

### 1. Registratie
**RegisterBedrijfView**
- Vul bedrijfsgegevens in
- "Registreer" → LoginBedrijfView

### 2. Login ✅ ICONEN VERSCHIJNEN
**LoginBedrijfView**
- Vul email + wachtwoord in
- "Log in" → SessionManager.login("bedrijf")
- → VacatureOverzichtView (met iconen!)

### 3. Vacature Overzicht 👤💳 (NIEUW!)
**VacatureOverzichtView**
- Toon 3 vacatures van bedrijf:
  1. Software Engineer - Amsterdam
  2. Technical Support - Rotterdam
  3. Product Manager - Utrecht
- Dubbelklik vacature → AantalGebruikersView
- 👤 → CVView
- 💳 → NFCKaartView
- "Uitloggen" → Home

### 4. Gebruikers Lijst 👤💳
**AantalGebruikersView**
- Toon 235 gebruikers (10 zichtbaar)
- Dubbelklik gebruiker → GebruikerDetailView
- 👤 → CVView
- 💳 → NFCKaartView
- "Uitloggen" → Home

### 5. Gebruiker Details 👤💳
**GebruikerDetailView**
- Toon vaardigheden, werkervaring, diploma's
- Tekstvak voor bericht
- **"Verstuur bericht"** →
  - ✅ Alert: "Bericht verstuurd"
  - Blijft op pagina
- 👤 → CVView
- 💳 → NFCKaartView
- "Uitloggen" → Home

---

## 🔐 SESSION MANAGEMENT

**Login:**
```java
SessionManager.login("sollicitant"); // of "bedrijf"
```

**Logout:**
```java
SessionManager.logout();
// Navigeert naar HomeView
// Iconen verdwijnen automatisch
```

**Check Status:**
```java
SessionManager.isLoggedIn(); // true/false
SessionManager.getUserType(); // "sollicitant" of "bedrijf"
```

---

## 📢 MELDINGEN OVERZICHT

| Actie | Melding | Navigatie |
|-------|---------|-----------|
| Solliciteer | "Je hebt gesoliciteerd" | → BedrijfSelectieView |
| Verstuur bericht | "Bericht verstuurd" | Blijft op pagina |
| Bestel NFC | "NFC-kaart besteld" | → HomeView |

---

## 🎯 ICONEN ZICHTBAARHEID

**VOOR login (HomeView):**
- ❌ Geen profiel-icoon
- ❌ Geen NFC-kaart icoon

**NA login (alle schermen):**
- ✅ 👤 Profiel-icoon (naar CVView)
- ✅ 💳 NFC-kaart icoon (naar NFCKaartView)
- ✅ "Uitloggen" knop (rode knop)

**Schermen met iconen:**
1. BedrijfSelectieView
2. VacatureListView
3. VacatureDetailView
4. CVView
5. VacatureOverzichtView
6. AantalGebruikersView
7. GebruikerDetailView
8. NFCKaartView

---

## 🔄 NAVIGATIE PATRONEN

**Sollicitant:**
```
Login → Bedrijfselectie → Vacature lijst → Vacature details
                ↓              ↓              ↓
               CV ←───────────┴──────────────┘
                ↓
           NFC-kaart → Home
```

**Bedrijf:**
```
Login → Vacature overzicht → Gebruikers lijst → Gebruiker details
              ↓                    ↓                   ↓
             CV ←──────────────────┴───────────────────┘
              ↓
         NFC-kaart → Home
```

**Uitloggen (overal):**
```
Elk scherm → "Uitloggen" → Home (zonder iconen)
```
