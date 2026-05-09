// 71	71_is_alphabet.js	Check whether a given character is an alphabet letter.

let ch = 'G';
console.log("Character:", ch);
if (ch.match(/[a-zA-Z]/)) {
    console.log(ch, "is an Alphabet.");
} else {
    console.log(ch, "is NOT an Alphabet.");
}
