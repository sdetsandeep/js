// 129	129_inverted_triangle.js	Print an inverted right-triangle star pattern using nested loops.

let n = 5;
console.log("Inverted right-triangle pattern:");
for (let i = n; i >= 1; i--) {
    let row = "";
    for (let j = 1; j <= i; j++) {
        row += "* ";
    }
    console.log(row);
}
