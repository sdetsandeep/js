// 169	169_insert_element.js	Insert an element at a given position in an array using splice().

let arr = [10, 20, 40, 50];
let position = 2;
let element = 30;
console.log("Original:", arr);
arr.splice(position, 0, element);
console.log("After inserting", element, "at index", position + ":", arr);
