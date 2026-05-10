// 80	80_triangle_type.js	Determine the type of triangle: equilateral, isosceles, or scalene.

let a = 5, b = 5, c = 8;
console.log("Sides:", a, b, c);
if (a === b && b === c) {
    console.log("Equilateral Triangle.");
} else if (a === b || b === c || a === c) {
    console.log("Isosceles Triangle.");
} else {
    console.log("Scalene Triangle.");
}
