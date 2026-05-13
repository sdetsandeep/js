// 89	89_perfect_square.js	Check if a number is a perfect square using Math.sqrt().

let num = 49;
let sqrt = Math.sqrt(num);
console.log("Number:", num);
if (sqrt === Math.floor(sqrt)) {
    console.log(num, "is a Perfect Square. Square root =", sqrt);
} else {
    console.log(num, "is NOT a Perfect Square.");
}
