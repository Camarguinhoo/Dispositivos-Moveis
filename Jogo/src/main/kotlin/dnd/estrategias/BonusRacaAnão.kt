package dnd.estrategias

import dnd.modelos.Habilidades

class BonusRacaAnão : BonusRacial {
    override fun aplicarBonus(habilidades: Habilidades) {
        habilidades.constituicao += 2
        habilidades.calcularModificadores()
    }
}
