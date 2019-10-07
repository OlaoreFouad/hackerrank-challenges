/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 */

 var s = '06:40:03AM'
 var unit = ''

 function timeConversion() {
    
    unit = s.substring(s.length-2, s.length).toLowerCase()
    s = s.substring(0, s.length-2); let nodes = s.split(':')

    let time = {
        hours: parseInt(nodes[0]),
        mins: parseInt(nodes[1]),
        secs: parseInt(nodes[2])
    }

    let military = getMilitary(time)

    let arr = [
        military.hours < 10 ? '0'+military.hours : military.hours.toString(),
        military.mins < 10 ? '0'+military.mins : military.mins.toString(),
        military.secs < 10 ? '0'+military.secs : military.secs.toString()
    ]
    console.log(arr)

    arr = arr.join(':')
    console.log(arr)

 }

 function getMilitary(time) {
    if (unit == 'pm') {
        if (time.hours == 0) {
            time.hours = 12
        } else if (time.hours == 0) {
            time.hours = 12
        }
    } 
    else if (unit == 'am') {
        if (time.hours == 12) {
            time.hours -= 12
        }
    }
    return time
 }

 timeConversion()