# Practica 3 - Aprendizaje Automatico
**1.- Elegir el problema.** *La predicción de resultados de partidos en la ATP o en la WTA de tenis, una liga deportiva, una competición de deporte electrónico, o cualquier otro problema del que se dispongan de datos suficientes como para aplicar algoritmos de aprendizaje automático.*

En nuestro caso hemos optado por el clima en Andalucia para aplicar algoritmos de aprendizaje. 

**2. Identificar la fuente de datos.** *Es necesario disponer de una serie de
datos históricos que sirvan para que el sistema aprenda.*

Nuestra fuente de datos la hemos obtenido en la pagina web de la junta de Andalucia.

**3. Identificar las características relevantes de los hechos.** *Por ejemplo, en
la predicción del resultado de un encuentro de tenis, algunas características importantes pueden ser la posición en el ranking de cada jugador,la superficie en que se juega, la edad de cada jugador, etc*

Las características que hemos tenido en cuenta, ya que nos parecían muy releventas son:
> 1. COD_EST: Código de la estacion metereologica.
> 2. FECHA: Fecha de los datos del registro
> 3. T_MAX: Temperatura maxima(ºC).
> 4. T_MED: Temperatura media(ºC).
> 5. T_MIN: Temperatura minima(ºC).
> 6. H_R_MAX: Humedad relativa máxima(%).
> 7. H_R_MED: Humedad relativa media(%).
> 8. H_R_MIN: Humedad relativa mínima(%).
> 9. RADIACION: Radiación media (w*h/m2)
> 10. LLUVIA: Lluvia total (mm).
> 11. V_MAX: Velocidad del viento máxima(Km/h)
> 12. V_MED: Velocidad del viento media(Km/h)
> 13. V_MIN: velocidad del viento minima (Km/h).
> 14. CV1: Minutos con direccion de viento en el primer cuadrante.
> 15. CV2: Minutos con direccion de viento en el segundo cuadrante.
> 16. CV3: Minutos con direccion de viento en el tercer cuadrante.
> 17. CV4: Minutos con direccion de viento en el cuarto cuadrante.
> 18. DIRECCION: Direccion dominante del viento.

**4. Obtener un fichero .arff con los hechos codificados de acuerdo con las características anteriormente elegidas.** Este fichero servirá como entrada para la herramienta Weka2.



