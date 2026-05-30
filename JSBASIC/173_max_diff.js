// 173	173_max_diff.js	Find the maximum difference between any two elements in an array.

let arr = [2, 7, 3, 10, 1, 8];
let max = arr[0], min = arr[0];
for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) max = arr[i];
    if (arr[i] < min) min = arr[i];
}
console.log("Array:", arr);
console.log("Maximum difference:", max - min);
