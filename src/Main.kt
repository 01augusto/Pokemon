fun main() {
    val mapaPokemons = mapOf(
        1 to Pokemon("Bulbasaur", "Planta/Venenoso", 45, 49, 49),
        2 to Pokemon("Ivysaur", "Planta/Venenoso", 60, 62, 63),
        3 to Pokemon("Venusaur", "Planta/Venenoso", 80, 82, 83),
        4 to Pokemon("Charmander", "Fogo", 39, 52, 43),
        5 to Pokemon("Charmeleon", "Fogo", 58, 64, 58),
        6 to Pokemon("Charizard", "Fogo/Voador", 78, 84, 78),
        7 to Pokemon("Squirtle", "Água", 44, 48, 65),
        8 to Pokemon("Wartortle", "Água", 59, 63, 80),
        9 to Pokemon("Blastoise", "Água", 79, 83, 100),
        10 to Pokemon("Caterpie", "Inseto", 45, 30, 35),
        11 to Pokemon("Metapod", "Inseto", 50, 20, 55),
        12 to Pokemon("Butterfree", "Inseto/Voador", 60, 45, 50),
        13 to Pokemon("Weedle", "Inseto/Venenoso", 40, 35, 30),
        14 to Pokemon("Kakuna", "Inseto/Venenoso", 45, 25, 50),
        15 to Pokemon("Beedrill", "Inseto/Venenoso", 65, 90, 40),
        16 to Pokemon("Pidgey", "Normal/Voador", 40, 45, 40),
        17 to Pokemon("Pidgeotto", "Normal/Voador", 63, 60, 55),
        18 to Pokemon("Pidgeot", "Normal/Voador", 83, 80, 75),
        19 to Pokemon("Rattata", "Normal", 30, 56, 35),
        20 to Pokemon("Raticate", "Normal", 55, 81, 60),
        21 to Pokemon("Spearow", "Normal/Voador", 40, 60, 30),
        22 to Pokemon("Fearow", "Normal/Voador", 65, 90, 65),
        23 to Pokemon("Ekans", "Venenoso", 35, 60, 44),
        24 to Pokemon("Arbok", "Venenoso", 60, 95, 69),
        25 to Pokemon("Pikachu", "Elétrico", 35, 55, 40),
        26 to Pokemon("Raichu", "Elétrico", 60, 90, 55),
        27 to Pokemon("Sandshrew", "Terra", 50, 75, 85),
        28 to Pokemon("Sandslash", "Terra", 75, 100, 110),
        29 to Pokemon("Nidoran♀", "Venenoso", 55, 47, 52),
        30 to Pokemon("Nidorina", "Venenoso", 70, 62, 67),
        31 to Pokemon("Nidoqueen", "Venenoso/Terra", 90, 82, 87),
        32 to Pokemon("Nidoran♂", "Venenoso", 46, 57, 40),
        33 to Pokemon("Nidorino", "Venenoso", 61, 72, 57),
        34 to Pokemon("Nidoking", "Venenoso/Terra", 81, 92, 77),
        35 to Pokemon("Clefairy", "Fada", 70, 45, 48),
        36 to Pokemon("Clefable", "Fada", 95, 70, 73),
        37 to Pokemon("Vulpix", "Fogo", 38, 41, 40),
        38 to Pokemon("Ninetales", "Fogo", 73, 76, 75),
        39 to Pokemon("Zubat", "Venenoso/Voador", 40, 45, 35),
        40 to Pokemon("Golbat", "Venenoso/Voador", 75, 80, 70),
        41 to Pokemon("Oddish", "Planta/Venenoso", 45, 50, 55),
        42 to Pokemon("Gloom", "Planta/Venenoso", 60, 65, 70),
        43 to Pokemon("Vileplume", "Planta/Venenoso", 75, 80, 85),
        44 to Pokemon("Paras", "Inseto/Planta", 35, 70, 55),
        45 to Pokemon("Parasect", "Inseto/Planta", 60, 95, 80),
        46 to Pokemon("Venonat", "Inseto/Venenoso", 60, 55, 50),
        47 to Pokemon("Venomoth", "Inseto/Venenoso", 70, 65, 60),
        48 to Pokemon("Diglett", "Terra", 10, 55, 25),
        49 to Pokemon("Dugtrio", "Terra", 35, 100, 50),
        50 to Pokemon("Meowth", "Normal", 40, 45, 35),
        51 to Pokemon("Persian", "Normal", 65, 70, 60),
        52 to Pokemon("Psyduck", "Água", 50, 52, 48),
        53 to Pokemon("Golduck", "Água", 80, 82, 78),
        54 to Pokemon("Machop", "Lutador", 70, 80, 50),
        55 to Pokemon("Machoke", "Lutador", 80, 100, 70),
        56 to Pokemon("Machamp", "Lutador", 90, 130, 80),
        57 to Pokemon("Bellsprout", "Planta/Venenoso", 50, 75, 35),
        58 to Pokemon("Weepinbell", "Planta/Venenoso", 65, 90, 50),
        59 to Pokemon("Victreebel", "Planta/Venenoso", 80, 105, 65),
        60 to Pokemon("Tentacool", "Água/Venenoso", 40, 40, 35),
        61 to Pokemon("Tentacruel", "Água/Venenoso", 80, 70, 65),
        62 to Pokemon("Geodude", "Pedra/Terra", 40, 80, 100),
        63 to Pokemon("Graveler", "Pedra/Terra", 55, 95, 115),
        64 to Pokemon("Golem", "Pedra/Terra", 80, 110, 130),
        65 to Pokemon("Ponyta", "Fogo", 50, 65, 40),
        66 to Pokemon("Rapidash", "Fogo", 65, 100, 70),
        67 to Pokemon("Slowpoke", "Água/Psíquico", 90, 65, 65),
        68 to Pokemon("Slowbro", "Água/Psíquico", 95, 75, 110),
        69 to Pokemon("Magnemite", "Elétrico/Metálico", 25, 35, 35),
        70 to Pokemon("Magneton", "Elétrico/Metálico", 50, 60, 95),
        71 to Pokemon("Farfetch'd", "Normal/Voador", 52, 65, 55),
        72 to Pokemon("Doduo", "Normal/Voador", 35, 85, 45),
        73 to Pokemon("Dodrio", "Normal/Voador", 60, 110, 70),
        74 to Pokemon("Seel", "Água", 65, 45, 55),
        75 to Pokemon("Dewgong", "Água/Gelo", 90, 70, 80),
        76 to Pokemon("Grimer", "Venenoso", 80, 80, 50),
        77 to Pokemon("Muk", "Venenoso", 105, 105, 75),
        78 to Pokemon("Shellder", "Água", 30, 65, 100),
        79 to Pokemon("Cloyster", "Água/Gelo", 50, 95, 180),
        80 to Pokemon("Gastly", "Fantasma/Venenoso", 30, 35, 30),
        81 to Pokemon("Haunter", "Fantasma/Venenoso", 45, 50, 45),
        82 to Pokemon("Gengar", "Fantasma/Venenoso", 60, 65, 60),
        83 to Pokemon("Onix", "Pedra/Terra", 35, 45, 160),
        84 to Pokemon("Drowzee", "Psíquico", 60, 48, 45),
        85 to Pokemon("Hypno", "Psíquico", 85, 73, 70),
        86 to Pokemon("Krabby", "Água", 30, 105, 90),
        87 to Pokemon("Kingler", "Água", 55, 130, 115),
        88 to Pokemon("Exeggcute", "Planta/Psíquico", 60, 40, 80),
        89 to Pokemon("Exeggutor", "Planta/Psíquico", 95, 95, 85),
        90 to Pokemon("Cubone", "Terra", 50, 50, 95),
        91 to Pokemon("Marowak", "Terra", 60, 80, 110),
        92 to Pokemon("Lickitung", "Normal", 90, 55, 75),
        93 to Pokemon("Koffing", "Venenoso", 40, 65, 95),
        94 to Pokemon("Weezing", "Venenoso", 65, 90, 120),
        95 to Pokemon("Rhyhorn", "Pedra/Terra", 80, 85, 95),
        96 to Pokemon("Rhydon", "Pedra/Terra", 105, 130, 120),
        97 to Pokemon("Chansey", "Normal", 250, 5, 5),
        98 to Pokemon("Tangela", "Planta", 65, 55, 115),
        99 to Pokemon("Kangaskhan", "Normal", 105, 95, 80),
        100 to Pokemon("Horsea", "Água", 30, 40, 70),
        101 to Pokemon("Seadra", "Água", 55, 65, 95),
        102 to Pokemon("Goldeen", "Água", 45, 67, 60),
        103 to Pokemon("Seaking", "Água", 80, 92, 65),
        104 to Pokemon("Staryu", "Água", 30, 45, 55),
        105 to Pokemon("Starmie", "Água/Psíquico", 60, 75, 85),
        106 to Pokemon("Mr. Mime", "Psíquico/Fada", 40, 45, 65),
        107 to Pokemon("Scyther", "Inseto/Voador", 70, 110, 80),
        108 to Pokemon("Jynx", "Gelo/Psíquico", 65, 50, 35),
        109 to Pokemon("Electabuzz", "Elétrico", 65, 83, 57),
        110 to Pokemon("Magmar", "Fogo", 65, 95, 57),
        111 to Pokemon("Porygon", "Normal", 65, 60, 70)
    )




    val jogador1 = criarJogador(1, mapaPokemons.values.toList())
    val jogador2 = criarJogador(2, mapaPokemons.values.toList())

    val batalha = Batalha(jogador1, jogador2)
    batalha.iniciar()
}

fun criarJogador(numero: Int, listaPokemons: List<Pokemon>): Jogador {
    println("Jogador $numero, digite seu nickname:")
    val nome = readln()


    val mapaPokemons = listaPokemons.withIndex().associate { (index, pokemon) -> (index + 1) to pokemon }

    println("Escolha 3 Pokémon para o seu time:")
    mapaPokemons.forEach { (key, pokemon) -> println("$key - ${pokemon.nome} (${pokemon.tipos})") }

    val time = mutableMapOf<Int, Pokemon>()
    while (time.size < 3) {
        print("Escolha o número do Pokémon ${time.size + 1}: ")
        val escolha = readln().toIntOrNull()

        if (escolha != null && escolha in mapaPokemons.keys) {
            if (!time.containsKey(escolha)) {
                time[escolha] = mapaPokemons[escolha]!!.copy()
            } else {
                println("Você já escolheu esse Pokémon. Escolha outro.")
            }
        } else {
            println("Escolha inválida. Tente novamente.")
        }
    }

    return Jogador(nome, time.values.toList())
}