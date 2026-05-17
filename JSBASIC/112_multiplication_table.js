// 112	112_multiplication_table.js	Print the multiplication table of a given number up to 10.

let num = 7;
console.log("Multiplication Table of", num + ":");
for (let i = 1; i <= 10; i++) {
    console.log(num + " x " + i + " = " + (num * i));
}
