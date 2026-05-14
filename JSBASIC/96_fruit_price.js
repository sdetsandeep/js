// 96	96_fruit_price.js	Display the price of a fruit using switch case on fruit name.

let fruit = "mango";
console.log("Fruit:", fruit);
switch (fruit.toLowerCase()) {
    case "apple":  console.log("Price: ₹80/kg"); break;
    case "mango":  console.log("Price: ₹60/kg"); break;
    case "banana": console.log("Price: ₹40/dozen"); break;
    case "grapes": console.log("Price: ₹90/kg"); break;
    case "orange": console.log("Price: ₹50/kg"); break;
    default: console.log("Fruit not found in price list.");
}
