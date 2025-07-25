
#python list

"""
Write a program that:

Creates an empty list called colors.

Asks the user 3 times to input a color name.

Appends each color to the colors list.

Prints the full list after all inputs.
"""

colors = []

color_name = input("enter 3 color names: ")
color_name_1 = input("enter 3 color names: ")
color_name_2 = input("enter 3 color names: ")



colors.append(color_name)
colors.append(color_name_1)
colors.append(color_name_2)


print(colors)