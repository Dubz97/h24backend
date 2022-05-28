# h24backend
Sidste års 24timers eksame backend
Opgave beskrivelse:

24 timers eksamensprojekt
Programmering 2, 3. semester KEA, efterår 2021.

Du skal i dette eksamensprojekt bygge en simpel full stack web application. 
Opgaven tager udgangspunkt i det seneste kommunalvalg der tog sted i november 2021. 
Backend delen skal implementeres med brug af Spring-Boot og en MySQL database eller en tilsvarende ekstern SQL database. Frontend skal være en separat HTML/JavaScript application, helst i et separat projekt.
Projektet er delt i 3 separate opgaver, og kan løses i vilkårlig rækkefølge. 
Uanset skal du være sikker på at inkludere både backend kode (gerne med nogle JUnit tests) og frontend-code.

Det forventes at du arbejder på dette projekt alene, og ikke deler nogen form for kode med andre.
Opgave 1:
a)	Du skal modellere kommunalvalget i en enkelt kommune som du selv vælger. 
b)	Byg et Spring Boot projekt med Database og JPA, med tabeller som partier og kandidater der opstiller for hvert parti.    
Opgave 2:
a) Tilføj en restcontroller som kan tage imod en request (fra Postman eller browser-klient) til at oprette, rette og slette kandidater for de enkelte partier.
b) Tilføj kode, så restcontrolleren også kan returnere en liste af kandidater tilbage til Postman eller browser-klient.
c) I rest api opret en metode der kan returnere kandidater fra et givent parti.
Opgave 3: 
a) Byg en HTML/JavaScript frontend til dit projekt, som viser alle kandidater. Det skal være muligt at få sorteret kandidater efter parti.
b) Tilføj kode, så man også kan oprette, opdatere og slette kandidater.
c) Forestil dig nu at valget er slut. Stemmerne er talte. Opret nu et skærmbillede der viser en liste over de enkelte partier og deres procentdel af stemmerne.


Hints:
Se eksempler på data du kan bruge nedenfor.
Data

Du kan bruge en hvilken som helst kommune til dit projekt. Nedenfor er kandidaterne der opstillede i Samsø kommune.
Ref: https://www.samsoe.dk/politik/valg/kommunalvalg-2021/oversigt-over-godkendte-kandidater-samt-indgaaede-valgforbund 

A - Socialdemokratiet
Marcel Meijer
Michael Kristensen
Helle Hansen
Karina Knobelauch
Stefan Hafstein Wolffbrandt
Robert V. Rasmussen
Pia Ramsing
Anders Baun Sørensen

C - Det konservative Folkeparti
Per Urban Olsen
Peter Askjær
Martin Sørensen
Louise Bramstorp
Sigfred Jensen
Jørn C. Nissen
Morten Ø. Kristensen
Susanne Andersen
Iulian V. Paiu
Per Hingel

F - SF, Socialistisk Folkeparti
Ulla Holm
Kjeld Bønkel
Anne Grethe Olsen
Lone Krag
Børge S. Buur

O - Dansk Folkeparti
Per Mortensen

V - Venstre, Danmarks Liberale Parti
Søren Wiese
Anita Elgaard Højholt Olesen
Carsten Bruun
Mogens Exner
Anja Guldborg
Klaus Holdorf

Ø - Enhedslisten + De Rød Grønne
Katrine Høegh Mc Quaid
Jette M. Søgaard
Søren Caspersen
Pia Birkmand
