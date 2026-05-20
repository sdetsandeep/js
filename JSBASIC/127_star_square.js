// 127	127_star_square.js	Print a square star pattern of n×n size using nested loops.

let n = 5;
console.log("Square star pattern (" + n + "x" + n + "):");
for (let i = 1; i <= n; i++) {
    let row = "";
    for (let j = 1; j <= n; j++) {
        row += "* ";
    }
    console.log(row);
}
