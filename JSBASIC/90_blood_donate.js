// 90	90_blood_donate.js	Determine whether a person can donate blood based on age and weight.

let age = 22;
let weight = 55; // kg
console.log("Age:", age, "| Weight:", weight, "kg");
if (age >= 18 && age <= 65 && weight >= 50) {
    console.log("Eligible to donate blood.");
} else {
    console.log("NOT eligible to donate blood.");
}
