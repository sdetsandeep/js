// 138	138_count_vowels.js	Count the number of vowels in a given string using a loop.

let str = "Hello World";
let count = 0;
let vowels = "aeiouAEIOU";
for (let i = 0; i < str.length; i++) {
    if (vowels.includes(str[i])) count++;
}
console.log("String:", str);
console.log("Number of vowels:", count);
