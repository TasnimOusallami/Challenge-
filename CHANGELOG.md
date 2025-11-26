# Changelog - Recruitment Portal Updates

## Versie 2.0 - Nieuwe Functionaliteit

### Home Pagina Wijzigingen
✅ Tekst aangepast naar zwart voor betere leesbaarheid
✅ Twee aparte registratie knoppen toegevoegd:
   - "Registreer voor sollicitant"
   - "Registreer voor bedrijf"
✅ Rechtsboven icoontjes toegevoegd:
   - 👤 Profiel-icoon (naar CV pagina)
   - 💳 Kaart-icoon (bestel NFC-kaart)

### Sollicitant Portaal Updates
✅ Profiel pagina omgezet naar CV pagina
   - Naam, email, wachtwoord velden verwijderd
   - Focus op vaardigheden en werkervaring
   - Diploma upload functionaliteit behouden
✅ Login leidt direct naar bedrijfselectie
✅ Bedrijfselectie → Vacature lijst (nieuw)
✅ Vacature detail pagina met volledige informatie:
   - Functienaam
   - Status
   - Adres
   - Werkuren
   - Dienstverband
   - Salarisindicatie
✅ Solliciteer knop met bevestiging
✅ Uitloggen functionaliteit toegevoegd

### Bedrijfsportaal Updates
✅ Aparte registratie voor bedrijven
✅ Gebruiker details uitgebreid met:
   - Diploma's sectie
   - Neem contact op met tekstvak
   - Verstuur bericht functionaliteit

### NFC-Kaart Functionaliteit
✅ Nieuw scherm voor NFC-kaart bestellen
✅ Bestel knop met bevestiging
✅ Toegankelijk via kaart-icoon rechtsboven

### Technische Verbeteringen
✅ Nieuwe controllers:
   - CVController
   - VacatureListController
   - VacatureDetailController
   - RegisterSollicitantController
   - RegisterBedrijfController
   - NFCKaartController
✅ Nieuw model: Vacature.java
✅ Alle navigatie routes bijgewerkt
✅ Styling verbeterd met logout button
✅ Dummy data toegevoegd voor vacatures

### Verwijderde Functionaliteit
❌ Oude profiel pagina (vervangen door CV pagina)
❌ Bedrijf detail pagina (vervangen door vacature lijst)
❌ Algemene registratie (gesplitst in sollicitant/bedrijf)
