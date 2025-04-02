# Configuración en IntelliJ

1. **Instalar Git (si no está instalado)**

* Descarga e instala Git desde [git-scm.com](https://git-scm.com/).
* Asegúrate de que Git está disponible en la terminal ejecutando:
  ```sh
  git --version
  ```

![1739289547496](image/readme/1739289547496.png)


### 2. **Configurar Git en IntelliJ IDEA**

* Abre IntelliJ IDEA.
* Ve a  **File > Settings > Version Control > Git** .
* En el campo "Path to Git executable", asegúrate de que el camino a `git.exe` (Windows) o `git` (Linux/Mac) está correcto.
* Haz clic en **Test** para verificar la configuración.

![1739289637718](image/readme/1739289637718.png)



### 3. **Conectar IntelliJ con GitHub**

* Ve a  **File > Settings > Version Control > GitHub** .
* Haz clic en  **Add account** .
* Selecciona **Log in via GitHub** y sigue las instrucciones para autorizar IntelliJ.
  * AÑADE la opción de **clonar mediantes ssh**

![1739289747473](image/readme/1739289747473.png)

Autoriza la conexión:

![1739289787244](image/readme/1739289787244.png)

---



![1739289933261](image/readme/1739289933261.png)

---



Para confirmar, mejor usar contraseña que móvil:

![1739289978367](image/readme/1739289978367.png)

---

![1739289992792](image/readme/1739289992792.png)

#### En IntelliJ, te verás logueado:

![1739290023952](image/readme/1739290023952.png)




* Alternativamente, puedes usar un  **token de acceso personal** :
  * Ve a [GitHub Tokens](https://github.com/settings/tokens).
  * Genera un nuevo token con permisos para repositorios (`repo`).
  * Copia el token y pégalo en IntelliJ.

### 4. **Clonar un repositorio desde GitHub**

* Ve a  **File > New > Project from Version Control > Git** .
* Introduce la URL del repositorio.
* Selecciona el directorio donde se clonará.
* Haz clic en  **Clone** .

> Esta opción, de primeras, es la más fácil.



Una vez creado el repositorio Entornos, creamos el repositorio Programación, que será privado.




### 5. **Inicializar un nuevo repositorio y subirlo a GitHub**

* Abre un proyecto en IntelliJ.
* Ve a  **VCS > Enable Version Control Integration** , selecciona **Git** y haz clic en  **OK** .
* Ve a **Git > Commit** para confirmar los archivos que quieres incluir.
* Haz clic en  **Commit** .
* Luego, ve a  **Git > Push** , elige el repositorio remoto y haz clic en  **Push** .


![1739338156089](image/readme/1739338156089.png)

---

![1739338197134](image/readme/1739338197134.png)

---

Rama master

![1739338237290](image/readme/1739338237290.png)

---

Hacer el commit y el push

![1739338319293](image/readme/1739338319293.png)

---

![1739338376411](image/readme/1739338376411.png)

---

![1739338424796](image/readme/1739338424796.png)

#### Creamos el repositorio Programacion

Lo hacemos privado

![1739338701301](image/readme/1739338701301.png)

Cogemos la nueva ruta

![1739338740260](image/readme/1739338740260.png)


https://github.com/tuusuarioGit/Programacion.git


Y autorizamos a Git


#### Definimos la ruta Remota

`https://github.com/tuUsuario/Programacion.git`

![1739338538085](image/readme/1739338538085.png)

Y autorizamos para que nos permita hacer el push

![1739338918039](image/readme/1739338918039.png)

Y, si hemos hecho bien el Git Push, nos debe aparecer en el repositorio de github

![1739340787028](image/readme/1739340787028.png)

### 6. **Configurar el repositorio remoto manualmente**

* Abre la terminal de IntelliJ.
* Ejecuta:
  ```sh
  git remote add origin https://github.com/tu-usuario/tu-repositorio.git
  git branch -M main
  git push -u origin main
  ```

### 7. **Trabajar con Git en IntelliJ**

* Usa el panel de **Git** en la parte inferior para realizar commits, pulls y pushes.
* Para crear nuevas ramas, ve a  **Git > Branches** .
* Para fusionar cambios, usa **Git > Merge** o  **Rebase** .
