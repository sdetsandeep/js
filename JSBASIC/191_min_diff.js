// 191	191_min_diff.js	Find the minimum difference between any two elements in an array.

let arr = [1, 5, 3, 19, 18, 25];
arr.sort((a, b) => a - b);
let minDiff = Infinity;
for (let i = 0; i < arr.length - 1; i++) {
    let diff = arr[i + 1] - arr[i];
    if (diff < minDiff) minDiff = diff;
}
console.log("Array:", arr);
console.log("Minimum difference:", minDiff);
