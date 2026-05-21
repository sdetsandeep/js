// 128	128_right_triangle.js	Print a right-angled triangle star pattern using nested loops.

let n = 5;
console.log("Right-angled triangle pattern:");
for (let i = 1; i <= n; i++) {
    let row = "";
    for (let j = 1; j <= i; j++) {
        row += "* ";
    }
    console.log(row);
}
