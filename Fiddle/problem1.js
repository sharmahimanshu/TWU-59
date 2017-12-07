// helper function for output
function writeAnswer(answer) { 
    $('div.answer').append($('<div>').text(answer));
}

function kiteGame(numberOfKites) {
    var answer = '';
    for(var i = 1;i<=numberOfKites;i++){
    	if(i%3==0){
      	answer +=  'Peche! ';
        }
      if(i%5==0){
      	answer += 'Ipo Kaate! ';
      }
      if(i%3!=0&&i%5!=0){
      	answer = answer + i + ' ';
      }
      
    }
    
    // write some code here!
    
    writeAnswer(answer);
}

kiteGame(100);

