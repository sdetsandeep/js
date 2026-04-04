// 200	200_cumulative_sum.js	Find the cumulative sum array where each element is sum of all previous.

let arr = [1, 2, 3, 4, 5];
let cumulative = [];
let sum = 0;
for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
    cumulative.push(sum);
}
console.log("Original:", arr);
console.log("Cumulative sum:", cumulative);
