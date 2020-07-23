
let openHouseDay = function(marksSub1,marksSub2) {

	let percentage = ((marksSub1+marksSub2)/200)*100;

	if (percentage >= 90) {
		return 'A';
	}
	else if (percentage >=80 && percentage<90) {
		return 'B';
	}
	else if (percentage >= 70 && percentage < 80 ) {
		return 'C';
	}
	else if (percentage >= 60 && percentage < 70 ) {
		return 'D';
	}
	else if (percentage >= 50 && percentage < 60 ) {
		return 'E';
	}
	else if (percentage < 50 ) {
		return 'F';
	}
}

console.log('Your Grade is',openHouseDay(50,80));
