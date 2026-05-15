// 98	98_atm_menu.js	Create an ATM menu (Balance/Withdraw/Deposit/Exit) using switch.

let option = 2;
let balance = 15000;
let amount = 3000;
console.log("--- ATM Menu ---");
console.log("1. Check Balance");
console.log("2. Withdraw");
console.log("3. Deposit");
console.log("4. Exit");
console.log("Selected:", option);
switch (option) {
    case 1:
        console.log("Your balance is: ₹" + balance);
        break;
    case 2:
        if (amount <= balance) {
            balance -= amount;
            console.log("₹" + amount + " withdrawn. Remaining balance: ₹" + balance);
        } else {
            console.log("Insufficient balance.");
        }
        break;
    case 3:
        balance += amount;
        console.log("₹" + amount + " deposited. New balance: ₹" + balance);
        break;
    case 4:
        console.log("Thank you for using ATM. Goodbye!");
        break;
    default:
        console.log("Invalid option.");
}
