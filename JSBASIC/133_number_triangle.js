// 133	133_number_triangle.js	Print a right-triangle pattern filled with row numbers.

let n = 5;
console.log("Number triangle pattern:");
for (let i = 1; i <= n; i++) {
    let row = "";
    for (let j = 1; j <= i; j++) {
        row += i + " ";
    }
    console.log(row);
}
