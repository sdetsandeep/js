// 94	94_grade_switch.js	Display grade (A/B/C/D/F) using switch case on marks range.

let marks = 82;
console.log("Marks:", marks);
let grade = Math.floor(marks / 10);
switch (true) {
    case (marks >= 90): console.log("Grade: A"); break;
    case (marks >= 75): console.log("Grade: B"); break;
    case (marks >= 60): console.log("Grade: C"); break;
    case (marks >= 40): console.log("Grade: D"); break;
    default: console.log("Grade: F");
}
