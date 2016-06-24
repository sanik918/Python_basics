import math

l = []
c=50
h=30
items = [x for x in raw_input().split(',')]
for d in items:
      l.append(str(int(round(math.sqrt((2*c*float(d))/h)))))
print ','.join(l)
