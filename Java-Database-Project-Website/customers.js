let customers, info;

async function init(){
  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8552.app.github.dev"; //replace with your Dev URL
  let route= "/customers";

  info = await fetch(link+route);
  customers = await info.json();

  generateCards(customers);
}

function generateCards(customers){
  let centerpanel = document.getElementById("centerpanel");
  centerpanel.innerHTML = "";
  let count = document.getElementById("count");
  let cardCount = 0;
  let front ="";
  let back = ""
  for(let i=0; i<customers.length; i++){
    let customer = customers[i];
    cardCount ++;
    front = `<div class="card" >`
     front += `<h3> Customer ID : ${customer.CustomerID}</h3>`;
     front += `<div> First Name : ${customer.FirstName}</div>`;
     front += `<div> Last Name : ${customer.LastName}</div>`;
     front += `<div> Country : ${customer.Country}</div>`;
     front += `<img src='countries/${customer.Country}.PNG'>`;
     front += `<hr>`;
    front += `</div>`;

    back = `<div class = "card">`;
     if(customer.CarID != null){ 
     back += `<h3> Car ID </h3>`;
     back += `<p> ${customer.CarID} </p>`;
     back += `<div> Model </div>`;
     back += `<div2> ${customer.Model}`;
     back += `<div> Loaned From: </div>`;
     back += `<div2> ${customer.Name}`;
     }else{
      back += `<h1> N/A </h1>`;
      back += `<h3> Customer does not have a car </h3>`;
     }
    back += `</div>`;

     let card = new FlipCard(front,back);
    card.render("centerpanel");// render Flip card in container
  }
  // Now inject the front content into the output container
  count.innerHTML = "Total Cards Found: " + cardCount;
}

function filter(){
  let country = document.getElementById("country").value;
  let count = document.getElementById("count");
  let cardCount = 0;
  console.log(country);

  let customerList = []; //create a list of songs searched for
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] //get each sog
    //make sure the list is no
    if( customer.Country == country ) {
          //add to the new list
          customerList.push(customer);
          count ++;
    }
  }

  console.log(`number found ${customerList.length}`)
  generateCards(customerList);  
  count.innerHTML = "Total Cards Found: " + cardCount;
}

function filterByDealership(){
  let dealership = document.getElementById("dealershipName").value;
  let count = document.getElementById("count");
  let cardCount = 0;
  console.log(dealership);

  let customerList = []; //create a list of songs searched for
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] //get each sog
    //make sure the list is no
    if( customer.Name == dealership ) {
          //add to the new list
          customerList.push(customer);
          cardCount ++;
    }
  }
  
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);  
  count.innerHTML = "Total Cards Found: " + cardCount;
}