total = 0
for number in range(1, 101) :
	if number % 2 == 0 :
		print(number, end= ',   ')
		total += number
print("The sum of even number is ",total)