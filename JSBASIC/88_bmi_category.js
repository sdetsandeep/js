// 88	88_bmi_category.js	Determine BMI category: Underweight / Normal / Overweight / Obese.

let weight = 70; // kg
let height = 1.75; // meters
let bmi = weight / (height * height);
console.log("Weight:", weight, "kg | Height:", height, "m");
console.log("BMI:", bmi.toFixed(2));
if (bmi < 18.5) {
    console.log("Category: Underweight");
} else if (bmi < 25) {
    console.log("Category: Normal");
} else if (bmi < 30) {
    console.log("Category: Overweight");
} else {
    console.log("Category: Obese");
}
