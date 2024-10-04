algoritmo "Exercício 06"
var
   i: inteiro
inicio
      escreva ("qual a idade do nadador? ")
      leia (i)
      se (i<5) entao
         escreva ("sem categoria")
      fimse
      se (i>=5) e (i<=7) entao
         escreva ("categoria: infantil")
      fimse
      se (i>=8) e (i<=10) entao
         escreva ("categoria: juvenil")
      fimse
      se (i>=11) e (i<=15) entao
         escreva ("categoria: adolescente")
      fimse
      se (i>=16) e (i<=30) entao
         escreva ("categoria: adulto")
      fimse
      se (i>=30) entao
         escreva ("categoria: sênior")
      fimse
fimalgoritmo