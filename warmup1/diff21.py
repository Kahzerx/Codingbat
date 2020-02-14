def diff21(n):
    return 2 * (n - 21) if n > 21 else 21 - n


if __name__ == "__main__":
    print(diff21(19))
    print(diff21(10))
    print(diff21(21))
