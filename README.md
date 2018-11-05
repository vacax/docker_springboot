# Proyecto Demo Docker con Spring boot

El proyecto copia el jar creado por la tarea de Gradler al Contenedor.
Para ejecutar utilice los siguientes comandos:

1) docker build -t nombre-imagen .
2) sudo docker run --name borrame-docker-springboot -d -p 5000:8080 nombre-imagen

Luego pueden acceder a la url [http://localhost:5000](http://localhost:5000)