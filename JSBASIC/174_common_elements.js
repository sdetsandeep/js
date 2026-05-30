// 174	174_common_elements.js	Find common elements between two arrays (intersection).

let arr1 = [1, 2, 3, 4, 5];
let arr2 = [3, 4, 5, 6, 7];
let common = arr1.filter(x => arr2.includes(x));
console.log("Array 1:", arr1);
console.log("Array 2:", arr2);
console.log("Common elements:", common);
