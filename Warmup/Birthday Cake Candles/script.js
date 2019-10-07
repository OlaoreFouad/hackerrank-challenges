/**
 *  Aim: Getting the amount of the tallest candles.
 * 
 * Procedure:
 *  1. 
*/

const candles = [3, 2, 1, 3]

function birthdayCakeCandles(arr) {
    let maximum = arr[0]
    let occurence = 0;
    for (let cnt = 0; cnt < arr.length; cnt++) {
        if (maximum < arr[cnt]) {
            maximum = arr[cnt]
        }
    }
    
    for (const element of arr) {
        if (maximum ==  element) {
            occurence++;
        }
    }

    return occurence
}

birthdayCakeCandles(candles)