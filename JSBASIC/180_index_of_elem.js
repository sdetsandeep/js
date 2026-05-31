// 180	180_index_of_elem.js	Find the index of a specific element in an array using indexOf().

let arr = [15, 30, 45, 60, 75];
let elem = 45;
let index = arr.indexOf(elem);
console.log("Array:", arr);
console.log("Searching for:", elem);
console.log("Index:", index !== -1 ? index : "Not found");
