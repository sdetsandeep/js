// 111	111_factorial.js	Find the factorial of a given number using a loop.

let num = 6;
let factorial = 1;
for (let i = 1; i <= num; i++) {
    factorial *= i;
}
console.log("Number:", num);
console.log("Factorial:", factorial);
