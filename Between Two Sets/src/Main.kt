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

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val startNumber = a[a.size - 1]
    val endNumber = b[0]

    if (startNumber >= endNumber) {
        return 0
    }

    val consideredNumbers = (startNumber..endNumber).toList() as MutableList<Int>
    val actualNumbers = mutableListOf<Int>()

    for (i in consideredNumbers) {
        var considered = false
        for (j in a) {
            considered = i % j == 0
            if (!considered) {
                if (actualNumbers.contains(i)) {
                    actualNumbers.remove(i)
                }
                break
            } else if (!actualNumbers.contains(i)) {
                actualNumbers.add(i)
            }
        }
    }

    val finalNumbers = mutableListOf<Int>()
    finalNumbers.addAll(actualNumbers)

    for (l in actualNumbers) {
        var finalised: Boolean
        for (k in b) {
            finalised = k % l == 0
            if (!finalised) {
                finalNumbers.remove(l)
                break
            }
        }
    }

    return finalNumbers.size

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
