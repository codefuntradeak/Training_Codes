def countfrequency(str):
    templ = str.split()
    freqdict = {}
    for word in templ:
        if not word.isalpha():
            word = word[:-1]
        word = word.lower()
        if word in freqdict:
            freqdict[word] += 1
        else:
            freqdict[word] = 1
    return freqdict

if __name__ == "__main__":
    print("Enter a string to count frequency of words")
    str = input()
    freqdict = countfrequency(str)
    print("List of word and there frequency")
    for key,value in freqdict.items():
        print(key, " : ", value)
