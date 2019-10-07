/**
     * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

    Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

    For example, given the array  there are  elements, two positive, two negative and one zero. Their ratios would be ,  and . It should be printed as 

        Data sets: -4 3 -9 0 4 1 

        Process.
            a. Get the length of the array and store in var len
            b. create three vars named positive, negative and zeros.
            c. loop through each of the numbers and do your checks.
    */

const arr = [-4, 3, -9, 0, 4, 1]

function plusMinus(a) {
    let length = a.length;

    let positive = 0, negative = 0, zeros = 0;

    // Loop through each element
    for(let num of a) {
        if (num == 0) {
            zeros++
        } else if (num < 0) {
            negative++
        } else if (num > 0) {
            positive++
        }
    }

    console.log(parseFloat(positive/length).toPrecision(4))
    console.log(parseFloat(negative/length).toPrecision(4))
    console.log(parseFloat(zeros/length).toPrecision(4))
}

plusMinus(arr)