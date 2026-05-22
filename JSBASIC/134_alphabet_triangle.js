// 134	134_alphabet_triangle.js	Print a right-triangle pattern filled with alphabets (A, B, C...).

let n = 5;
console.log("Alphabet triangle pattern:");
for (let i = 1; i <= n; i++) {
    let row = "";
    for (let j = 0; j < i; j++) {
        row += String.fromCharCode(65 + j) + " ";
    }
    console.log(row);
}
