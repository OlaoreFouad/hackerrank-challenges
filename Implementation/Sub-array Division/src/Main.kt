import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    val outcomeList = mutableListOf<Array<Int>>()

    s.forEachIndexed { index, _ ->
        val amountOfElementsLeft = s.size - (index)
//        println("Size: ${s.size} - Index: $index = (${s.size - (index + 1)})")
        if (amountOfElementsLeft >= m || s.size == m) {
            outcomeList.add(getNumbersFromIndex(s, index, m))
        }
    }

    var count = 0
    outcomeList.forEach {
        if (it.sum() == d) {
            count++
        }
    }

    return count

}

private fun getNumbersFromIndex(array: Array<Int>, startIndex: Int, amount: Int): Array<Int> {
    return array.sliceArray(startIndex..(startIndex + amount-1))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
