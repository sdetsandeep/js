/* JavaScript में slice() और splice() दोनों Array पर काम करते हैं, लेकिन इनके काम अलग हैं।

Method	Original Array बदलता है?	उपयोग
slice()	❌ नहीं	Array का हिस्सा कॉपी करना
splice()	✅ हाँ	Array में जोड़ना, हटाना, बदलना */


// Slice Method  .....


console.log ("====================Splice () Method =====================================");

let fruits = ["Apple", "Banana", "Mango", "Orange", "Grapes"];

console.log("Original Array Before slice():");
console.log(fruits);

let result = fruits.slice(1, 4);

console.log("\nResult Returned By slice():");
console.log(result);

console.log("\nOriginal Array After slice():");
console.log(fruits);

// Splice() Method          .. Remove Element
console.log ("====================Splice () Method =====================================");

let arr = [10, 20, 30, 40, 50];

console.log("Before slice:", arr);

let slicedArr = arr.slice(1, 4);

console.log("Slice Result:", slicedArr);

console.log("After slice:", arr);

console.log("\n====================\n");

console.log("Before splice:", arr);

let deletedArr = arr.splice(1, 2);

console.log("Deleted Elements:", deletedArr);

console.log("After splice:", arr);
