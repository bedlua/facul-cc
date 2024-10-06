def n():
    n1=input("digite a primeira lista separada por espaço: ").split()
    n2=input("digite a segunda lista separada por espaço: ").split()
    n1=[int(elemento) for elemento in n1]
    n2=[int(elemento) for elemento in n2]
    soma=[]
    for i in range(len(n1)):
        soma.append(n1[i]+n2[i])
    return soma
r=n()
if 5 in r:
    print ('o numero 5 esta na lista.')
else:
    print ('o numero 5 nao esta na lista.')