class Batalha(private val p1: Jogador, private val p2: Jogador) {

    private val effectiveness = mapOf(
        "Fogo" to listOf("Planta", "Gelo", "Inseto", "Metálico"),
        "Água" to listOf("Fogo", "Terra", "Rocha"),
        "Planta" to listOf("Água", "Terra", "Rocha"),
        "Elétrico" to listOf("Água", "Voador"),
        "Terra" to listOf("Fogo", "Elétrico", "Metálico"),
        "Gelo" to listOf("Planta", "Terra", "Voador"),
        "Lutador" to listOf("Normal", "Rocha", "Gelo"),
        "Fantasma" to listOf("Psíquico", "Fantasma"),
        "Psíquico" to listOf("Lutador", "Venenoso")
    )

    fun iniciar() {
        var index1 = 0
        var index2 = 0

        println("Batalha entre ${p1.nickname} e ${p2.nickname}!")

        var atual1 = p1.time[index1]
        var atual2 = p2.time[index2]

        while (index1 < p1.time.size && index2 < p2.time.size) {
            println("\nNovo duelo: ${atual1.nome} (HP ${atual1.hp}) vs ${atual2.nome} (HP ${atual2.hp})")

            while (atual1.hp > 0 && atual2.hp > 0) {
                atacar(atual1, atual2)
                if (atual2.hp <= 0) break

                atacar(atual2, atual1)
            }

            if (atual1.hp <= 0) {
                println("${atual1.nome} foi derrotado!")
                index1++
                if (index1 < p1.time.size) {
                    atual1 = p1.time[index1]
                    println("${p1.nickname} escolheu ${atual1.nome}!")
                }
            }

            if (atual2.hp <= 0) {
                println("${atual2.nome} foi derrotado!")
                index2++
                if (index2 < p2.time.size) {
                    atual2 = p2.time[index2]
                    println("${p2.nickname} escolheu ${atual2.nome}!")
                }
            }
        }

        if (index1 >= p1.time.size && index2 >= p2.time.size) {
            println("Empate! Ambos os times foram derrotados.")
        } else if (index1 >= p1.time.size) {
            println("Vitória de ${p2.nickname}!")
        } else {
            println("Vitória de ${p1.nickname}!")
        }
    }

    private fun atacar(atacante: Pokemon, defensor: Pokemon) {
        val fator = calcularEficacia(atacante.tipos, defensor.tipos)
        val danoBase = atacante.ataque - (defensor.defesa / 2)
        val dano = (if (danoBase > 0) danoBase else 1) * fator
        defensor.hp -= dano.toInt()
        println("${atacante.nome} atacou ${defensor.nome} causando ${dano.toInt()} de dano (x$fator)")
    }

    private fun calcularEficacia(tipoAtk: String, tipoDef: String): Double {
        val tiposAtk = tipoAtk.split("/")
        val tiposDef = tipoDef.split("/")

        for (atk in tiposAtk) {
            for (def in tiposDef) {
                if (effectiveness[atk]?.contains(def) == true) {
                    return 2.0
                }
                if (effectiveness[def]?.contains(atk) == true) {
                    return 0.5
                }
            }
        }
        return 1.0
        }
}