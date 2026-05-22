algoritmo "acordar_na_raça"

var
   hora: inteiro
   resposta: caractere

inicio

   escreva("Que horas são? ")
   leia(hora)

   se (hora >= 5) e (hora <= 9) entao
      escreva("ACORDAAAAAAA!!! Bora vencer na vida!\n")
      
      escreva("Você quer continuar dormindo? (s/n): ")
      leia(resposta)

      enquanto (resposta = "s") faca
         escreva("Levanta! A vida não vai esperar!\n")
         escreva("Quer continuar dormindo? (s/n): ")
         leia(resposta)
      fimenquanto

      escreva("BOA! Agora sim, partiu estudar/programar!\n")

   senao
      escreva("Pode dormir tranquilo... mas cuidado pra não virar preguiçoso hein!\n")
   fimse

fimalgoritmo
