// 197	197_count_specific.js	Count how many times a specific value appears in an array.

let arr = [1, 3, 3, 5, 3, 7, 3];
let val = 3;
let count = 0;
for (let i = 0; i < arr.length; i++) {
    if (arr[i] === val) count++;
}
console.log("Array:", arr);
console.log("Value", val, "appears", count, "times.");
