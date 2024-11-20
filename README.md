# demo_onboarding_santander_java
Proyecto realizado como muestra de lo que sería un onboarding para alguien del Santander. La aplicación incluye:

- Un sistema de login.
- Un llamado a una API externa llamada RandomUser que devuelve información de personas aleatorias.
- Un endpoint que devuelve una lista de tareas pendientes de realizar.

Se utiliza inyección de dependencias (Spring) y SLF4J para el logueo, además de una base de datos MySQL.

La aplicación se comunica con un frontend desarrollado en React, que se encuentra en el siguiente repositorio: https://github.com/EzequielHuayta/demo_onboarding_react
La aplicación desarrollada en Kotlin es: https://github.com/EzequielHuayta/demo_onboarding_santander_kotlin

## Base de datos
```sql
INSERT INTO santander.dds_tareas
(id, descripcion, fecha_fin)
VALUES(1, 'Ver video introduccion', '2023-12-31 00:00:00');
INSERT INTO santander.dds_tareas
(id, descripcion, fecha_fin)
VALUES(2, 'Leer pdf Parte 1: Introduccion al Santander', '2024-01-15 00:00:00');


INSERT INTO santander.dds_usuarios
(id, apellido, contrasenia, legajo, nombre)
VALUES(1, 'Gonzalez', '123', 'O123', 'Maria');
INSERT INTO santander.dds_usuarios
(id, apellido, contrasenia, legajo, nombre)
VALUES(2, 'Dorrego', '12', 'O12', 'Franco');

INSERT INTO santander.tarea_detalle
(finalizado, tarea_id, usuario_id)
VALUES(0, 1, 1);
INSERT INTO santander.tarea_detalle
(finalizado, tarea_id, usuario_id)
VALUES(1, 1, 2);
INSERT INTO santander.tarea_detalle
(finalizado, tarea_id, usuario_id)
VALUES(0, 2, 2);