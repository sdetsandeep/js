// 146	146_ascii_values.js	Print the ASCII (char code) value of each character in a string.

let str = "Hello";
console.log("String:", str);
for (let i = 0; i < str.length; i++) {
    console.log("'" + str[i] + "' => " + str.charCodeAt(i));
}
