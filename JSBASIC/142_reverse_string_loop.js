// 142	142_reverse_string_loop.js	Reverse a given string using a loop (without built-in reverse).

let str = "Hello";
let reversed = "";
for (let i = str.length - 1; i >= 0; i--) {
    reversed += str[i];
}
console.log("Original:", str);
console.log("Reversed:", reversed);
