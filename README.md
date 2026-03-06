# 💱 Conversor de Monedas - Alura Challenge

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GSON](https://img.shields.io/badge/Gson-2.11.0-blue?style=for-the-badge)

## 📌 Descripción del Proyecto
Este proyecto es una aplicación de consola desarrollada en Java que permite realizar conversiones de divisas en tiempo real. Utiliza una API externa para obtener las tasas de cambio más actualizadas, procesando la información mediante la librería **Gson** para ofrecer una experiencia precisa y eficiente.

## 🛠️ Funcionalidades
* **Consulta de Tasas en Tiempo Real:** Conexión con *ExchangeRate-API* para obtener valores vigentes.
* **Mapeo de Datos:** Transformación de respuestas JSON a objetos Java mediante el uso de clases y records.
* **Interfaz Interactiva:** Menú de usuario por consola para seleccionar diversas monedas.
* **Historial de Consultas:** Registro de las conversiones realizadas durante la ejecución del programa.

## 🚀 Tecnologías Utilizadas
* **Java 17:** Uso de las últimas funcionalidades del lenguaje como Records y HttpClient.
* **Gson:** Biblioteca de Google para la conversión entre objetos Java y archivos JSON.
* **HttpClient:** Para realizar peticiones asíncronas a la API de tasas de cambio...

## 🔑 Configuración e Instalación
1. Obtén una API Key gratuita en [ExchangeRate-API](https://www.exchangerate-api.com/).
2. Clona el repositorio en tu máquina local.
3. Importa el proyecto en IntelliJ IDEA.
4. Asegúrate de que la librería `gson-2.13.2.jar` esté agregada correctamente en las dependencias del proyecto.
5. Crea un archivo `config.properties` en el paquete `resources` del proyecto.
6. Añadie tu clave API dentro de `config.properties`. Pega tu clave con el siguiente formato:
```apiKey =Tu clave gratuita de ExchangeRate-API```
7. Ejecuta la clase `Principal.java`.

## 📂 Estructura del Proyecto
* `com.alura.conversor.modelos`: Clases de datos como `Tasas` e `Historial`.
* `com.alura.conversor.servicios`: Lógica para el consumo de la API y procesamiento de conversiones.
* `com.alura.conversor.main`: Punto de entrada de la aplicación (`Principal`).

---
### 👤 Desarrollado por:
<br>

**Adrian Delgado** <br>*Participante del programa Oracle Next Education (ONE) en alianza con Alura Latam.*

<br>

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/adriandlg-m)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/TU_USUARIO_LINKEDIN)
