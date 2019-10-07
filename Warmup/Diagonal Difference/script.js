const arr = [
    [11, 2, 4],
    [4, 5, 6],
    [10, 8, -12]
]

var difference = 0

function getDiagonalDifference(a) {

    console.log(a.toString())

    var length = a.length
    let p_diagonal = 0, s_diagonal = 0

    for(let i = 0; i < length; i++) {
        for(let j = 0; j < length; j++) {
            if (j == i) {
                p_diagonal += a[i][j]
            } 
        }
    }
    console.log('p_diagonal: ' + p_diagonal)

    for(let i = 0; i < length; i++) {
        for(let j = 0; j < length; j++) {
            if (i == length-j-1) {
                s_diagonal += a[i][j]
            } 
        }
    }
    console.log('s_diagonal: ' + s_diagonal)

    difference = p_diagonal - s_diagonal
    return Math.abs(difference)
}

console.log(getDiagonalDifference(arr))