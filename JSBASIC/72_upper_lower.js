// 72	72_upper_lower.js	Check whether a character is uppercase or lowercase.

let ch = 'A';
console.log("Character:", ch);
if (ch >= 'A' && ch <= 'Z') {
    console.log(ch, "is Uppercase.");
} else if (ch >= 'a' && ch <= 'z') {
    console.log(ch, "is Lowercase.");
} else {
    console.log(ch, "is not an alphabet.");
}
