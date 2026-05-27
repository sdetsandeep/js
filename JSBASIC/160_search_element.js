// 160	160_search_element.js	Search for a specific element in an array and print its index.

let arr = [10, 30, 50, 70, 90];
let target = 50;
let index = arr.indexOf(target);
console.log("Array:", arr);
console.log("Searching for:", target);
if (index !== -1) {
    console.log("Found at index:", index);
} else {
    console.log("Element not found.");
}
