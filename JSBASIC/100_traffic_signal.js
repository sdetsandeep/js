// 100	100_traffic_signal.js	Display the action (Stop/Ready/Go) for a traffic signal color using switch.

let color = "green";
console.log("Traffic Signal Color:", color);
switch (color.toLowerCase()) {
    case "red":    console.log("Action: STOP"); break;
    case "yellow": console.log("Action: READY / GET SET"); break;
    case "green":  console.log("Action: GO"); break;
    default:       console.log("Invalid signal color.");
}
