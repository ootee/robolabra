## Mitä tein

Keskiviikkoa robotin kasaus, luokka robotin liikkumiselle, ensimmäinen versio robotin kädestä. Aikaa meni n. 7 h.
Torstaina luokat kohteelle, kohteen etsimiseen ja käden ohjaamiseen, toinen versio kädestä, ultraäänisensorin implementointi, 
robotin liikkumisen kalibroimista. Käytetty aika n. 5 h.

## Miten ohjelma on edistynyt

Robotti löytää lähimmän kohteen, siirtyy sen luo ja heilauttaa kättä. Liikkuminen oli aluksi kohtuu tarkkaa, mutta jostain syystä 
tarkkuus heikkeni torstain edetessä ilman muutoksia koodiin.

## Mitä opin tällä viikolla

Robotin liikkeiden tarkkuus on suoraan verrannollinen moottorien nopeuteen, eli mitä pienempi nopeus sitä pienemmät virheet. 
Jouhevan toiminnan kannalta nopeudet eivät kuitenkaan voi olla kovin pieniä.

Ultraäänisensori ei ole kovin tarkka ja saattaa mahdollisesti mitata lyhimmän etäisyyden robotin olleessa kohtisuoran sijaan hieman 
vinossa kohteeseen nähden. Mahdollisesti tämän seurauksena robotti saattaa lähestyä kohdetta hieman vinossa. Etäisyysmitta on 
kuitenkin kohtuu tarkka, koska sitä käytetään suoraan moottorien ohjaamiseen ja robotti pysähtyy aina muutaman sentin tarkkuudella 
kohteeseen kiinni.

## Mitä epäselvää

Aluksi kohdetta etsiessään robotti teki komentojen mukaisesti täyden 360 asteen ympyrän. Kun käden heilautuksen ohjelmoi mukaan,
ympyrä tuntuu jäävän noin 10-15 astetta vajaaksi. Tästä on haittaa kun robotti kääntyy oikeaan suuntaan liikkuakseen kohteen luo, 
koska täyden ympyrän jäädessä vajaaksi, robotti kääntyy vastaavasti liian suuren käännöksen eli hieman kohteesta ohi. Tämä saattaa 
johtua akkujen alhaisesta jännitteestä, vaikka keskusyksikön mukaan niissä pitäis olla virtaa vielä puolet jäljellä. Kokeilen 
akkujen lataamista.

Tällä hetkellä en oikein tiedä, miten lähtisin toteuttamaan kohteen seuraamista.

## Mitä seuraavaksi

Kohteen seuraaminen, robotin liikkeiden tarkkuuden parantaminen
