// 198	198_equal_arrays.js	Check if two arrays are equal (same elements in same order).

let arr1 = [1, 2, 3, 4, 5];
let arr2 = [1, 2, 3, 4, 5];
let isEqual = arr1.length === arr2.length && arr1.every((v, i) => v === arr2[i]);
console.log("Array 1:", arr1);
console.log("Array 2:", arr2);
console.log("Are equal:", isEqual);
