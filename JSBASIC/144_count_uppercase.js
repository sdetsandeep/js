// 144	144_count_uppercase.js	Count the number of uppercase letters in a given string.

let str = "Hello World JS";
let count = 0;
for (let i = 0; i < str.length; i++) {
    if (str[i] >= 'A' && str[i] <= 'Z') count++;
}
console.log("String:", str);
console.log("Uppercase letters:", count);
