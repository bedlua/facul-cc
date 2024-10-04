algoritmo "Exercício 08"
var
   cod, quant, prt, d, prf: real
inicio
      escreva ("digite o código do produto: ")
      leia (cod)
      escreva ("digite a quantidade comprada do produto: ")
      leia (quant)
      escolha cod
      caso 1 ate 10
         prt <- quant*10
         se (prt<250) entao
            d <- prt*0.05
            prf <- prt-d
         fimse
         se (prt>=250) e (pto<=500) entao
            d <- prt*0.1
            prf <- prt-d
         fimse
         se (prt>500) entao
            d <- pto*0.15
            prf <- prt-d
         fimse
         escreval ("Valor unitário do produto: R$10,00")
         escreval ("Preço total:", pto)
         escreval ("Valor do desconto:", d)
         escreval ("Preço final com desconto:", prf)
      caso 11 ate 20
         prt <- quant*15
         se (prt<250) entao
            d <- prt*0.05
            prf <- prt-d
         fimse
         se (prt>=250) e (pto<=500) entao
            d <- prt*0.1
            prf <- prt-d
         fimse
         se (prt>500) entao
            d <- pto*0.15
            prf <- prt-d
         fimse
         escreval ("Valor unitário do produto: R$15,00")
         escreval ("Preço total:", pto)
         escreval ("Valor do desconto:", d)
         escreval ("Preço final com desconto:", prf)
      caso 21 ate 30
         prt <- quant*20
         se (prt<250) entao
            d <- prt*0.05
            prf <- prt-d
         fimse
         se (prt>=250) e (pto<=500) entao
            d <- prt*0.1
            prf <- prt-d
         fimse
         se (prt>500) entao
            d <- pto*0.15
            prf <- prt-d
         fimse
         escreval ("Valor unitário do produto: R$20,00")
         escreval ("Preço total:", pto)
         escreval ("Valor do desconto:", d)
         escreval ("Preço final com desconto:", prf)
      caso 31 ate 40
         prt <- quant*30
         se (prt<250) entao
            d <- prt*0.05
            prf <- prt-d
         fimse
         se (prt>=250) e (pto<=500) entao
            d <- prt*0.1
            prf <- prt-d
         fimse
         se (prt>500) entao
            d <- pto*0.15
            prf <- prt-d
         fimse
         escreval ("Valor unitário do produto: R$30,00")
         escreval ("Preço total:", pto)
         escreval ("Valor do desconto:", d)
         escreval ("Preço final com desconto:", prf)
      fimescolha
fimalgoritmo