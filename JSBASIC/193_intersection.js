// 193	193_intersection.js	Find the intersection of two arrays (common elements, no duplicates).

let arr1 = [1, 2, 2, 3, 4];
let arr2 = [2, 3, 3, 5];
let intersection = [...new Set(arr1)].filter(x => new Set(arr2).has(x));
console.log("Array 1:", arr1);
console.log("Array 2:", arr2);
console.log("Intersection:", intersection);
