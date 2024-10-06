nota1=float(input("qual foi a primeira nota? "))
nota2=float(input("qual foi a segunda nota? "))
media=(nota1+nota2)/2
if (media>=6):
    print ("aluno aprovado")
if (media>=4) and (media<6):
    print ("exame")
if (media<4):
    print ("aluno reprovado")

