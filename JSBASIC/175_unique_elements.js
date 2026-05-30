// 175	175_unique_elements.js	Find elements that appear only in one of two given arrays.

let arr1 = [1, 2, 3, 4, 5];
let arr2 = [3, 4, 5, 6, 7];
let onlyInArr1 = arr1.filter(x => !arr2.includes(x));
let onlyInArr2 = arr2.filter(x => !arr1.includes(x));
console.log("Array 1:", arr1);
console.log("Array 2:", arr2);
console.log("Only in Array 1:", onlyInArr1);
console.log("Only in Array 2:", onlyInArr2);
