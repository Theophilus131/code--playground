favorite_foods = []

# Collect initial 5 favorite dishes
for i in range(5):
    food = input(f"Enter your favorite dish #{i + 1}: ")
    favorite_foods.append(food)

# Menu loop
while True:
    print("\n--- Favorite Foods Menu ---")
    print("1. View favorite foods")
    print("2. Edit a dish")
    print("3. Remove a dish")
    print("4. Add a new dish")
    print("5. Exit")

    choice = input("Choose an option (1-5): ")

    if choice == "1":
        print("\nYour Favorite Foods:")
        for index, food in enumerate(favorite_foods, start=1):
            print(f"{index}. {food}")

    elif choice == "2":
        index = int(input("Enter the number of the dish to edit: ")) - 1
        if 0 <= index < len(favorite_foods):
            new_food = input("Enter the new name of the dish: ")
            favorite_foods[index] = new_food
            print("Dish updated successfully.")
        else:
            print("Invalid number.")

    elif choice == "3":
        index = int(input("Enter the number of the dish to remove: ")) - 1
        if 0 <= index < len(favorite_foods):
            removed = favorite_foods.pop(index)
            print(f"{removed} has been removed.")
        else:
            print("Invalid number.")

    elif choice == "4":
        new_food = input("Enter the new dish to add: ")
        favorite_foods.append(new_food)
        print(f"{new_food} added to your list.")

    elif choice == "5":
        print("Goodbye!")
        break

    else:
        print("Invalid option. Try again.")
