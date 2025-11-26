# Navigatie Flows - Recruitment Portal

## 🏠 HOME PAGINA
**Beschikbare acties:**
- Klik "Registreer voor sollicitant" → RegisterSollicitantView
- Klik "Registreer voor bedrijf" → RegisterBedrijfView
- Klik 👤 (profiel-icoon) → CVView
- Klik 💳 (kaart-icoon) → NFCKaartView

---

## 👨‍💼 SOLLICITANT PORTAAL FLOW

### 1. Registratie
**RegisterSollicitantView**
- Vul naam, email, wachtwoord, vaardigheden, werkervaring in
- Klik "Registreer" → LoginSollicitantView
- Link "log hier in" → LoginSollicitantView

### 2. Login
**LoginSollicitantView**
- Vul email en wachtwoord in
- Klik "Log in" → BedrijfSelectieView

### 3. Bedrijfselectie
**BedrijfSelectieView**
- Toon 10 bedrijven in grid
- Klik op bedrijf → VacatureListView
- Klik 👤 → CVView
- Klik "Uitloggen" → HomeView

### 4. Vacature Lijst
**VacatureListView**
- Toon lijst met vacatures van geselecteerd bedrijf
- Dubbelklik op vacature → VacatureDetailView
- Klik 👤 → CVView
- Klik "Uitloggen" → HomeView

### 5. Vacature Details
**VacatureDetailView**
- Toon volledige vacature informatie:
  - Functienaam
  - Status
  - Adres
  - Werkuren
  - Dienstverband
  - Salarisindicatie
- Klik "Solliciteer" → Bevestiging "Sollicitatie verstuurd!"
- Klik 👤 → CVView
- Klik "Uitloggen" → HomeView

### 6. CV Pagina
**CVView**
- Bekijk/bewerk vaardigheden
- Bekijk/bewerk werkervaring
- Upload diploma's
- Klik "Verder naar bedrijven" → BedrijfSelectieView
- Klik "Uitloggen" → HomeView

---

## 🏢 BEDRIJFSPORTAAL FLOW

### 1. Registratie
**RegisterBedrijfView**
- Vul bedrijfsnaam, email, wachtwoord, beschrijving in
- Klik "Registreer" → LoginBedrijfView
- Link "log hier in" → LoginBedrijfView

### 2. Login
**LoginBedrijfView**
- Vul email en wachtwoord in
- Klik "Log in" → AantalGebruikersView

### 3. Gebruikers Overzicht
**AantalGebruikersView**
- Toon lijst met 235 gebruikers (10 zichtbaar)
- Dubbelklik op gebruiker → GebruikerDetailView

### 4. Gebruiker Details
**GebruikerDetailView**
- Toon gebruiker informatie:
  - Geselecteerde vacatures
  - Vaardigheden
  - Werkervaring
  - Diploma's
- Neem contact op sectie:
  - Tekstvak voor bericht
  - Klik "Verstuur bericht" → Bericht verzonden
- Navigatie terug → AantalGebruikersView

### 5. Sollicitatie Beheer (Bedrijf kant)
**SollicitatieView**
- Bekijk sollicitant details
- Vaardigheden en werkervaring
- Diploma's lijst
- Schrijf bericht in tekstvak
- Klik "Verstuur bericht" → Bericht verzonden

---

## 💳 NFC-KAART FLOW

**NFCKaartView**
- Klik op 💳 icoon vanaf home
- Toon bestel scherm
- Klik "Bestel" → Bevestiging "NFC-kaart besteld!"
- Navigatie terug → HomeView

---

## 🔄 ALGEMENE NAVIGATIE

**Op elk scherm:**
- 🏠 → HomeView (altijd beschikbaar)
- ← → Vorige pagina (context-afhankelijk)
- → → Placeholder (niet actief)
- 👤 → CVView (op sollicitant schermen)
- "Uitloggen" → HomeView (rode knop)

---

## 📊 DUMMY DATA

**Bedrijven:**
- Microsoft, McDonalds, ING, Philips, NVIDIA
- Google, Amazon, Meta, Apple, Heineken

**Vacatures (Microsoft voorbeeld):**
1. Software Engineer
   - Status: Open
   - Adres: Amsterdam, Nederland
   - Werkuren: 40 uur per week
   - Dienstverband: Fulltime
   - Salaris: €4500 - €6500 per maand

2. Technical Support
   - Status: Open
   - Adres: Rotterdam, Nederland
   - Werkuren: 32-40 uur per week
   - Dienstverband: Fulltime/Parttime
   - Salaris: €3000 - €4000 per maand

**Gebruikers:**
- Mohammed El-Mansouri
- Aisha Karim
- Priya Natarajan
- Chen Wei
- Amara Okafor
- Hiroshi Tanaka
- Fatima Al-Mansouri
- Mateo Rivera
- Linh Nguyen
- Zanele Dlamini

**CV Data:**
- Vaardigheden: C#, C++, PHP, Java, JavaScript, HTML, CSS
- Werkervaring: 2016-2020 Odido (IT), 2020-2025 Microsoft (Developer)
- Diploma's: Bachelor Computer Science, Master Software Engineering
