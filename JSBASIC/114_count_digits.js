// 114	114_count_digits.js	Count the number of digits in a given number.

let num = 948321;
let count = 0;
let temp = num;
while (temp > 0) {
    count++;
    temp = Math.floor(temp / 10);
}
console.log("Number:", num);
console.log("Number of digits:", count);
