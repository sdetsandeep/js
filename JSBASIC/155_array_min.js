// 155	155_array_min.js	Find the smallest element in an array without using Math.min().

let arr = [3, 17, 8, 45, 22, 9];
let min = arr[0];
for (let i = 1; i < arr.length; i++) {
    if (arr[i] < min) min = arr[i];
}
console.log("Array:", arr);
console.log("Smallest element:", min);
