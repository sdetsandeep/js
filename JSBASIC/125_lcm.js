// 125	125_lcm.js	Find the LCM (Least Common Multiple) of two numbers using a loop.

let a = 12, b = 18;
let x = a, y = b;
while (y !== 0) { let t = y; y = x % y; x = t; }
let gcd = x;
let lcm = (a * b) / gcd;
console.log("Numbers:", a, "and", b);
console.log("LCM:", lcm);
