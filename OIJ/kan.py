n, m = input().split()
n,m = int(n),int(m)

h = input().split()

for i in h:
    h.append(int(h[0]))
    h.pop(0)

kan = []
for i in range(m):
    kan.append("#" * h[i]+"."*(n-h[i]))

kan2 = []
for i in range(n):
    kan2.append("")
    for j in range(m):
        kan2[i] += kan[j][-(i+1)]
for i in range(n):
    print(kan2[i])
        
