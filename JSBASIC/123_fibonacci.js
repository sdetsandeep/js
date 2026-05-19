// 123	123_fibonacci.js	Generate and print the Fibonacci series up to n terms.

let n = 10;
let a = 0, b = 1;
console.log("Fibonacci series up to", n, "terms:");
for (let i = 1; i <= n; i++) {
    process.stdout.write(a + " ");
    let next = a + b;
    a = b;
    b = next;
}
console.log();
