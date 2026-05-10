// 77	77_income_tax.js	Calculate income tax based on given salary slabs.

let salary = 750000;
let tax = 0;
console.log("Salary: ₹" + salary);
if (salary <= 250000) {
    tax = 0;
} else if (salary <= 500000) {
    tax = (salary - 250000) * 0.05;
} else if (salary <= 1000000) {
    tax = 12500 + (salary - 500000) * 0.20;
} else {
    tax = 112500 + (salary - 1000000) * 0.30;
}
console.log("Income Tax: ₹" + tax);
