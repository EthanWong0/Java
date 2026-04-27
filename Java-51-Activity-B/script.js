// Create a webpage to filter for specific Songs based on search criteria.
// Your DB Server that serves the 'songs' route must be running!! (Lesson51 DBserver)

// See index.html file first.
let songs, info, output, cardCount;
async function init(){

  let link = "https://cautious-telegram-q7j6jjgr97rhxw7j-8500.app.github.dev"; //replace with your Dev URL
  let route= "/songs";

  info = await fetch(link+route);
  songs = await info.json();

  generateCards(songs);
  console.log(songs);
}

function generateCards(songs){
  output = document.getElementById("output");
  cardCount = document.getElementById("count");
  let build ="";
  let count = "";
  //Update number of songs found
  count.innerHTML=`Number of songs found: ${songs.length}`;
  
  for(let i=0; i<songs.length; i++){
    let song = songs[i];

    build += `<div class="card" >`
    build += 	`<h4> ${song.Name} </h4>`;
    build += 	`<div> Album </div>`;
    build += 	`<span> ${song.Title} </span>`;
    build += 	`<div> Composer </div>`;
    build += 	`<span> ${song.Composer}</span>`;
    build += `</div>`;

    count++;
  }

  cardCount.innerHTML = `<h2>${count} track(s) found</h2>`;
  output.innerHTML = build;
}

/*
  Challenge 1:
  Write the event handler function "filter1" that searches 
  for songs by song name, album title or composer name. Then
  generate the cards using the generateCards() function provided.
*/
 function filter1(){
    output = document.getElementById("output");
    let build = "";
    let newSongs = [];
    for(let i = 0; i < songs.length; i++){
      let song = songs[i];
      if(song.Name == songname){
        newSongs.push(songname);
      }else if(song.Title = title1){
        newSongs.push(title1);
      }else if(song.Composer == composer1){
        newSongs.push(composer1);
      }
        generateCards(newSongs);
    }
 }


/*
  Challenge 2:
  Write the event handler function "filter2" that searches 
  for songs by album title AND composer name. Then
  generate the cards using the generateCards() function provided.
*/
function filter2(){
    output = document.getElementById("output");
    let build = "";
    let newSongs = [];

    for(let i = 0; i < songs.length; i++){
      let song = songs[i];
      if(song.Title == title2 && song.Composer == composer2){
        newSongs.push(title2);
        newSongs.push(composer2)
      }
      generateCards(newSongs);
    }
 }