// 139	139_count_consonants.js	Count the number of consonants in a given string using a loop.

let str = "Hello World";
let count = 0;
let vowels = "aeiouAEIOU";
for (let i = 0; i < str.length; i++) {
    let ch = str[i];
    if (ch.match(/[a-zA-Z]/) && !vowels.includes(ch)) count++;
}
console.log("String:", str);
console.log("Number of consonants:", count);
