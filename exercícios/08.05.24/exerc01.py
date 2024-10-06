n=int(input('Escreva um número entre 0 e 60: '))
while (n<0) or (n>60):
    print('Número inválido.')
    n=int(input('Escreva um número entre 0 e 60: '))
if n==60:
    print('O sucessor de 60 é: 0')
else:
    print('O sucessor de {} é:'.format(n), n+1)