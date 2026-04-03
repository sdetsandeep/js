// 196	196_zeros_to_end.js	Move all zeros in an array to the end while keeping other order intact.

let arr = [1, 0, 3, 0, 5, 0, 7];
let nonZeros = arr.filter(x => x !== 0);
let zeros = arr.filter(x => x === 0);
let result = [...nonZeros, ...zeros];
console.log("Original:", arr);
console.log("Zeros moved to end:", result);
