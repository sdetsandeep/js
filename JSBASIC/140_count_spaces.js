// 140	140_count_spaces.js	Count the number of spaces in a given sentence using a loop.

let str = "JavaScript is fun to learn";
let count = 0;
for (let i = 0; i < str.length; i++) {
    if (str[i] === " ") count++;
}
console.log("String:", str);
console.log("Number of spaces:", count);
