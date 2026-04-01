// 186	186_flatten_array.js	Flatten a nested array into a single-level array using flat() or recursion.

let nested = [1, [2, 3], [4, [5, 6]], 7];
let flatArr = nested.flat(Infinity);
console.log("Nested array:", JSON.stringify(nested));
console.log("Flattened:", flatArr);
