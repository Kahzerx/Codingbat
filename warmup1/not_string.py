def not_string(str):
    return "not " + str if len(str) < 3 or str[:3] != "not" else str


if __name__ == "__main__":
    print(not_string('candy'))
    print(not_string('x'))
    print(not_string('not bad'))
