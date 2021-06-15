# A program to count digits in a number
#This is a Procedural program so major OOP concepts are not present
def countDigits(num):
	digicnt = 0
	while num>0:
		num = num//10
		digicnt += 1
		#print(digicnt)
	return digicnt
		
if __name__ == "__main__":
	num = int(input())
	digitcnt = countDigits(num)
	print(digitcnt)
