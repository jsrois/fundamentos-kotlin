# Introducción

Kotlin es un lenguaje de programación moderno que se ha vuelto muy popular en los últimos años. Fue creado por JetBrains en 2011 y fue diseñado para ser interoperable con Java. Kotlin tiene muchas ventajas sobre Java, incluyendo una sintaxis más concisa y una mayor seguridad en tiempo de ejecución.

### Variables y valores

Como cualquier otro lenguaje de programación, Kotlin nos permite definir
variables para registrar valores de diferentes tipos:

```kotlin
var name = "Ana"
```

Cuando asignamos un valor concreto a una variable, podemos utilizar esta variable para operar con ella
y su valor será utilizado en cada caso:

```kotlin
"Buenos días, $name!"
"$name está aprendiendo a programar en Kotlin."
```

En el ejemplo anterior, `$` nos permite _interpolar strings_.

<div class="hint">
  Busca "interpolación de Strings con Kotlin" en Google para entender mejor cómo funciona este mecanismo.
</div>


Como hemos almacenado el nombre en una variable, si quisiéramos modificar 
el nombre en todas las frases, únicamente tendríamos que cambiar el valor
de `name` (por ejemplo, `name = "María"`), y nos ahorramos el trabajo de
cambiar cada frase manualmente.


### Colecciones en Kotlin: Arrays

En Kotlin podemos agrupar una colección de valores en una estructura
tipo array, lista, etc, igual que en otros lenguajes:

```kotlin
    val carBrands = arrayOf("Opel", "Volkswagen", "Seat", "Ferrari", "Volvo")
```

Una vez que tenemos los valores en dentro de la colección, podemos trabajar con ellos,
en este caso utilizando los _métodos_ que proporciona la estructura `Array` en Kotlin.

```kotlin
    println(carBrands.first())
    println(carBrands.last())
    println(carBrands.filter { car -> car.startsWith("Vo") })
```

En el ejemplo anterior, `first`, `last` y `filter` son métodos que nos permiten trabajar
con colecciones. Investiga el significado de estos métodos y qué utilidad nos proporcionan.










