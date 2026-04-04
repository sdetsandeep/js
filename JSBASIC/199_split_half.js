// 199	199_split_half.js	Split an array into two equal halves and print both.

let arr = [1, 2, 3, 4, 5, 6];
let mid = Math.floor(arr.length / 2);
let firstHalf = arr.slice(0, mid);
let secondHalf = arr.slice(mid);
console.log("Original:", arr);
console.log("First half:", firstHalf);
console.log("Second half:", secondHalf);
