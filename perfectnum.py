def isPerfect( n ):
    divsum = 1
     
    i = 2
    while i * i <= n:
        if n % i == 0:
            divsum = divsum + i + n/i
        i += 1
    if divsum == n and n!=1:
      return True
    else:
      return False

if __name__ == "__main__":
  print("Enter a number:")
  n = int(input())
  print("Printing perfect numbers from 1 to ",n)
  for i in range(1,n):
    if isPerfect(i):
      print(i)
    
