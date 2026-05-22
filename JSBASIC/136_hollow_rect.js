// 136	136_hollow_rect.js	Print a hollow rectangle border pattern of given width and height.

let width = 7, height = 4;
console.log("Hollow rectangle (" + width + "x" + height + "):");
for (let i = 1; i <= height; i++) {
    let row = "";
    for (let j = 1; j <= width; j++) {
        if (i === 1 || i === height || j === 1 || j === width) {
            row += "* ";
        } else {
            row += "  ";
        }
    }
    console.log(row);
}
