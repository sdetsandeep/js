// 145	145_count_lowercase.js	Count the number of lowercase letters in a given string.

let str = "Hello World JS";
let count = 0;
for (let i = 0; i < str.length; i++) {
    if (str[i] >= 'a' && str[i] <= 'z') count++;
}
console.log("String:", str);
console.log("Lowercase letters:", count);
