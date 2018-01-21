# Toteutus

## Robotin rakenne

Robotti on pyritty tekemään jalanjäljeltään suhteelisen pieneksi, mutta käytännössä tätä rajoittaa keskusyksikön koko ja paino ja 
käden sijainti. Painopiste on pyritty saamaan vetävien pyörien päälle, mutta tästä johtuen takapyörä on jouduttu viemään melko 
kauas painopisteestä. Myös käden rakenne lisää robotin jalanjälkeä. Robotin kääntyessä etupyöriensä ympäri takapyörä ja käsi 
saattavat ottaa läheisiin kohteisiin kiinni.

Valoisuussensori on sijoitettu pitkän tangon nokkaan, jotta se havaitsisi valaistuksen muutokset paremmin. Äänisensori on 
sijoitettu vastaavasti lähinnä ulkonöllisistä syistä, eikä se ole robotin käytössä.

## Ohjelman yleisrakenne

Ohjelma on toteutettu Javalla. Robotin jokainen toiminnallisuus on eriytetty omaan luokkaansa.

Main-luokka ohjaa robotin toimintaa ja kutsuu muita luokkia. Toiminta-luokka toteuttaa seuraus- ja välttelymoodin, joista 
kulloinkin käytettävä valitaan valoisuusanturin signaalin perusteella: pimeällä seurataan ja valoisalla vältellään. Liiku-luokka 
toteuttaa robotin liikkumiseen tarvittavat metodit pl. robotin käsi, jota ohjaa Kasi-luokka. Kohteenetsijä sisältää kohteiden 
etsimiseen tarvittavat metodit ja Kohde-luokka toteuttaa olion, jonka sijaintitietojen perusteella robotti suunnistaa.

## Ohjelmointiympäristö

Ohjelma on toteutettu vapaasti saatavilla olevalla RojbOS + leJOS -yhdistelmällä.

## Puutteet ja parannusehdotukset

Tällä hetkellä robotin liikkeet ovat parhaaksi havaittu yhdistelmä tarkkuutta ja nopeutta. Robotti voisi kohdetta etsiessään
kääntyä vielä tiheämmin, mutta toisaalta ultraäänisensorin epätarkkuus saattaa ulosmitata tästä saatavan hyödyn.

Ongelmat syntyvät lähinnä robotin ollessa kohteen lähietäisyydellä, jolloin pienikin kulma suhteessa kohteeseen saattaa estää 
ultraäänisensoria havaitsemasta sitä. Paras ratkaisu tähän voisi olla jokin sovellus konenäöstä, joka keskittäisi robotin 
suhteessa kohteeseen.

Ultraäänisensorin epätarkkuus aiheuttaa ongelmia myös tyhjää tilaa etsittäessä, jolloin robotin edessä voi olla hyvinkin iso 
kohde, jolla ei kuitenkaan ole tasaista pintaa, josta ääni voisi heijastua. Nämä jäävät helposti sensorilta havaitsematta, josta
seuraa yleensä törmäys. Tähänkin konenäkö voisi olla ratkaisu, ettei robotin tarvitsisi luottaa vain yhteen sensoriin.

Robottia suunnitellessani harkitsin myös kosketussensorin käyttämistä lähietäisyydellä olevan kohteen tunnistamiseen, mutta 
käytännössä sensorin pohjaan painaminen vaatii liian paljon voimaa suhteessa ideaalikohteiden painoon. Seurauksena sensori 
päätyisi työntämään kohdetta sen sijaan, että kohde painaisi sensoria. 

Painavampien kohteiden käyttö vaatisi robotin käden rakenteen tukevoittamista ja/tai parempaa algoritmia käden liikkeelle, joka 
tunnistaisi liikkeen pysäyytävät esteet.

## Lähteet

LeJOS-tutoriaali ja -API-dokumentaatio
