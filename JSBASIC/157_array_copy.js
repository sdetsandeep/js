// 157	157_array_copy.js	Copy one array into another array.

let original = [10, 20, 30, 40, 50];
let copy = [...original];
console.log("Original:", original);
console.log("Copied array:", copy);
copy[0] = 99;
console.log("After modifying copy, original unchanged:", original);
