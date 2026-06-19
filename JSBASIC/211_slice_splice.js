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

// Splice() Method 
console.log ("====================Splice () Method =====================================");
