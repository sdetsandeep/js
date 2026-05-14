// 91	91_day_of_week.js	Display the day name (Monday–Sunday) based on a number (1–7) using switch.

let day = 3;
console.log("Day number:", day);
switch (day) {
    case 1: console.log("Monday"); break;
    case 2: console.log("Tuesday"); break;
    case 3: console.log("Wednesday"); break;
    case 4: console.log("Thursday"); break;
    case 5: console.log("Friday"); break;
    case 6: console.log("Saturday"); break;
    case 7: console.log("Sunday"); break;
    default: console.log("Invalid day number. Enter 1-7.");
}
