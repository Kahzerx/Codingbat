def monkey_trouble(a_smile, b_smile):
    return a_smile == b_smile


if __name__ == "__main__":
    print(monkey_trouble(True, True))
    print(monkey_trouble(False, False))
    print(monkey_trouble(True, False))
