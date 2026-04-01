// 183	183_sum_negative.js	Calculate the sum of only negative numbers in an array.

let arr = [5, -3, 8, -1, 12, -7, 4];
let sum = 0;
for (let i = 0; i < arr.length; i++) {
    if (arr[i] < 0) sum += arr[i];
}
console.log("Array:", arr);
console.log("Sum of negative numbers:", sum);
