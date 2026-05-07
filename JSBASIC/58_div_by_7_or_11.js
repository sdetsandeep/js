// 58	58_div_by_7_or_11.js	Check if a number is divisible by either 7 or 11.

let num = 77;
console.log("Number:", num);
if (num % 7 === 0 || num % 11 === 0) {
    console.log(num, "is divisible by 7 or 11.");
} else {
    console.log(num, "is NOT divisible by 7 or 11.");
}
