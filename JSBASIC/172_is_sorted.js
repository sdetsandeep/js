// 172	172_is_sorted.js	Check whether a given array is sorted in ascending order.

let arr = [1, 3, 5, 7, 9];
let isSorted = true;
for (let i = 0; i < arr.length - 1; i++) {
    if (arr[i] > arr[i + 1]) { isSorted = false; break; }
}
console.log("Array:", arr);
console.log("Is sorted ascending:", isSorted);
