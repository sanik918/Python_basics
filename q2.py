def fact(x):
	if x == 0:
	   return 1
        return x * fact(x-1)

print 'Enter the number for factorial'
x = int(raw_input())
print fact(x)
   
