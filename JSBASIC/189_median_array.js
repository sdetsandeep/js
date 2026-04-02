// 189	189_median_array.js	Find the median value of a sorted array.

let arr = [3, 7, 2, 9, 5];
arr.sort((a, b) => a - b);
let mid = Math.floor(arr.length / 2);
let median = arr.length % 2 !== 0 ? arr[mid] : (arr[mid - 1] + arr[mid]) / 2;
console.log("Sorted array:", arr);
console.log("Median:", median);
