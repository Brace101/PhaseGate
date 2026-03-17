number_table = int(input("Enter a number to print its multiplication table: "))

print(f"Multiplication Table of {number_table}:")

for number in range(1, 13):
    print(f"{number_table} x {number} = {number_table * number}")
