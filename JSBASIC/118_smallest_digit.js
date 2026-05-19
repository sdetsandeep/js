// 118	118_smallest_digit.js	Find the smallest digit in a given number.

let num = 39271;
let smallest = 9;
let temp = num;
while (temp > 0) {
    let digit = temp % 10;
    if (digit < smallest) smallest = digit;
    temp = Math.floor(temp / 10);
}
console.log("Number:", num);
console.log("Smallest digit:", smallest);
