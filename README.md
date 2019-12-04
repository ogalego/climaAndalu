# Practica 3 - Aprendizaje Automático
**1.- Elegir el problema.** *La predicción de resultados de partidos en la ATP o en la WTA de tenis, una liga deportiva, una competición de deporte electrónico, o cualquier otro problema del que se dispongan de datos suficientes como para aplicar algoritmos de aprendizaje automático.*

En nuestro caso hemos optado por el clima en Andalucia para aplicar algoritmos de aprendizaje. 

**2. Identificar la fuente de datos.** *Es necesario disponer de una serie de
datos históricos que sirvan para que el sistema aprenda.*

Nuestra fuente de datos la hemos obtenido en la pagina web de la junta de Andalucia.

**3. Identificar las características relevantes de los hechos.** *Por ejemplo, en
la predicción del resultado de un encuentro de tenis, algunas características importantes pueden ser la posición en el ranking de cada jugador,la superficie en que se juega, la edad de cada jugador, etc*


Las características que hemos tenido en cuenta, ya que nos parecían muy releventas son:

~~~
1. COD_EST: Código de la estacion metereologica.
2. FECHA: Fecha de los datos del registro
3. T_MAX: Temperatura maxima(ºC).
4. T_MED: Temperatura media(ºC).
5. T_MIN: Temperatura minima(ºC).
6. H_R_MAX: Humedad relativa máxima(%).
7. H_R_MED: Humedad relativa media(%).
8. H_R_MIN: Humedad relativa mínima(%).
9. RADIACION: Radiación media (w*h/m2)
10. LLUVIA: Lluvia total (mm).
11. V_MAX: Velocidad del viento máxima(Km/h)
12. V_MED: Velocidad del viento media(Km/h)
13. V_MIN: velocidad del viento minima (Km/h).
14. CV1: Minutos con direccion de viento en el primer cuadrante.
15. CV2: Minutos con direccion de viento en el segundo cuadrante.
16. CV3: Minutos con direccion de viento en el tercer cuadrante.
17. CV4: Minutos con direccion de viento en el cuarto cuadrante.
18. DIRECCION: Direccion dominante del viento.
19. HORAS:
20. H_T:
21. H_HR:
22. H_R:
23. H_LL:
24. H_TS:
25. H_V:
26. H_D:
27. CALCULOS:
28. MTMEN0:
29. MTMEN7:
30. MTMA30:
31. MTMA50:
~~~
**4. Obtener un fichero .arff con los hechos codificados de acuerdo con las características anteriormente elegidas.** Este fichero servirá como entrada para la herramienta Weka2.

Con los datos obtenidos hemos limpiados las cabeceras y añadido los siguientes datos para que sea compatible con el Weka.
<p align="center">
  <img src="/img/arff.png" title="arffFormat" align="center">
</p>

**5. Evaluar distintos algoritmos de aprendizaje automático con los datos obtenidos.** Este paso se llevará a cabo con la herramienta Weka, y tendrá como salida el algoritmo con mejor rendimiento para los datos datos.
Hemos evaluado los datos con los distintos algoritmos:
- NaiveBayes
- J48
- RandomForest
- RandomTree

### NaiveBayes: Correctly clasified 87.7234%
<p align="center">
  <img src="/img/Bayes.png" title="NaiveBayes" align="center">
</p>

### J48: 
<p align="center">
  <img src="/img/J48.png" title="J48" align="center">
</p>

### RandomForest
<p align="center">
  <img src="/img/RandomForest.png" title="NaiveBayes" align="center">
</p>

### RandomTree
<p align="center">
  <img src="/img/RandomTree.png" title="NaiveBayes" align="center">
</p>







