// 167	167_rotate_left.js	Rotate an array to the left by one position.

let arr = [1, 2, 3, 4, 5];
console.log("Original:", arr);
let first = arr.shift();
arr.push(first);
console.log("Rotated left:", arr);
