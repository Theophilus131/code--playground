"""
Write a function that takes a list of numbers and returns the average.

"""

def average(numbers):
    total = 0
    for number in numbers:
        total += number
        average = total / len(numbers)		

    return average
    
nums = [10, 20, 30, 40, 50]

result = average(nums)

print("Average is: ", result)