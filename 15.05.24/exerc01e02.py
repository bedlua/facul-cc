nomes = ['Alice', 'Bob', 'Charlie', 'David']
n=input('Digite um nome: ')
while n not in nomes:
    print('O nome não está presente no vetor.')
    n=input('Digite um nome: ')
if n in nomes:
    print('O nome está presente no vetor.')