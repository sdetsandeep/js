// 120	120_armstrong_num.js	Check whether a number is an Armstrong number (e.g. 153 = 1³+5³+3³).

let num = 153;
let temp = num;
let digits = num.toString().length;
let sum = 0;
while (temp > 0) {
    let digit = temp % 10;
    sum += Math.pow(digit, digits);
    temp = Math.floor(temp / 10);
}
console.log("Number:", num);
if (sum === num) {
    console.log(num, "is an Armstrong number.");
} else {
    console.log(num, "is NOT an Armstrong number.");
}
