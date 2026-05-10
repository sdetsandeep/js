// 79	79_valid_triangle.js	Check whether a triangle is valid given its three sides.

let a = 5, b = 7, c = 10;
console.log("Sides:", a, b, c);
if (a + b > c && b + c > a && a + c > b) {
    console.log("Valid Triangle.");
} else {
    console.log("NOT a Valid Triangle.");
}
