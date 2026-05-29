// 168	168_rotate_right.js	Rotate an array to the right by one position.

let arr = [1, 2, 3, 4, 5];
console.log("Original:", arr);
let last = arr.pop();
arr.unshift(last);
console.log("Rotated right:", arr);
