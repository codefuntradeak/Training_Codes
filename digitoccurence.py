# A program to count occurence of digits in a number
def occurenceofDigits(num):
	digilist = [0]*10
	while num>0:
		digit = num%10
		num = num//10
		digilist[digit] += 1
		#print(digicnt)
	return digilist
		
if __name__ == "__main__":
	num = int(input())
	digitlist = occurenceofDigits(num)
	for i,cnt in enumerate(digitlist):
		print(i," : ",cnt)