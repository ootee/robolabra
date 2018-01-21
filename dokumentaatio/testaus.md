# Testaus

Robotin liikkuminen annettujen käskyjen mukaan ja ultraäänisensorin toiminta on testattu käytännön testeillä.

Robotin liikkeiden tarkkuus on testattu käyttämällä Liiku-luokan komentoja ja käskemällä esim. kääntymään 360 astetta, jolloin 
käännöksen jälkeen robotin pitäisi osoittaa samaan suuntaan kuin ennen käännöstä. Myös liikutun matkan tarkkuus on testattu 
esim. käskemällä neljästi liikkumaan 100 cm ja kääntymään 90 astetta, jolloin robotti on taas lähtöpaikassaan. 

Lähimmän kohteen löytäminen on testattu asettamalla kohteita robotin ympärille ja toteamalla, että se löytää lähes poikkeuksetta
lähimmäksi asetetun. Kohteen läheidyyden testaava metodi ei toimi aina luotettavasti, johtuen osittain siitä, että robotin 
liikkuttua kohteen luo, ultraäänisenori saattaa osoittaa hieman kohteesta sivuun. Tyhjän tilan löytmäinen on testattu vastaavasti.

Haasteita kohteiden etsinnässä tuottaa ultraäänisensorin epätarkkuus, jonka vuoksi tyhjä tila ei välttämättä olekaan tyhjä. 
Esimerkiksi robottiin nähden vinossa olevat pinnat eivät välttämättä heijasta anturin signaalia takaisin päin vaan robotti luulee 
löytäneensä tyhjän tilan ja saattaa ajaa esinettä päin. Tätä on kuitenkin pyritty vähentämään liikkumalla lyhyempiä matkoja.

Testien perusteella DifferentialPilot-luokalle annettavia pyörien halkaisijoita jouduttiin muuttamaan todellista pienemmiksi, että 
robotti saatiin kääntymään tarpeeksi tarkasti. Tämän myötä robotin kulkema matka piteni hieman, esim. käsky liikkua 100 cm 
liikuttaa robottia noin 103 cm.

Suhteessa kääntymisen virheeseen tämä on kuitenkin hyväksyttävissä, koska kääntymisen tarkkuus on robotin toiminnan kannalta 
tärkeämpää kuin liikutun matkan. Lähintä kohdetta etsittäessä liikutut matkat ovat yleensä alle metrin, jolloin muutaman sentin 
heitto ei juuri vaikuta tulokseen. 

Toisaalta tyhjää tilaa etisttäessä liikutaan sensorien tarkkuusrajoitteiden vuoksi kerrallaan vain 50 cm, jolloin virhe jää myös 
merkityksettömän pieneksi.

Valoisuussensori pitäisi kalibroida uudellen (tai automatisoida kalibrointi) valaistusolosuhteiden vaihtuessa, joten sen toiminnan 
testaamista on helpotettu peittämällä sensori teipillä pimeän simuloimiseksi.
