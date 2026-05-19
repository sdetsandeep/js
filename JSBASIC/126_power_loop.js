// 126	126_power_loop.js	Calculate the power of a number using a loop (without ** operator).

let base = 3, exponent = 4;
let result = 1;
for (let i = 1; i <= exponent; i++) {
    result *= base;
}
console.log("Base:", base, "| Exponent:", exponent);
console.log("Result:", result);
