def front_back(str):
    return str if len(str) <= 1 else str[len(str) - 1] + str[1:len(str) - 1] + str[0]


if __name__ == "__main__":
    print(front_back('code'))
    print(front_back('a'))
    print(front_back('ab'))
