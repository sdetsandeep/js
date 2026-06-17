

let students = [

    {
        name: "Sandeep",
        age: 42,
        city: "Saharanpur"
    },
       {
        name: "Arjun",
        age: 22,
        city: "Nanka"
    },

    {
        name: "Ankut",
        age: 34,
        city: "Rajasthan"
    }

];

let count = 1;

for (let st of students)
{
    console.log("Detail of " + count + " Student");

    console.log("Student Name : " + st.name);
    console.log("Student Age  : " + st.age);
    console.log("Student City : " + st.city);

    console.log("==================================");

    count++;
}