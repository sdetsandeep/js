// 78	78_electricity_bill.js	Calculate electricity bill based on units consumed using slabs.

let units = 350;
let bill = 0;
console.log("Units consumed:", units);
if (units <= 100) {
    bill = units * 1.5;
} else if (units <= 200) {
    bill = 100 * 1.5 + (units - 100) * 2.5;
} else if (units <= 500) {
    bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
} else {
    bill = 100 * 1.5 + 100 * 2.5 + 300 * 4.0 + (units - 500) * 6.0;
}
console.log("Electricity Bill: ₹" + bill.toFixed(2));
