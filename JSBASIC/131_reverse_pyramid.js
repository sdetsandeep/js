// 131	131_reverse_pyramid.js	Print a reverse (inverted) centered pyramid pattern using loops.

let n = 5;
console.log("Reverse pyramid pattern:");
for (let i = n; i >= 1; i--) {
    let row = " ".repeat(n - i);
    for (let j = 1; j <= (2 * i - 1); j++) {
        row += "*";
    }
    console.log(row);
}
