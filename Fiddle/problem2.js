function writeAnswer(answer) { 
    $('div.answer').append($('<div>').text(answer));
}

function isTrafficJam(numberOfAutoRickshaws, isAfterEightPm) {
    var answer;
    
    // write some code here!
    if((numberOfAutoRickshaws>40 && !isAfterEightPm)){
    	answer = 'Traffic jam is predicted\n';
    }else{
    	answer = 'No traffic jam is predictes\n';
    }
    
    writeAnswer(answer);
}

isTrafficJam(30, false);