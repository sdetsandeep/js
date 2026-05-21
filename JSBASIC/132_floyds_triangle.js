// 132	132_floyds_triangle.js	Print Floyd's triangle with sequential numbers using nested loops.

let n = 5, num = 1;
console.log("Floyd's Triangle:");
for (let i = 1; i <= n; i++) {
    let row = "";
    for (let j = 1; j <= i; j++) {
        row += num++ + " ";
    }
    console.log(row);
}
