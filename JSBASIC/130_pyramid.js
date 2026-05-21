// 130	130_pyramid.js	Print a centered pyramid star pattern using nested loops.

let n = 5;
console.log("Pyramid pattern:");
for (let i = 1; i <= n; i++) {
    let row = " ".repeat(n - i);
    for (let j = 1; j <= (2 * i - 1); j++) {
        row += "*";
    }
    console.log(row);
}
