def isalpha(char):
	if len(char)>1:
		return False
	charint = ord(char)
	if (charint>=65 and charint<=90) or (charint>=97 and charint<=122): 
		return True
	return False

if __name__ == "__main__":
	char = input()
	res = isalpha(char)
	if res:
		print("Character is alphabet")
	else:
		print("Character is not alphabet")