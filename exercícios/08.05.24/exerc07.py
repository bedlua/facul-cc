n1=float(input('Digite a primeira nota: '))
n2=float(input('Digite a segunda nota: '))
n3=float(input('Digite a terceira nota: '))
letra=str(input('Digite uma letra (A, P ou H): '))
letra=letra.upper()
if letra == 'A':
    m=(n1+n2+n3)/3
    print('Média aritmética:', round(m, 1))
elif letra == 'P':
    m=((n1*5)+(n2*3)+(n3*2))/10
    print('Média ponderada:', round(m, 1))
elif letra == 'H':
    m=(3/((1/n1))+(1/n2)+(1/n3))
    print('Média harmônica:', round(m, 1))
else:
    print ('Letra inválida.')

    
