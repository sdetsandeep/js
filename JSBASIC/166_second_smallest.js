// 166	166_second_smallest.js	Find the second smallest element in an array.

let arr = [12, 35, 1, 10, 34, 1];
let sorted = [...new Set(arr)].sort((a, b) => a - b);
console.log("Array:", arr);
console.log("Second smallest:", sorted[1]);
