
/*
==============================================================================
                           STUDENT RESULT PROGRAM
==============================================================================

RULES OF RESULT CALCULATION

1. PASS:
   - All subjects have marks >= 35
   - Percentage >= 35

2. FAIL:
   - Percentage < 35

3. GRACE PASS:
   - Only ONE subject is below 35
   - Deficiency is maximum 3 marks
     (i.e. marks are 32, 33, or 34)
   - Percentage >= 35

   Example:
   Hindi   = 34
   English = 45
   Math    = 50

   Percentage > 35
   Hindi is short by only 1 mark

   Result = PASSED WITH GRACE

4. BACK:
   - Only ONE subject is below 35
   - Percentage >= 35
   - Subject marks are less than 32
     (31, 30, 29 ....)

   Example:
   Hindi   = 28
   English = 60
   Math    = 55

   Result = BACK IN HINDI

5. DIVISION

   35 - 44.99  => Third Division
   45 - 59.99  => Second Division
   60 - 74.99  => First Division
   75+         => First Division with Distinction

==============================================================================
*/

let hindi, english, math;

console.log("\n==============================================================");
console.log("      STUDENT RESULT PROCESSING SYSTEM");
console.log("==============================================================");
console.log("HI Users... Please proceed to complete operation...");
console.log("==============================================================\n");

const prompt = require("prompt-sync")();

hindi = Number(prompt("Enter Marks in Hindi   : "));
english = Number(prompt("Enter Marks in English : "));
math = Number(prompt("Enter Marks in Math    : "));

console.log("\n==============================================================");
console.log("                     MARKS DETAILS");
console.log("==============================================================");

console.log("Marks in Hindi   =", hindi);
console.log("Marks in English =", english);
console.log("Marks in Math    =", math);

let total = hindi + english + math;
let per = total / 3;

console.log("--------------------------------------------------------------");
console.log("Total Marks      =", total);
console.log("Percentage       =", per.toFixed(2) + "%");
console.log("==============================================================");

/* Count failed subjects */

let failedSubjects = [];

if (hindi < 35) failedSubjects.push("Hindi");
if (english < 35) failedSubjects.push("English");
if (math < 35) failedSubjects.push("Math");

/* Main Result Logic */

if (per < 35) {

    console.log("\nRESULT STATUS : FAILED");
    console.log("Reason : Overall Percentage is below 35%");
}

else if (failedSubjects.length === 0) {

    console.log("\nRESULT STATUS : PASSED");

    if (per >= 75) {
        console.log("Division : First Division with Distinction");
    }
    else if (per >= 60) {
        console.log("Division : First Division");
    }
    else if (per >= 45) {
        console.log("Division : Second Division");
    }
    else {
        console.log("Division : Third Division");
    }
}

else if (failedSubjects.length === 1) {

    let failedSubject = failedSubjects[0];
    let marks;

    if (failedSubject === "Hindi")
        marks = hindi;
    else if (failedSubject === "English")
        marks = english;
    else
        marks = math;

    let shortage = 35 - marks;

    if (shortage <= 3) {

        console.log("\nRESULT STATUS : PASSED WITH GRACE");
        console.log("Grace Marks Awarded :", shortage);
        console.log("Subject :", failedSubject);

    } else {

        console.log("\nRESULT STATUS : BACK");
        console.log("Back Subject :", failedSubject);
        console.log("Student must re-appear in this subject.");

    }

}

else {

    console.log("\nRESULT STATUS : FAILED");
    console.log("Reason : More than one subject below passing marks.");

}

console.log("\n==============================================================");
console.log("             RESULT PROCESS COMPLETED");
console.log("==============================================================");