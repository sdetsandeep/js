let hindi, english, math;

console.log("HI Users... Please proceed to complete operation...");

const prompt = require("prompt-sync")();

hindi = Number(prompt("Enter Marks in Hindi: "));
english = Number(prompt("Enter Marks in English: "));
math = Number(prompt("Enter Marks in Math: "));

console.log("Marks in Hindi =", hindi);
console.log("Marks in English =", english);
console.log("Marks in Math =", math);


let per= (hindi+english+math)/3;

console.log (" ============================================================ ");
 
console.log (" Your Percentage is  ..... "+ per);


if(per<35)
{
    console.log(" You Are Failed........ Please try again....");

    console.log (" ============================================================ ");
}
else if (per>=35 && per<45)
{
     console.log(" You 3rd Division ... .");
     console.log (" ============================================================ ");
}
else if (per>=45 && per<60)
{
     console.log(" You got  2nd Division......");
     console.log (" ============================================================ ");
}

else if (per>=60 )
{
     if( per>=75)
     {
        console.log(" You got Ist Division with Distinctions.. Honor ..");
        console.log (" ============================================================ ");
     }

     else 
     {
        console.log(" You got  Ist  Division......");
        console.log (" ============================================================ ");
     }
    
    
}