#This program is used to check if character is alphabet or not
#This program is procedural program and hence none of the OOP concepts are present.
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
