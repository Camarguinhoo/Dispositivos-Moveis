package dnd.estrategias

import dnd.modelos.Habilidades

class BonusRacaHumano : BonusRacial {
    override fun aplicarBonus(habilidades: Habilidades) {
        habilidades.sabedoria += 1
        habilidades.calcularModificadores()
    }
}
