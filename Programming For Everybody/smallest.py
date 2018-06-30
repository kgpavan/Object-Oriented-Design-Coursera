largest = None
smallest = 0
while True:
    #value = input("Enter a number:")
    try:
        num = int(input("Enter a number"))
    except ValueError:
        print("Invalid Number")

        if num == "done":
            break
        if num > largest:
            largest = num
        if num < smallest:
            smallest = num
        print("Max")
        print("Min")
