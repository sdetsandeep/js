// 165	165_second_largest.js	Find the second largest element in an array.

let arr = [12, 35, 1, 10, 34, 1];
let sorted = [...new Set(arr)].sort((a, b) => b - a);
console.log("Array:", arr);
console.log("Second largest:", sorted[1]);
