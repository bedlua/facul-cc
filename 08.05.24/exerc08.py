n1=int(input('Digite o primeiro numero: '))
n2=int(input('Digite o segundo numero: '))
n3=int(input('Digite o terceiro numero: '))
if n1>n2:
    n1,n2=n2,n1
if n2>n3:
    n2,n3=n3,n2
if n1>n2:
    n1,n2=n2,n1
print('Os números em ordem crescente são:', n1,n2,n3)