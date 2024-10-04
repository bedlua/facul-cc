a=float(input('Digite o primeiro lado do triângulo (A): '))
b=float(input('Digite o segundo lado do triângulo (B): '))
c=float(input('Digite o terceiro lado do triângulo (C): '))
if a<b:
    a,b = b,a
if a<c:
    a,c = c,a
if a<b+c:
    print('Nenhum triângulo formado.')
if a*2==b*2+c*2:
    print('Triângulo retângulo.')
if a*2>b*2+c*2:
    print('Triângulo obtusângulo.')
if a*2<b*2+c*2:
    print('Triângulo acutângulo.')
    

