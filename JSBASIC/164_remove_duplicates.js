// 164	164_remove_duplicates.js	Remove duplicate elements from an array using Set or loops.

let arr = [1, 2, 2, 3, 4, 4, 5, 1];
let unique = [...new Set(arr)];
console.log("Original:", arr);
console.log("Without duplicates:", unique);
