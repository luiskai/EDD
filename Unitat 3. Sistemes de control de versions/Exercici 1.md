## Memòria de l'exercici d'RCS 

1. Creeu un fitxer anomenat exercici.md, i afegiu-li algun contingut en format Markdwon.  
touch exercici.md  
nano exercici.md  
cat exercici.md  
Output: Prueba1  

2. Registreu el fitxer per a que el controle RCS.  
ci -u exercici.md  

3. Intenteu modificar el fitxer, per veure si teniu o no permís.  
No, no tenim permís.

4. Feu un checkout del fitxer, ara sí, per afegir canvis.  
co -l exercici.md

5. Modifiqueu el fitxer i afegiu-li més contingut. Aquesta serà la versió 1.2.  
nano exercici.md  
ci -u exercici.md 

6. Amb un altre usuari, intenteu modificar el fitxer (fent el checkout abans).  
En el mac no podia canviar de usuari en terminal.  

7. Com a l’usuari original, registreu els canvis al fitxer.  


8. Si podeu, afegiu més informació al fitxer, ara serà la versió 1.3.  
nano exercici.md  
ci -u exercici.md  

9. Com a l’usuari original, visualitzeu les diferències entre les versions, i torneu a la versió 1.2.  
Com no es poden vore les diferencies de les 3 versions tenim que fer entre la 1 i la 2 i despres la 2 i la 3.  
rcsdiff -r1.1 -r1.2 exercici.md  
rcsdiff -r1.2 -r1.3 exercici.md  
Per a tornar a la versio 1.2: co -r1.2 exercici.md
10. Apliqueu més canvis i guardeu-los amb la versió 1.4.  
Escrivim algo:
nano exercici.md  
ci -u exercici.md  
Fiquem versio 4 un . i este sera la versió 1.4