// 67	67_smallest_three.js	Find the smallest among three numbers using if-else if ladder.

let a = 12, b = 45, c = 30;
console.log("a =", a, "| b =", b, "| c =", c);
if (a <= b && a <= c) {
    console.log("Smallest:", a);
} else if (b <= a && b <= c) {
    console.log("Smallest:", b);
} else {
    console.log("Smallest:", c);
}
