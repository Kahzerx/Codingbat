def parrot_trouble(talking, hour):
    return talking and (hour < 7 or hour > 20)


if __name__ == "__main__":
    print(parrot_trouble(True, 6))
    print(parrot_trouble(True, 7))
    print(parrot_trouble(False, 6))
