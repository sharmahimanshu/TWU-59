function writeAnswer(answer) { 
    $('div.answer').append($('<div>').text(answer));
}
function reverseUrdu(news){
	var output = {
  	words: [].concat(news[0],reverse(news[1]),news[2]),
    count: news.length
  };
  writeAnswer(JSON.stringify(output));
}
function reverse(urdu){
	var corrUrdu = [''];
  for(var i=0;i<urdu.length;i++){
  	corrUrdu[urdu.length-1-i] = urdu[i];
  }
  return corrUrdu;
}
var input = [
 ["zara", "dhyaan", "dein"],
 ["mazarat", "chahenge"], // reverse this line
 ["attention", "please"]
];
reverseUrdu(input);