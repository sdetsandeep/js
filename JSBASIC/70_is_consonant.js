// 70	70_is_consonant.js	Check whether a given character is a consonant.

let ch = 'b';
let vowels = "aeiouAEIOU";
console.log("Character:", ch);
if (ch.match(/[a-zA-Z]/) && !vowels.includes(ch)) {
    console.log(ch, "is a Consonant.");
} else {
    console.log(ch, "is NOT a Consonant.");
}
