# Testaus

Robotin liikkuminen annettujen käskyjen mukaan ja ultraäänisensorin toiminta on testattu käytännön testeillä. Video toiminnasta 
readmessa. 

Robotin liikkeiden tarkkuus on testattu käyttämällä Liiku-luokan komentoja ja käskemällä esim. kääntymään 360 astetta, jolloin 
käännöksen jälkeen robotin pitäisi osoittaa samaan suuntaan kuin ennen käännöstä. Myös liikutun matkan tarkkuus on testattu 
vastaavasti.

Lähimmän kohteen löytäminen on testattu asettamalla kohteita robotin ympärille ja toteamalla, että se löytää lähes poikkeuksetta
lähimmäksi asetetun. Tyhjän tilan löytmäinen on testattu vastaavasti.

Haasteita kohteiden etsinnässä tuottaa ultraäänisensorin epätarkkuus, jonka vuoksi tyhjä tila ei välttämättä olekaan tyhjä. 
Esimerkiksi robottiin nähden vinossa olevat pinnat eivät välttämättä heijasta anturin signaalia takaisin päin vaan jonnekin aivan 
muualle, jolloin robotti luulee löytäneensä tthjän tilan ja saattaa ajaa esinettä päin.

