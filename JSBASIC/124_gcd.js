// 124	124_gcd.js	Find the GCD (Greatest Common Divisor) of two numbers using a loop.

let a = 48, b = 18;
let x = a, y = b;
while (y !== 0) {
    let temp = y;
    y = x % y;
    x = temp;
}
console.log("Numbers:", a, "and", b);
console.log("GCD:", x);
