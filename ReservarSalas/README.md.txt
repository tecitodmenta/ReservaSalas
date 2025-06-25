===========
README.md
===========

# 🎯 Sistema de Reserva de Salas (Consola Java)

## 🧩 Descripción General

Este sistema permite gestionar reservas de distintos tipos de salas (Reunión, Auditorio, Taller) a través de una interfaz de consola. El usuario puede añadir extras como proyector y aire acondicionado, y visualizar el historial de reservas. Además, recibe notificaciones automáticas al realizar una reserva.

## 🛠️ Tecnologías
- Java Standard (JDK 8 o superior)
- Proyecto estructurado en paquetes (NetBeans compatible)
- Consola / Terminal

## 🧱 Estructura del Proyecto
ReservaSalas/
├── src/
│   ├── command/
│   ├── decorator/
│   ├── factory/
│   ├── observer/
│   └── Main.java
└── README.md

## 🔧 Instrucciones de Compilación y Ejecución

Opción 1: Desde NetBeans
1. Crear nuevo proyecto Java.
2. Crear paquetes: factory, decorator, observer, command.
3. Agregar clases correspondientes.
4. Ejecutar Main.java.

Opción 2: Desde consola
1. Navegar a src/
2. Compilar:
   javac */*.java *.java
3. Ejecutar:
   java Main

## 🧠 Patrones de Diseño Aplicados

1. 🔨 Factory Method (Creacional)
   - Crear tipos de salas.

2. 🎁 Decorator (Estructural)
   - Añadir extras a reservas.

3. 📣 Observer (Comportamiento)
   - Notificar al usuario.

4. 🎮 Command (Libre elección)
   - Acciones del menú encapsuladas.

## 📷 Ejemplo simulado

=== Sistema de Reserva de Salas ===
1. Hacer reserva
2. Ver historial
3. Salir
Seleccione una opción: 1
Tipo de sala (reunion/auditorio/taller): reunion
¿Agregar proyector? (s/n): s
¿Agregar aire acondicionado? (s/n): n
✅ Reserva confirmada: Sala de Reunión - Reserva básica + Proyector ($25000)
🔔 Notificación para Fernando: Tu reserva fue procesada correctamente.

## 👤 Autor
Fernando Gutiérrez  
Profesor: Giovanni Cáceres  
Asignatura: Patrones de Diseño


