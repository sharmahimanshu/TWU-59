// js
function writeAnswer(answer) { 
    $('div.answer').append($('<div>').text(answerß));
}
fumction computeTotalFare(distance,waitTime,isNightTime){
	var answer;
  var total = getFare(distance,waitTime);
  if(isNightTime){
  answer =total + getNightCharge(total);
  }else{
  answer = total;
  }
  writeAnswer(answer);
  
}
function getNightCharge(total){
	return total*0.5;
}
function getFare(distance,time){
	return (20 + 8 * (distance-1) + 4 * time);
}
computeTotalFare(5,5,true);