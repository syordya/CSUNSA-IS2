# Tutorial de Git y GitHub
Git es un software de código abierto desarrollado por Linux, tambien se puede usar en Windows y Mac, en este tutorial aprenderemos los comandos básicos de Git y GitHub.

### Autor
[Yordy W. Santos Apaza](https://github.com/syordya)

### Definiciones
* Commit: identifica los cambios hechos.
* Branch: se pueden pensar como una línea de tiempo a partir de los commit. Hay siempre como mínimo una rama principal o predefinida llamada master.
* Merge: fusionar la rama en la que se esta trabajando con la original.
* Push: sube los cambios hechos a una rama de trabajo tuya y/o de tu equipo remota.
* Pull: actualizar su rama HEAD actual con los últimos cambios desde el servidor remoto.

## Git (local)
<p>mkdir.. : Crear la carpeta de nuestro proyecto Git
<p>pwd : Localizar el proyecto
<p>cd.. : Ubicar el proyecto en el terminal
<p>git init : Inicializa el repositorio Git
<p>git status : Consulta lo que ha cambiado
<p>git add . : Agrega todos los archivos al repositorio

![img](images/1c.png)

<p>git branch : Ver todas las ramas
<p>git branch 'Branch' : Crear rama
<p>git checkout 'Branch' : Entrar a la rama

![img](images/2c.png)

<p>git reset HEAD~1 : Regresa a la versión anterior

![img](images/3c.png)

<p>git pull : Mezcla los cambios de repositorio y lo actualiza localmente

![img](images/4c.png)

<p>git commit -m "Commit" : Guarda todos tus cambios con un comentario

## GitHub (remote)
<p>git config --global user.email "syordya@gmail.com"
<p>git config --global user.name "Yordy Santos"
<p>git remote add origin https://github.com/syordya/Proyecto_GitHub.git
<p>git push -u origin 'Branch' : Subir los cambios a GitHub

![img](images/5c.png)
