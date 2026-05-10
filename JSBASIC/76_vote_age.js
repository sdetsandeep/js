// 76	76_vote_age.js	Check voting eligibility based on age using if-else.

let age = 16;
console.log("Age:", age);
if (age >= 18) {
    console.log("You are eligible to vote.");
} else {
    console.log("You are NOT eligible to vote. Come back in", 18 - age, "year(s).");
}
