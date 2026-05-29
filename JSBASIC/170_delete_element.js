// 170	170_delete_element.js	Delete an element from a given position in an array using splice().

let arr = [10, 20, 30, 40, 50];
let position = 2;
console.log("Original:", arr);
let removed = arr.splice(position, 1);
console.log("Removed element:", removed[0]);
console.log("After deletion:", arr);
