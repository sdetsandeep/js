// 95	95_season_month.js	Display season (Summer/Monsoon/Winter) based on month using switch.

let month = 6;
console.log("Month:", month);
switch (month) {
    case 3: case 4: case 5:
        console.log("Season: Summer"); break;
    case 6: case 7: case 8: case 9:
        console.log("Season: Monsoon"); break;
    case 10: case 11: case 12: case 1: case 2:
        console.log("Season: Winter"); break;
    default:
        console.log("Invalid month.");
}
