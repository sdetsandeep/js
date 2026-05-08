// 66	66_largest_three.js	Find the largest among three numbers using if-else if ladder.

let a = 12, b = 45, c = 30;
console.log("a =", a, "| b =", b, "| c =", c);
if (a >= b && a >= c) {
    console.log("Largest:", a);
} else if (b >= a && b >= c) {
    console.log("Largest:", b);
} else {
    console.log("Largest:", c);
}
