// 117	117_largest_digit.js	Find the largest digit in a given number.

let num = 39271;
let largest = 0;
let temp = num;
while (temp > 0) {
    let digit = temp % 10;
    if (digit > largest) largest = digit;
    temp = Math.floor(temp / 10);
}
console.log("Number:", num);
console.log("Largest digit:", largest);
