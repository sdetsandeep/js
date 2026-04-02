// 192	192_max_product.js	Find the maximum product of any two elements in an array.

let arr = [1, 10, 2, 6, 5, 3];
arr.sort((a, b) => b - a);
let maxProduct = arr[0] * arr[1];
console.log("Array:", arr);
console.log("Maximum product of two elements:", maxProduct);
