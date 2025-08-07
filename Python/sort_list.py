def find_the_largest_index(number) :
	largest = number[0]
	largest_index = 0

	for index, _ in enumerate(number) :
		if number[index] > largest :
			largest = number[index]
			largest_index = index

	return largest_index


def sort_a_list(number) :
	new_list = []
	for digit in number :
		largest = find_the_largest_index(number)
		new_list.append(number.pop(largest))

	return new_list

print(find_the_largest_index([3,4,2,4,5,6,1,7]))

print(sort_a_list([3,4,2,4,5,6,1,7]))
			