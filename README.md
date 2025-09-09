# Universidad del Norte Santo Tomás de Aquino
**Facultad de Ingeniería**  
**Materia:** Programación 2

---

## Trabajo Práctico N°7 – Excepciones en Java

**Alumno:** Alfredo Ezequiel Zárate  
📧 [zaratealfredo6998@gmail.com](mailto:zaratealfredo6998@gmail.com)  
🌐 [github.com/ezzquielx](https://github.com/ezzquielx)

---

## Descripción del Proyecto
Este repositorio contiene las aplicaciones desarrolladas como parte del **Trabajo Práctico N°7** en la materia **Programación 2**, centradas en las Exceptions en Java.  
El desarrollo y pruebas del proyecto se realizaron utilizando el entorno de desarrollo integrado (IDE) **IntelliJ IDEA**.

---

### Ejercicios Incluidos

#### **Ejercicio [1] – Validador de Contraseña**
- **Descripción:**  Crear un programa que valide una contraseña según ciertas
  reglas y maneje los errores con excepciones:
  * El programa debe tener una excepción personalizada
  * Se debe controlar si la cadena que forma la contraseña es vacía o null. Se puede usar
  una Exception de Java
  * Se debe controlar que la cadena ingresada tenga mas de 8 caracteres, si la misma tiene
  menos se debe mostrar un mensaje especifico
  * La contraseña debe tener al menos un número.

#### **Ejercicio [2] – Gestor de Calificaciones**
- **Descripción:**  Crear un sistema que valide las calificaciones de un estudiante y
  utilice excepciones para indicar errores:
  * Las calificaciones deben ser del tipo numérico y deben ir desde 0 a 10
  * Si el valor de la calificación es menor que 0 o mayor que 10 el sistema debe mostrar al
      usuario que ingreso un valor inválido.

#### **Ejercicio [3] – Administrador de Reservas de Cine**
- **Descripción:** Simular un sistema de reservas de asientos de cine y
  manejar una excepción cuando un asiento ya está ocupado:
  * Se debe tener una entidad que conozca el asiento y si el mismo esta ocupado o no.
  * El sistema debe verificar que el asiento sea un asiento válido. 
  * Si un asiento está ocupado el sistema debe informar al usuario
  * No se pueden vender mas asientos que la capacidad que tiene tiene la Sala de Cine. El
  sistema debe validar esta regla de negocio.