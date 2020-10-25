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

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {

    var breakLowestCount = 0
    var breakHighestCount = 0

    var lowest = scores[0]
    var highest = scores[0]

    scores.forEach { num ->
        if (num < lowest) {
            breakLowestCount++
            lowest = num
        } else if (num > highest) {
            breakHighestCount++
            highest = num
        }
    }

    return arrayOf(breakHighestCount, breakLowestCount)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
