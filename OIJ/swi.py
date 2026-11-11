n, l, t = input().split()
n, l, t = int(n), int(l), int(t)


a = input().split()
a = list(map(int, a))
a.sort()

roz = []
for i in range(n):
    if i == n-1:
        roz.append((l-1)-int(a[i])+int(a[0])+1)
    else:
        roz.append(a[i+1]-a[i])
roz.sort()

roz.pop()

sum = 0
for i in roz:
    sum += i
if sum <= t:
    print("TAK")
else:
    print("NIE")