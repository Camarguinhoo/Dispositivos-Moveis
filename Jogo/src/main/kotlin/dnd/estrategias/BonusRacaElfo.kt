package dnd.estrategias

import dnd.modelos.Habilidades

class BonusRacaElfo : BonusRacial {
    override fun aplicarBonus(habilidades: Habilidades) {
        habilidades.destreza += 1
        habilidades.calcularModificadores()
    }
}
