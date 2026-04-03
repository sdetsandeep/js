// 195	195_remove_occurrences.js	Remove all occurrences of a given value from an array.

let arr = [1, 2, 3, 2, 4, 2, 5];
let val = 2;
let result = arr.filter(x => x !== val);
console.log("Original:", arr);
console.log("After removing all " + val + "'s:", result);
