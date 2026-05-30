// 176	176_missing_number.js	Find the missing number in an array containing 1 to n with one gap.

let arr = [1, 2, 3, 5, 6];
let n = arr.length + 1;
let expectedSum = (n * (n + 1)) / 2;
let actualSum = arr.reduce((a, b) => a + b, 0);
console.log("Array:", arr);
console.log("Missing number:", expectedSum - actualSum);
