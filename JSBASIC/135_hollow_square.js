// 135	135_hollow_square.js	Print a hollow square border pattern of stars using nested loops.

let n = 5;
console.log("Hollow square pattern:");
for (let i = 1; i <= n; i++) {
    let row = "";
    for (let j = 1; j <= n; j++) {
        if (i === 1 || i === n || j === 1 || j === n) {
            row += "* ";
        } else {
            row += "  ";
        }
    }
    console.log(row);
}
