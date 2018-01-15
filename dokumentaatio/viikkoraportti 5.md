## Mitä tein

Maanantaina 4 h kohteen seuraamisen ja välttelyn toteutusta. Muistin että palautus oli vasta keskiviikkona ja alkperäinen 
suunnitelma oli tehdä työtä tiistaina ja keskiviikkona, joten viikon aikaansaannokset jäivät hieman laihoiksi. Sain kuitenkin
korjattua viime viikolla ilmenneen ongelman kohteen tunnistamisessa lähietäisyydeltä ja nyt robotti lyö vain, jos kohde on 
edelleen kosketusetäisyydellä sen luo siirtymisen jälkeen. Muussa tapauksessa se etsii uudestaan lähimmän kohteen.

## Miten ohjelma on edistynyt

Ohjelma alkaa olemaan melko valmis. Enää pitäisi eriyttää seuraus- ja välttelytoiminnot omaksi luokakseen ja laittaa 
valoisuusanturi valitsemaan kulloinkin käytettävän toiminnon välillä. Välttelytoimintoa pitäis myös hienosäätää.

## Mitä opin tällä viikolla

Ultraäänisensori on edelleen epätarkka ja viime viikolla ilmennyt ongelma kosketusetäisyydellä olevan kohteen tunnistamisessa
korjaantui vaihtamalla tunnistusehtona ollut uä-sensorin mittaama etäisyys alle 10 cm:stä alle 15 cm:iin.

Tyhjän tilan etsinnän totetuttamista vaikeuttaa se, että uä-sensori ei välttämättä tunnista edessä olevaa kohdetta, jos se ei
ole kohtisuorassa robottiin nähden. Näin ollen kun skannaus palauttaa null sen merkkinä, ettei löytänyt edestä estettä, robotti 
saattaa törmätä esteeseen.

Tätä voisi ehkä yrittää korjata sillä, että vaadittaisiin kolme peräkkäistä null-mittausta ennen kuin voidaan todeta tyhjän tilan 
löytyneen.

## Mitä epäselvää

Tässä vaiheessa ei enää juuri mikään.

## Mitä seuraavaksi

Eriytetään seuraus- ja välttelymoodit omaan luokkaansa. Laitetaan valoisuusanturi valitsemaan käytettävä moodi. Hiotaan tyhjän 
tilan etsimistä siten, että yksittäinen mittaus ei riitä.
