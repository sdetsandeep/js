// 68	68_leap_year.js	Check whether a given year is a leap year or not.

let year = 2024;
console.log("Year:", year);
if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
    console.log(year, "is a Leap Year.");
} else {
    console.log(year, "is NOT a Leap Year.");
}
