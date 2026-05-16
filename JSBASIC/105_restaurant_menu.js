// 105	105_restaurant_menu.js	Create a restaurant menu system — show item and price using switch.

let item = 3;
console.log("=== Restaurant Menu ===");
console.log("1. Butter Chicken  - ₹220");
console.log("2. Paneer Tikka    - ₹180");
console.log("3. Dal Makhani     - ₹150");
console.log("4. Biryani         - ₹260");
console.log("5. Gulab Jamun     - ₹80");
console.log("=======================");
console.log("Your choice:", item);
switch (item) {
    case 1: console.log("You ordered: Butter Chicken - ₹220"); break;
    case 2: console.log("You ordered: Paneer Tikka - ₹180"); break;
    case 3: console.log("You ordered: Dal Makhani - ₹150"); break;
    case 4: console.log("You ordered: Biryani - ₹260"); break;
    case 5: console.log("You ordered: Gulab Jamun - ₹80"); break;
    default: console.log("Invalid choice.");
}
