n = input('>')
T = sum(map(int,n))
m = 9 - T%9
P = [];
for i in range(len(n)+1):
    tmp = int(n[:i] + str(m) + n[i:])
    
    if (tmp % 9 == 0):
        P.append(tmp)
    
print(P)
print("gia tri min: ",min(P))