function writeAnswer(answer) { 
    $('div.answer').append($('<div>').text(answer));
}
function totalMoney(notes){
	var answer = 0;
  
  for(var i = 0;i<notes.length;i++){
  	if(isValid(notes[i])){
    	answer = answer + notes[i];
    }
    else{
    	break;
    }
  }
  writeAnswer(answer);
}
function isValid(num){
	var valid = [5,10,20,50,100,500,1000];
  for(var i = 0; i <valid.length;i++){
  	if(num == valid[i]){
    	return true;
    }
  }
	return false;
}
  totalMoney([10, 20, 100]);