let customers, info;

async function init(){
  // Ensure Lesson_51_DBserver replit is running!
  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8500.app.github.dev"; //replace with your Dev URL
  let route= "/customers";

  info = await fetch(link+route);
  customers = await info.json();

  generateCards(customers);
  console.log(customers);
}

function generateCards(customers){
  let centerpanel = document.getElementById("mainpanel");
  let build ="";

  for(let i=0; i<customers.length; i++){
    let customer = customers[i];
    build += `<div class="card" >`
    build +=   `<h3> Employee ID: ${customer.CustomerId}</h3>`;
    build +=   `<div> First Name: ${customer.FirstName}</div>`;
    build +=   `<div> Last Name: ${customer.LastName}</div>`;
    build +=   `<p> Country: ${customer.Country}</p>`; 
    build += `<p> EMAIL: ${customer.Email}`   
    build +=   `<img src = "${customer.Country}.PNG">`
    build +=   `<hr>`;
    build += `</div>`;
  }
  console.log(`# of customers found: ${customers.length}`);
  centerpanel.innerHTML = build; 
}

function filterByCity(){
  let country = document.getElementById("Country").value;
  console.log(country);

  let newCustomers = []; //create empty array

  for(let i=0; i<customers.length;i++){
    let customer= customers[i] //get each employee

    if( customer.Country == Country) {
          //append to list
          newEmployees.push(employee);
       }
  }
  console.log(`# of employees found: ${newCustomers.length}`);
  // Task 4: Generate the cards with your new array.
  generateCards(newCustomers);  
}