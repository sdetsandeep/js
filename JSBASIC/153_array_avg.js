// 153	153_array_avg.js	Find the average of all elements in a given array.

let arr = [10, 20, 30, 40, 50];
let sum = 0;
for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
}
let avg = sum / arr.length;
console.log("Array:", arr);
console.log("Average:", avg);
