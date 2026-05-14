// 97	97_menu_display.js	Display a menu and print selected option details using switch.

let choice = 2;
console.log("--- Restaurant Menu ---");
console.log("1. Burger  - ₹120");
console.log("2. Pizza   - ₹250");
console.log("3. Pasta   - ₹180");
console.log("4. Sandwich- ₹90");
console.log("-----------------------");
console.log("Selected Option:", choice);
switch (choice) {
    case 1: console.log("You selected: Burger - ₹120"); break;
    case 2: console.log("You selected: Pizza - ₹250"); break;
    case 3: console.log("You selected: Pasta - ₹180"); break;
    case 4: console.log("You selected: Sandwich - ₹90"); break;
    default: console.log("Invalid choice. Please select 1-4.");
}
