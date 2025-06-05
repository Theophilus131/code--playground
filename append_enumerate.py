"""
Task 3: Combine append + enumerate
Write a program that:
Creates an empty list called favorite_foods.
Asks the user to input their top 5 favorite foods, appending each input to the list.
After all inputs, uses enumerate to print each food with its position like:



favorite_foods = []

foods = input("enter your favourite dish: ")
foods1 = input("enter your favourite dish: ")
foods2 = input("enter your favourite dish: ")
foods3 = input("enter your favourite dish: ")
foods4 = input("enter your favourite dish: ")

favorite_foods.append(foods)

favorite_foods.append(foods1)

favorite_foods.append(foods2)

favorite_foods.append(foods3)

favorite_foods.append(foods4)

for food, favorite_foods in enumerate(favorite_foods):
    print(f" food {food}: {favorite_foods")
    """
    
    #using loop to simply the program
    
favorite_foods = []

for i in range(5):
    food = input(f"Enter your favorite dish #{i + 1}: ")
    favorite_foods.append(food)

print("\nYour Favorite Dishes:")
for index, food in enumerate(favorite_foods, start=1):
    print(f"{index}. {food}")
