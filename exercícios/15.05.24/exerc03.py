def n():
    v1=input("digite o primeiro vetor separados por espaço: ").split()
    v2=input("digite o segundo vetor separados por espaço: ").split()
    v1=[int(elemento) for elemento in v1]
    v2=[int(elemento) for elemento in v2]
    soma=[]
    for i in range(len(v1)):
        soma.append(v1[i]+v2[i])
    return soma
r=n()
print("a soma dos vetores é:", r)