nome=input('Digite o nome do aluno: ')
n1=float(input('Digite a primeira nota: '))
n2=float(input('Digite a segunda nota: '))
n3=float(input('Digite a terceira nota: '))
m=(n1+n2+n3)/3
if m>=8:
    print('Aluno:', nome,', Média:', round(m,1),', Situação: Aprovado')
else:
    print('Aluno:', nome,', Média:', round(m,1),', Situação: Reprovado')