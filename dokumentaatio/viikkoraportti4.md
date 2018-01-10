## Mitä tein

Tiistaina 1 h viime vikkolla havaitun kääntymisongelman pohtimista. Ei johtunut akkujen alhaisesta latauksesta.

Keskiviikkona kääntymisongelman debugaamista. Kokeilin eri kääntymisnopeuksia ilman tulosta. Ongelma kuitenkin ratkesi, joten
siitä lisää myöhemmin. Lisäksi yritin implementoida alkeellista kohteen seurausrutiinia. Rakenteellisina muutoksina robottiin 
kääntyvä apupyörä, painopisteen muutos lähemmäs isoja pyöriä kääntymisen helpottamiseksi ja uä-semsorin ja käden 
kiinnityspisteiden muutos. Videossa on vanha versio. Vertaisarviointi tehty.

## Miten ohjelma on edistynyt

Robotti liikkuu tarkasti ja jatkaa kohteen seuraamista, jos se on liikkunut. Ei kuitenkaan vielä osaa lyödä lähietäisyydeltä, 
vaan jatkaa seuraamista loputtomiin.

## Mitä opin tällä viikolla

LeJOS-dokumentaation mukaan DifferentialPilot-luokan pitäisi oikeilla parametreilla kyetä ohjaamaan robottia max. 2 % 
virheellä. Kuitenkin kun pyörien halkaisijat ja raideväli oli mitattu millimetrin kymmenyksen tarkkuudella, robotin kääntymä
360 asteen ympyrä oli arviolta 20 astetta vajaa eli virhe oli noin 5 % luokkaa. 

Käytännössä tämä tarkoitti sitä, että kun robotti kääntyi 360 astetta 20 asteen osissa, jäi viimeinen 20 astetta kääntymättä.
Tästä seurasi ongelmia robotin kääntyessä kohteeseen, koska ohjelma olettaa että robotti osoittaa ympäristön skannauksen jälkeen
samaan suuntaan kuin ennen käännöstä. Robotti kääntyi siis hieman kohteesta ohi.

Tämä saatiin korjattua pienentämällä ohjelmalle annettua pyörän halkaisijaa noin 3 mm eli reilu 5 %. Mittavirhe on melko suuri,
vaikka ottaisi huomioon pyörän kasaan painumisen, joka ei silmämääräisesti ole edes millimetrin luokkaa. 

Sain robotin hakemaan kohteen uudelleen, jos se on liikkunut alkuperäisen mittauksen jälkeen. Toteutus on hieman kömpelö, koska 
ultraäänisensori ei tunnista kuin etäisyyden, joten robotin pitää kääntyä täysi kierros, että se löytää lähimmän kohteen 
uudelleen.

## Mitä epäselvää

Jostain syystä robotti ei osaa lyödä kohdetta, jos se ei ole liikkunut. Vaikuttaisi siltä, että kun kohteen vieressä tehdään 
uusi mittaus, tulosta ei jostain syystä oteta huomioon ja robotti jatkaa kuin ei olisikaan kohteen vieressä. Yritin korjata 
tätä myös siirtämällä ultraäänisensorin alemmas, mutta tällä ei ollut vaikutusta.

## Mitä seuraavaksi

Yritetään keksiä miksi ultraäänisensori ei tunnista vieressä olevaa kohdetta tai mietitään vaihtoehtoinen keino selvittää, 
onko robotti kohteen vieressä. Lisätään valosensorin perusteella toimiva kohteen välttely -toiminto ja tehdään testausluokkaan
liiketestit. Lisäksi eriytetään seuraamis- ja välttelytoiminnot omiin luokkiinsa. Hiotaan suunnistusalgoritmia siten, että 
pidemmällä olevien kohteiden luo liikuttaessa tehdään suunnan korjauksia kesken matkan.
