// 101	101_num_to_weekday.js	Convert a number (1–7) to its corresponding weekday name.

let num = 4;
console.log("Day number:", num);
switch (num) {
    case 1: console.log("Weekday: Monday"); break;
    case 2: console.log("Weekday: Tuesday"); break;
    case 3: console.log("Weekday: Wednesday"); break;
    case 4: console.log("Weekday: Thursday"); break;
    case 5: console.log("Weekday: Friday"); break;
    case 6: console.log("Weekday: Saturday"); break;
    case 7: console.log("Weekday: Sunday"); break;
    default: console.log("Invalid number. Enter 1 to 7.");
}
