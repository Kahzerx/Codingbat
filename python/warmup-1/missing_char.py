def missing_char(str, n):
    return str.replace(str[n], "")


if __name__ == "__main__":
    print(missing_char('kitten', 1))
    print(missing_char('kitten', 0))
    print(missing_char('kitten', 4))
