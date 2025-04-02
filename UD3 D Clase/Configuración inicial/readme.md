### **Instalar y configurar GitHub en Windows**

Para usar **GitHub** en Windows, primero debes instalar **Git** y configurarlo correctamente.

---

### **1️⃣ Descargar e instalar Git**

1. Ve a la página oficial de Git:

   👉 [https://git-scm.com/downloads](https://git-scm.com/downloads)
2. Descarga la versión para Windows.
3. Ejecuta el instalador y sigue estos pasos:

   * En la opción  *"Adjusting your PATH environment"* , selecciona  **Git from the command line** .
   * Usa la opción recomendada para otras configuraciones.
   * Finaliza la instalación.

---

### **2️⃣ Verificar la instalación**

Abre **Símbolo del sistema (CMD) o PowerShell** y escribe:

```bash
git --version
```

Si Git está instalado correctamente, verás la versión instalada.

![1739226176378](image/readme/1739226176378.png)

---

### **3️⃣ Configurar Git con tu cuenta de GitHub**

Abre **Git Bash** o la terminal y configura tu nombre y correo:

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu-email@example.com"
```

Para verificar la configuración:

```bash
git config --list
```

![1739226224139](image/readme/1739226224139.png)

---

### **4️⃣ Generar y añadir tu clave SSH a GitHub (opcional, pero recomendado)**

1. Genera una clave SSH escribiendo en Git Bash:

   ```bash
   ssh-keygen -t rsa -b 4096 -C "tu-email@example.com"
   ```

   Presiona **Enter** en todas las opciones para aceptar los valores por defecto.
2. Copia tu clave pública con:

   ```bash
   cat ~/.ssh/id_rsa.pub
   ```
3. Ve a **GitHub > Settings > SSH and GPG keys** y añade la clave copiada.

---

### **5️⃣ Iniciar sesión en GitHub desde Git**

Si usas HTTPS, debes autenticarte con tu cuenta de GitHub:

```bash
git credential-manager-core configure
```

Para probar la conexión:

```bash
ssh -T git@github.com
```

Si ves un mensaje de bienvenida, la configuración fue exitosa.

---

### **6️⃣ Clonar un repositorio de GitHub (prueba de funcionamiento)**

Para probar que Git está funcionando con GitHub, clona un repositorio de prueba:

```bash
git clone https://github.com/usuario/repositorio.git
```

Reemplaza `"usuario/repositorio.git"` por uno real.

Con esto, Git está instalado y listo para usar con GitHub en Windows.
