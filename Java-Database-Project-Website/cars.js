let cars, info;

async function init(){
  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8552.app.github.dev"; //replace with your Dev URL
  let route= "/cars";

  info = await fetch(link+route);
  cars= await info.json();

  generateCards(cars);
}

function generateCards(cars){  
  let centerpanel = document.getElementById("centerpanel");
  let count = document.getElementById("count");
  centerpanel.innerHTML = "";
  let front ="";
  let back = "";
  let cardCount = 0;
  for(let i=0; i<cars.length; i++){
    let car = cars[i];
    cardCount ++;
   front = `<div class="card" >`
    front += `<h3> Car ID: ${car.CarID} </h3>`;
    front += `<div> Model </div>`;
    front += `<div2> ${car.Model} </div2>`;
    front += `<div> Value </div>`;
    front += `<div2> ${car.Value} </div2>`;
    front += `<div> Loaned </div>`;
    front += `<div2> ${car.Loaned}</div2>`;
    front += `<hr>`;
   front += `</div>`;

   back = `<div class = "card">`;
    back += `<h3> Dealership ID: ${car.DealershipID} </h3>`;
    back += `<div> Name </div>`;
    back += `<div2> ${car.Name}</div2>`;
    back += `<div> Country </div>`;
    back += `<div2> ${car.Country}</div2>`;
    back += `<div> Total Cars </div>`;
    back += `<div2> ${car.TotalCars}</div2>`;
    back += `<hr>`;
    back += `<img src='countries/${car.Country}.PNG'>`;
   back += `</div>`;

    let card = new FlipCard(front,back);
    card.render("centerpanel");// render Flip card in container
  }
  count.innerHTML = "Total Cards Found: " + cardCount;
  // Now inject the front content into the output container

}

function filterByModel(){
  let model = document.getElementById("carModel").value;
  let count = document.getElementById("count").value;
  let newCars = []; //create a list of songs searched for
  let cardCount = 0;

  for(let i=0; i<cars.length;i++){
    let car = cars[i] //get each sog
    //make sure the list is no
    if( car.Model == model ) {
          //add to the new list
          newCars.push(car);
          cardCount ++;
       }
  }
  generateCards(newCars);  
  count.innerHTML = "Total Cards Found: " + cardCount;
}

function filterByDealership(){
  let name = document.getElementById("dealershipName").value;
  let count = document.getElementById("count").value;
  let newCars = []; //create a list of songs searched for
  let cardCount = 0;
  for(let i=0; i<cars.length;i++){
    let car = cars[i] //get each sog
    //make sure the list is no
    if( car.Name == name ) {
          //add to the new list
          newCars.push(car);
          cardCount ++;
       }
  }
  generateCards(newCars);  
  count.innerHTML = "Total Cards Found: " + cardCount;
}