// 69	69_is_vowel.js	Check whether a given character is a vowel (a, e, i, o, u).

let ch = 'e';
let vowels = "aeiouAEIOU";
console.log("Character:", ch);
if (vowels.includes(ch)) {
    console.log(ch, "is a Vowel.");
} else {
    console.log(ch, "is NOT a Vowel.");
}
