senha="12345"
leitura=" "
while (leitura != senha):
    leitura=input("digite a senha ")
    if leitura == senha:
        print("acesso liberado")
    if leitura != senha:
        print ("senha incorreta")