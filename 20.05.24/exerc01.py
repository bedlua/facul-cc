numeros = [0, 0, 0, 0, 0]
x=0
while x<5:
    numeros[x]=int(input('digite um valor: '))
    x += 1
while True:
    escolhido=int(input('que posição voce quer imprimir?: '))
    if escolhido==0:
        break
    print(f'voce escolheu o numero: {numeros[escolhido]}')