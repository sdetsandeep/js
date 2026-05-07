// 59	59_compare_ages.js	Compare ages of two people and print who is older.

let age1 = 25;
let age2 = 30;
let name1 = "Alice";
let name2 = "Bob";
console.log(name1 + "'s age:", age1, "|", name2 + "'s age:", age2);
if (age1 > age2) {
    console.log(name1, "is older.");
} else if (age2 > age1) {
    console.log(name2, "is older.");
} else {
    console.log("Both are the same age.");
}
