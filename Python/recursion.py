def recursion(number) :
	print (number)
	if number == 1 :
		return 1
	else :
		return number * recursion(number - 1)

print("The factorial of the number is: ", recursion(2))