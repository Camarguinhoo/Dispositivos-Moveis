package dnd.estrategias

import dnd.modelos.Habilidades

class BonusRacaGnomo : BonusRacial {
    override fun aplicarBonus(habilidades: Habilidades) {
        habilidades.inteligencia += 2
        habilidades.calcularModificadores()
    }
}
