package dnd.estrategias

import dnd.modelos.Habilidades

interface BonusRacial {
    fun aplicarBonus(habilidades: Habilidades)
}
