// 103	103_subject_code.js	Display subject name based on a subject code using switch.

let code = "CS101";
console.log("Subject Code:", code);
switch (code) {
    case "CS101": console.log("Subject: Introduction to Computer Science"); break;
    case "MA101": console.log("Subject: Mathematics I"); break;
    case "PH101": console.log("Subject: Physics I"); break;
    case "EN101": console.log("Subject: English Communication"); break;
    case "CH101": console.log("Subject: Chemistry I"); break;
    default:       console.log("Subject not found.");
}
