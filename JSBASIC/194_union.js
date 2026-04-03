// 194	194_union.js	Find the union of two arrays (all unique elements from both).

let arr1 = [1, 2, 3, 4];
let arr2 = [3, 4, 5, 6];
let union = [...new Set([...arr1, ...arr2])];
console.log("Array 1:", arr1);
console.log("Array 2:", arr2);
console.log("Union:", union);
