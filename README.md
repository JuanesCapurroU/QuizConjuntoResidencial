# QuizConjuntoResidencial


# POST
http://localhost:8080/api/propietarios
http://localhost:8080/api/zonas-sociales
http://localhost:8080/api/parqueadero-reserva
http://localhost:8080/api/visitantes
http://localhost:8080/api/reservas-zona

# GET

1. Mostrar las reservas de la zona social que ha hecho un propietario
   http://localhost:8080/api/reservas-zona/por-propietario/{idPropietario}
2. Listar el propietario con los visitantes que ha tenido
   http://localhost:8080/api/visitantes/propietario/{idPropietario}
3. Listar  cuales son los parqueaderos que tiene asignado un propietario
    http://localhost:8080/api/parqueadero-reserva/propietario/{idPropietario}
4. Mostrar reservas de zona por fecha http://localhost:8080/api/reservas-zona/por-fecha



