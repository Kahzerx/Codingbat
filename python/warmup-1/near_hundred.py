def near_hundred(n):
    return abs(100 - n) <= 10 or abs(200 - n) <= 10


if __name__ == "__main__":
    print(near_hundred(93))
    print(near_hundred(90))
    print(near_hundred(89))
