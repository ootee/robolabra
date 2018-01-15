# Toteutus

## Ohjelman yleisrakenne

Ohjelma on toteutettu Javalla. Robotin jokainen toiminnallisuus on eriytetty omaan luokkaansa.

Main-luokka ohjaa robotin toimintaa ja kutsuu muita luokkia. x-luokka toteuttaa seuraus- ja välttelymoodin, joista kulloinkin 
käytettävä valitaan valoisuusanturin signaalin perusteella: pimeällä seurataan ja valoisalla vältellään. Liiku-luokka toteuttaa 
robotin liikkumiseen tarvittavat metodit pl. robotin käsi, jota ohjaa Kasi-luokka. Kohteenetsijä sisältää kohteiden etsimiseen 
tarvittavat metodit ja Kohde-luokka toteuttaa olion, jonka sijaintitietojen perusteella robotti suunnistaa.

## Ohjelmointiympäristö

RojbOS + leJOS

## Puutteet ja parannusehdotukset

wip

## Lähteet

LeJOS-tutoriaali ja -API-dokumentaatio
