// 115	115_sum_digits.js	Find the sum of all digits of a given number.

let num = 4567;
let sum = 0;
let temp = num;
while (temp > 0) {
    sum += temp % 10;
    temp = Math.floor(temp / 10);
}
console.log("Number:", num);
console.log("Sum of digits:", sum);
