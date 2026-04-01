// 187	187_reverse_no_method.js	Reverse an array without using the built-in reverse() method.

let arr = [1, 2, 3, 4, 5];
let reversed = [];
for (let i = arr.length - 1; i >= 0; i--) {
    reversed.push(arr[i]);
}
console.log("Original:", arr);
console.log("Reversed:", reversed);
