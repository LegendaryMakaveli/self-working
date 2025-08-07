function getTheFactorial(number) {
	if (number === 0) {
		return 1;
	} else {
		return getTheFactorial(number - 1) * number;
	}

}

console.log(getTheFactorial(5));