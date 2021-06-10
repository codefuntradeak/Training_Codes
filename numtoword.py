#This program is use to convert a given number to hindi words
#For proper functioning of program keep numbers.json file in the same directory ehere this program resides.
#This is a procedural program so no major OOP concepts are present.
import json,pprint

def converter(num):
	if len(num)==0 or len(num)>19:
		return "Invalid Number"
	f = open("numbers.json")
	numdict = json.load(f)
	posdict = [(0,""), (2,"sau"), (3,"hajar"), (5,"lakh"), (7,"crore"), (9,"Arab"), (11,"Kharv"), (13,"Neel"), (15,"Padam"), (17,"Shankh")]
	if len(num)==1:
		return numdict[num]
	poscnt = 0
	numWord = ""
	loopcnt = len(num)-1
	while loopcnt>-1:
		if poscnt+1<len(posdict):
			chkstrln = posdict[poscnt+1][0] - posdict[poscnt][0]
		else:
			chkstrln = loopcnt+1
		if loopcnt-chkstrln+1<0:
			chkstrln = 1
		pchkstrln = chkstrln
		while num[loopcnt-chkstrln+1] == "0":
			chkstrln -= 1
		if chkstrln > 0:
			dictword = numdict[num[loopcnt-chkstrln+1:loopcnt+1]]
			numWord = dictword +  " " + posdict[poscnt][1] + " " + numWord 
		#print(posdict[poscnt][1])
		#print(numWord)
		poscnt += 1
		loopcnt -= pchkstrln

	#pprint.pprint(numdict)
	#print(type(numdict)) 
	#print("Hello", numWord)
	f.close()
	return numWord

if __name__ == "__main__":
	num = input()
	numWord = converter(num)
	print(numWord)
