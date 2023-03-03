# Exercicío 1 - Teste unitário com Junit.
> Você encontra os testes em 'app/src/test/java/com/exemple/testunitario' e as classes em 'app/src/main/java/com/exemple/testUnitario'

## Questão 1
 Como caso de teste nessa questão, validei três tipos de casos, sendo 3 deles caminhos felizes, pensando em lista com números inteiros positivos, negativos e zero. Alem disso, como caso de excessao, validei casos com a lista sem números.

- Classe: AverageCalculation

```
package com.example.testeunitrio

class AverageCalculation {
    fun average(list: List<Int>): Int {
        return if (list.isEmpty()) {
            0
        } else {
            var sum = 0
            list.forEach { number ->
                sum += number
            }

            sum / list.size
        }
    }
}
```

- Teste: AverageCalculationTest
```
package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test


class AverageCalculationTest {
    // Calculando a média aritmética com 3 casos, sendo eles todos números positivos, todos números negativos
    // e todos os números com valor zero.

    @Test
    fun testSuccessAverageCalculation() {
        val list1: List<Int> = listOf(5,5,20)
        val list2: List<Int> = listOf(-5,-5,-20)
        val list3: List<Int> = listOf(0,0,0)

        Assert.assertEquals(10, AverageCalculation().average(list1))
        Assert.assertEquals(-10, AverageCalculation().average(list2))
        Assert.assertEquals(0, AverageCalculation().average(list3))
    }

    // Testando uma excessão, caso envie uma lista com números vazios, ele retorna o valor de zero.

    @Test
    fun testFailedAverageCalculation() {
        val list1: List<Int> = listOf()

        Assert.assertEquals(0, AverageCalculation().average(list1))
    }
}
```

<td />

## Questão 2
 Como forma de validar essa questao, utilizei 2 tipos de listas ordenadas, vizando números inteiros positivos e outra negativos e para casos de listas nã
o ordenadas, números inteiros positivos e negativos.

. Classe: OrdenationList

```
package com.example.testeunitrio

class OrdinationList {
    fun isOrdinationList(list: List<Int>): Boolean {
        val sort = list.sortedBy { it }

        if (sort != list) {
            return false
        }

        return true
    }
}
```

. Test: OrdenationListTest
```
package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class OrdinationListTest {
    @Test
    fun testIsOrdinationList() {
        val list1: List<Int> = listOf(1,2,3,4,5)
        val list2: List<Int> = listOf(-5,-4,-3,-2,-1)

        Assert.assertTrue(OrdinationList().isOrdinationList(list1))
        Assert.assertTrue(OrdinationList().isOrdinationList(list2))
    }

    @Test
    fun testIsNotOrdinationList() {
        val list1: List<Int> = listOf(2,4,3,2,1)
        val list2: List<Int> = listOf(-1,-2,-3,-4,-5)

        Assert.assertFalse(OrdinationList().isOrdinationList(list1))
        Assert.assertFalse(OrdinationList().isOrdinationList(list2))
    }
}
```


## Questão 3
 Como forma de validar essa questao, utilizei dois tipos de lógica, sendo a primeira com números positivos e a segunda com números negativos 

. Classe: FatorialCalculation

```
package com.example.testeunitrio

class FatorialCalculation {

    fun fatorial(number: Int): Long {
        if(number < 0.0) {
            return 0
        }

        if(number == 0) {
            return 1
        }

        var factorialNumber: Long = 1

        for (i in 1..number) {
            factorialNumber *= i.toLong()

            if(i == number) {
                return factorialNumber
            }
        }

        return 0
    }
}
```

. Test: FatorialCalculationTest
```
package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class FatorialCalculationTest {

    @Test
    fun testFatorialCalculation() {
        val number1 = 5
        val number2 = 1

        Assert.assertEquals(120, FatorialCalculation().fatorial(number1))
        Assert.assertEquals(1, FatorialCalculation().fatorial(number2))
    }

    @Test
    fun testExceptionFatorialCalculation() {
        val number1 = -5
        val number2 = 0

        Assert.assertEquals(0, FatorialCalculation().fatorial(number1))
        Assert.assertEquals(1, FatorialCalculation().fatorial(number2))
    }
}
```

## Questão 4
Para testar , fiquei meio perdido em como trabalhar com "Caminhos nao felizes". Dessa forma, usei intervalos de números menores para números menores de temperatura.

. Classe: TemperatureConverter

```
package com.example.testeunitrio

class TemperatureConverter {
    fun converterToFahrenheit(degreesCelsius: Int): Int {
        return (degreesCelsius * 9/5) + 32
    }
}
```

. Test: TemperatureConverterTest
```
package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class TemperatureConverterTest {
    @Test
    fun testSuccessConverterToFahrenheit() {
        val Celsius1 = 0
        val Celsius2 = 10
        val Celsius3 = -10
        val Celsius4 = 1000

        Assert.assertEquals(32, TemperatureConverter().converterToFahrenheit(Celsius1))
        Assert.assertEquals(50, TemperatureConverter().converterToFahrenheit(Celsius2))
        Assert.assertEquals(14, TemperatureConverter().converterToFahrenheit(Celsius3))
        Assert.assertEquals(1832, TemperatureConverter().converterToFahrenheit(Celsius4))
    }
}
```

## Questão 5
Para testar, fiz dois tipos de testes, sendo um conjunto com números primos e o "caminho não feliz" com números que não são primos.

. Classe: CalculateNumberTypes

```
package com.example.testeunitrio

class CalculateNumberTypes {
    fun isCousinNumber(number: Int): Boolean {
        if(number <= 1) return false

        if (number % 2 == 0 && number != 2) {
            return false
        }

        return true
    }
}
```

. Test: CalculateNumberTypesTest
```
package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class CalculateNumberTypesTest {
    @Test
    fun testSuccessCousinNumber() {
        val number1 = 2
        val number2 = 97

        Assert.assertTrue(CalculateNumberTypes().isCousinNumber(number1))
        Assert.assertTrue(CalculateNumberTypes().isCousinNumber(number2))
    }

    @Test
    fun testFailureCousinNumber() {
        val number1 = 76
        val number2 = -76

        Assert.assertFalse(CalculateNumberTypes().isCousinNumber(number1))
        Assert.assertFalse(CalculateNumberTypes().isCousinNumber(number2))
    }
}
```

## Questão 6
 Como forma de validar essa questao, utilizei 2 tipos de listas ordenadas, vizando números inteiros positivos e outra negativos e para casos de listas nã
o ordenadas, números inteiros positivos e negativos.

. Classe: OrdenationList

```
fun listaOrdenada(lista: List<Int>): Boolean {
        if (lista.size < 2) {
            return true
        }
        val crescente = lista.zipWithNext().all { (atual, proximo) -> atual <= proximo }
        val decrescente = lista.zipWithNext().all { (atual, proximo) -> atual >= proximo }
        return crescente || decrescente
    }
```

. Test: OrdenationListTest
```
package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

    @Test
    fun testSuccessListaOrdenada() {
        val list1: List<Int> = listOf(1,2,3,4,5)
        val list2: List<Int> = listOf(-5,-4,-3,-2,-1)

        Assert.assertTrue(OrdinationList().listaOrdenada(list1))
        Assert.assertTrue(OrdinationList().listaOrdenada(list2))
    }

    @Test
    fun testFailedListaOrdenada() {
        val list1: List<Int> = listOf(2,4,3,2,1)
        val list2: List<Int> = listOf(-1,-2,-3,-4,-5)

        Assert.assertFalse(OrdinationList().listaOrdenada(list1))
        Assert.assertFalse(OrdinationList().listaOrdenada(list2))
    }
```
