// 116	116_product_digits.js	Find the product of all digits of a given number.

let num = 234;
let product = 1;
let temp = num;
while (temp > 0) {
    product *= temp % 10;
    temp = Math.floor(temp / 10);
}
console.log("Number:", num);
console.log("Product of digits:", product);
