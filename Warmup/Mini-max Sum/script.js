/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example, . Our minimum sum is  and our maximum sum is . We would print

16 24
Function Description

Compvare the miniMaxSum function in the editor below. It should print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
Hints: Beware of integer overflow! Use 64-bit Integer.

Need help to get started? Try the Solve Me First problem

    Algorithm
        1. 
 */

const arr = [501893267, 649027153, 379408215, 452968170, 487530619];

function s(b) {
    var sum = 0
    for(var cnt = 0; cnt < b.length; cnt++) {
        sum += b[cnt]
    }

    return sum
}


function miniMaxSum(a) {

    var min = 0, max = 0
    var numbers = []

    for (var cnt = 0; cnt < a.length; cnt++) {
        var temp = a.slice()
        var sum; temp[cnt] = 0;
        sum = s(temp)
        numbers[cnt] = sum
    }

    for(var cnt = 0; cnt < numbers.length; cnt++) {
        var temp
        if (cnt == numbers.length-1) {
            temp = numbers[cnt]
            if (min > temp) {
                min = temp
            }
        } else {
            temp = numbers[cnt]
            if (temp > numbers[cnt+1]) {
                min = numbers[cnt+1]
            }
        }
    }

    for(var cnt = 0; cnt < numbers.length; cnt++) {
        var temp
        if (cnt == numbers.length-1) {
            temp = numbers[cnt]
            if (max < temp) {
                max = temp
            }
        } else {
            temp = numbers[cnt]
            if (max < temp) {
                max = temp  
            }
        }
    }

    console.log(parseFloat(min) + ' ' + parseFloat(max))

}

miniMaxSum(arr)