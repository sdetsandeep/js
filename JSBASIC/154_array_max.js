// 154	154_array_max.js	Find the largest element in an array without using Math.max().

let arr = [3, 17, 8, 45, 22, 9];
let max = arr[0];
for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) max = arr[i];
}
console.log("Array:", arr);
console.log("Largest element:", max);
