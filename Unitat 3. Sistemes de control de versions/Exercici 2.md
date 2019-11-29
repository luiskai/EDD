## Memòria d'instal·lació de Subversion Edge i exercicis sobre svn.

### Instalación docker
Lo primero que haremos es actualizar los repositorios y después instalar todos los paquetes para poder realizar la instalación de Docker.

```sudo apt install apt-transport-https ca-certificates curl software-properties-common```

Con el siguiente comando descargué y agregué la llave de Docker

```curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo aptkey add -```

Agregué el repositorio con el siguiente comando:

```sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"```

Una vez hecho todo esto simplemente instalaremos el paquete de docker:

```sudo apt-get install docker-ce```


### Instalación subversion
Executarmen el següent comando per a instalar subversion:
```docker run -d mamohr/subversion-edge```

Ara tenim que parar i eliminar el contenidor de la seüent manera:
```docker ps```
Li farem un docker stop i docker rm a eixe contenidor:  
```docker stop 3a44963e4e29```  
```docker rm 3a44963e4e29```  
Ara tornarem a llençar el contenidor de la següent forma:  
```docker run -d -p 3343:3343 -p 4434:4434 -p 18080:18080 --name svnserver mamohr/subversion-edge bcebfd61510e4fb5c456503a81c528f535d2407a90df1a8a031b1300edc8335a```  

### SVN
Per a poder accedir al nostre repositori hem de agafar el comando que ens fique en el subversion. Será algo paregut a aço:  
```svn co http://127.0.0.1:18080/svn/test test```

Ficarem la contrasenya del nostre usuari de subversion.