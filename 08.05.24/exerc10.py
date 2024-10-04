sigla=input('Digite a sigla do seu estado: ')
sigla=sigla.upper()
if sigla=='RJ':
    print('-> Carioca')
elif sigla=='SP':
    print('-> Paulista')
elif sigla=='MG':
    print('-> Mineiro')
elif sigla=='PR':
    print('-> Paranaense')
elif sigla=='RS':
    print('-> Gaúcho')
else:
    print('-> Outros estados')
