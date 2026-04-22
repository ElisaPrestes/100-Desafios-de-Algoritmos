# beecrowd | 2006
# Identificando o Chá
# Por Inês Kereki UY Uruguay

T = int(input())
nums = list(map(int, input().split()))
i=0
for n in nums:
  if (n == T):
    i+=1;
print(i)