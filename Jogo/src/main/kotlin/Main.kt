package dnd

import dnd.modelos.*
import dnd.estrategias.*

fun main() {
    // Criar uma instância de habilidades
    val habilidades = Habilidades()

    // Escolher uma raça e uma classe
    val racaEscolhida = Raca.criarPorEscolha("3")  // Exemplo: Humano
    val classeEscolhida = Classes.criarPorEscolha("1")  // Exemplo: Guerreiro

    // Aplicar bônus racial
    racaEscolhida.aplicarBonus(habilidades)

    // Criar um personagem
    val personagem = Personagem(racaEscolhida, classeEscolhida, habilidades)

    // Exibir informações
    println("Informações do Personagem:")
    personagem.exibirInformacoesClasse()
    personagem.exibirInformacoesRaca()
    personagem.exibirHabilidades()
    personagem.exibirInformacoesPontosDeVida()
}
