import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.listOf
import kotlin.collections.mapOf
import kotlin.collections.mutableMapOf
import kotlin.collections.mutableSetOf
import kotlin.collections.setOf

const val NORMAL = "Normal"
const val FOGO = "Fogo"
const val AGUA = "Agua"
const val GRAMA = "Grama"
const val ELETRICO = "Eletrico"
const val GELO = "Gelo"
const val LUTADOR = "Lutador"
const val VENENOSO = "Venenoso"
const val TERRA = "Terra"
const val VOADOR = "Voador"
const val PSIQUICO = "Psiquico"
const val INSETO = "Inseto"
const val PEDRA = "Pedra"
const val FANTASMA = "Fantasma"
const val DRAGAO = "Dragao"
const val ACO = "Aco"
const val SOMBRIO = "Sombrio"
const val FADA = "Fada"

val TABELA_EFETIVIDADE_TIPOS: Map<String, List<String>> = mapOf(
    NORMAL to listOf(),
    FOGO to listOf(GRAMA, GELO, INSETO, ACO),
    AGUA to listOf(FOGO, TERRA, PEDRA),
    GRAMA to listOf(AGUA, TERRA, PEDRA),
    ELETRICO to listOf(AGUA, VOADOR),
    GELO to listOf(GRAMA, TERRA, VOADOR, DRAGAO),
    LUTADOR to listOf(NORMAL, GELO, PEDRA, SOMBRIO, ACO),
    VENENOSO to listOf(GRAMA, FADA),
    TERRA to listOf(FOGO, ELETRICO, VENENOSO, PEDRA, ACO),
    VOADOR to listOf(GRAMA, LUTADOR, INSETO),
    PSIQUICO to listOf(LUTADOR, VENENOSO),
    INSETO to listOf(GRAMA, PSIQUICO, SOMBRIO),
    PEDRA to listOf(FOGO, GELO, VOADOR, INSETO),
    FANTASMA to listOf(FANTASMA, PSIQUICO),
    DRAGAO to listOf(DRAGAO),
    SOMBRIO to listOf(FANTASMA, PSIQUICO),
    ACO to listOf(GELO, PEDRA, FADA),
    FADA to listOf(LUTADOR, DRAGAO, SOMBRIO)
)

data class Pokemon(val id: Int, val nome: String, val tipos: List<String>)

val LISTA_POKEMON_KANTO: List<Pokemon> = listOf(
    Pokemon(1, "Bulbasaur", listOf(GRAMA, VENENOSO)),
    Pokemon(2, "Ivysaur", listOf(GRAMA, VENENOSO)),
    Pokemon(3, "Venusaur", listOf(GRAMA, VENENOSO)),
    Pokemon(4, "Charmander", listOf(FOGO)),
    Pokemon(5, "Charmeleon", listOf(FOGO)),
    Pokemon(6, "Charizard", listOf(FOGO, VOADOR)),
    Pokemon(7, "Squirtle", listOf(AGUA)),
    Pokemon(8, "Wartortle", listOf(AGUA)),
    Pokemon(9, "Blastoise", listOf(AGUA)),
    Pokemon(10, "Caterpie", listOf(INSETO)),
    Pokemon(11, "Metapod", listOf(INSETO)),
    Pokemon(12, "Butterfree", listOf(INSETO, VOADOR)),
    Pokemon(13, "Weedle", listOf(INSETO, VENENOSO)),
    Pokemon(14, "Kakuna", listOf(INSETO, VENENOSO)),
    Pokemon(15, "Beedrill", listOf(INSETO, VENENOSO)),
    Pokemon(16, "Pidgey", listOf(NORMAL, VOADOR)),
    Pokemon(17, "Pidgeotto", listOf(NORMAL, VOADOR)),
    Pokemon(18, "Pidgeot", listOf(NORMAL, VOADOR)),
    Pokemon(19, "Rattata", listOf(NORMAL)),
    Pokemon(20, "Raticate", listOf(NORMAL)),
    Pokemon(21, "Spearow", listOf(NORMAL, VOADOR)),
    Pokemon(22, "Fearow", listOf(NORMAL, VOADOR)),
    Pokemon(23, "Ekans", listOf(VENENOSO)),
    Pokemon(24, "Arbok", listOf(VENENOSO)),
    Pokemon(25, "Pikachu", listOf(ELETRICO)),
    Pokemon(26, "Raichu", listOf(ELETRICO)),
    Pokemon(27, "Sandshrew", listOf(TERRA)),
    Pokemon(28, "Sandslash", listOf(TERRA)),
    Pokemon(29, "Nidoran♀", listOf(VENENOSO)),
    Pokemon(30, "Nidorina", listOf(VENENOSO)),
    Pokemon(31, "Nidoqueen", listOf(VENENOSO, TERRA)),
    Pokemon(32, "Nidoran♂", listOf(VENENOSO)),
    Pokemon(33, "Nidorino", listOf(VENENOSO)),
    Pokemon(34, "Nidoking", listOf(VENENOSO, TERRA)),
    Pokemon(35, "Clefairy", listOf(FADA)),
    Pokemon(36, "Clefable", listOf(FADA)),
    Pokemon(37, "Vulpix", listOf(FOGO)),
    Pokemon(38, "Ninetales", listOf(FOGO)),
    Pokemon(39, "Jigglypuff", listOf(NORMAL, FADA)),
    Pokemon(40, "Wigglytuff", listOf(NORMAL, FADA)),
    Pokemon(41, "Zubat", listOf(VENENOSO, VOADOR)),
    Pokemon(42, "Golbat", listOf(VENENOSO, VOADOR)),
    Pokemon(43, "Oddish", listOf(GRAMA, VENENOSO)),
    Pokemon(44, "Gloom", listOf(GRAMA, VENENOSO)),
    Pokemon(45, "Vileplume", listOf(GRAMA, VENENOSO)),
    Pokemon(46, "Paras", listOf(INSETO, GRAMA)),
    Pokemon(47, "Parasect", listOf(INSETO, GRAMA)),
    Pokemon(48, "Venonat", listOf(INSETO, VENENOSO)),
    Pokemon(49, "Venomoth", listOf(INSETO, VENENOSO)),
    Pokemon(50, "Diglett", listOf(TERRA)),
    Pokemon(51, "Dugtrio", listOf(TERRA)),
    Pokemon(52, "Meowth", listOf(NORMAL)),
    Pokemon(53, "Persian", listOf(NORMAL)),
    Pokemon(54, "Psyduck", listOf(AGUA)),
    Pokemon(55, "Golduck", listOf(AGUA)),
    Pokemon(56, "Mankey", listOf(LUTADOR)),
    Pokemon(57, "Primeape", listOf(LUTADOR)),
    Pokemon(58, "Growlithe", listOf(FOGO)),
    Pokemon(59, "Arcanine", listOf(FOGO)),
    Pokemon(60, "Poliwag", listOf(AGUA)),
    Pokemon(61, "Poliwhirl", listOf(AGUA)),
    Pokemon(62, "Poliwrath", listOf(AGUA, LUTADOR)),
    Pokemon(63, "Abra", listOf(PSIQUICO)),
    Pokemon(64, "Kadabra", listOf(PSIQUICO)),
    Pokemon(65, "Alakazam", listOf(PSIQUICO)),
    Pokemon(66, "Machop", listOf(LUTADOR)),
    Pokemon(67, "Machoke", listOf(LUTADOR)),
    Pokemon(68, "Machamp", listOf(LUTADOR)),
    Pokemon(69, "Bellsprout", listOf(GRAMA, VENENOSO)),
    Pokemon(70, "Weepinbell", listOf(GRAMA, VENENOSO)),
    Pokemon(71, "Victreebel", listOf(GRAMA, VENENOSO)),
    Pokemon(72, "Tentacool", listOf(AGUA, VENENOSO)),
    Pokemon(73, "Tentacruel", listOf(AGUA, VENENOSO)),
    Pokemon(74, "Geodude", listOf(PEDRA, TERRA)),
    Pokemon(75, "Graveler", listOf(PEDRA, TERRA)),
    Pokemon(76, "Golem", listOf(PEDRA, TERRA)),
    Pokemon(77, "Ponyta", listOf(FOGO)),
    Pokemon(78, "Rapidash", listOf(FOGO)),
    Pokemon(79, "Slowpoke", listOf(AGUA, PSIQUICO)),
    Pokemon(80, "Slowbro", listOf(AGUA, PSIQUICO)),
    Pokemon(81, "Magnemite", listOf(ELETRICO, ACO)),
    Pokemon(82, "Magneton", listOf(ELETRICO, ACO)),
    Pokemon(83, "Farfetch'd", listOf(NORMAL, VOADOR)),
    Pokemon(84, "Doduo", listOf(NORMAL, VOADOR)),
    Pokemon(85, "Dodrio", listOf(NORMAL, VOADOR)),
    Pokemon(86, "Seel", listOf(AGUA)),
    Pokemon(87, "Dewgong", listOf(AGUA, GELO)),
    Pokemon(88, "Grimer", listOf(VENENOSO)),
    Pokemon(89, "Muk", listOf(VENENOSO)),
    Pokemon(90, "Shellder", listOf(AGUA)),
    Pokemon(91, "Cloyster", listOf(AGUA, GELO)),
    Pokemon(92, "Gastly", listOf(FANTASMA, VENENOSO)),
    Pokemon(93, "Haunter", listOf(FANTASMA, VENENOSO)),
    Pokemon(94, "Gengar", listOf(FANTASMA, VENENOSO)),
    Pokemon(95, "Onix", listOf(PEDRA, TERRA)),
    Pokemon(96, "Drowzee", listOf(PSIQUICO)),
    Pokemon(97, "Hypno", listOf(PSIQUICO)),
    Pokemon(98, "Krabby", listOf(AGUA)),
    Pokemon(99, "Kingler", listOf(AGUA)),
    Pokemon(100, "Voltorb", listOf(ELETRICO)),
    Pokemon(101, "Electrode", listOf(ELETRICO)),
    Pokemon(102, "Exeggcute", listOf(GRAMA, PSIQUICO)),
    Pokemon(103, "Exeggutor", listOf(GRAMA, PSIQUICO)),
    Pokemon(104, "Cubone", listOf(TERRA)),
    Pokemon(105, "Marowak", listOf(TERRA)),
    Pokemon(106, "Hitmonlee", listOf(LUTADOR)),
    Pokemon(107, "Hitmonchan", listOf(LUTADOR)),
    Pokemon(108, "Lickitung", listOf(NORMAL)),
    Pokemon(109, "Koffing", listOf(VENENOSO)),
    Pokemon(110, "Weezing", listOf(VENENOSO)),
    Pokemon(111, "Rhyhorn", listOf(TERRA, PEDRA)),
    Pokemon(112, "Rhydon", listOf(TERRA, PEDRA)),
    Pokemon(113, "Chansey", listOf(NORMAL)),
    Pokemon(114, "Tangela", listOf(GRAMA)),
    Pokemon(115, "Kangaskhan", listOf(NORMAL)),
    Pokemon(116, "Horsea", listOf(AGUA)),
    Pokemon(117, "Seadra", listOf(AGUA)),
    Pokemon(118, "Goldeen", listOf(AGUA)),
    Pokemon(119, "Seaking", listOf(AGUA)),
    Pokemon(120, "Staryu", listOf(AGUA)),
    Pokemon(121, "Starmie", listOf(AGUA, PSIQUICO)),
    Pokemon(122, "Mr. Mime", listOf(PSIQUICO, FADA)),
    Pokemon(123, "Scyther", listOf(INSETO, VOADOR)),
    Pokemon(124, "Jynx", listOf(GELO, PSIQUICO)),
    Pokemon(125, "Electabuzz", listOf(ELETRICO)),
    Pokemon(126, "Magmar", listOf(FOGO)),
    Pokemon(127, "Pinsir", listOf(INSETO)),
    Pokemon(128, "Tauros", listOf(NORMAL)),
    Pokemon(129, "Magikarp", listOf(AGUA)),
    Pokemon(130, "Gyarados", listOf(AGUA, VOADOR)),
    Pokemon(131, "Lapras", listOf(AGUA, GELO)),
    Pokemon(132, "Ditto", listOf(NORMAL)),
    Pokemon(133, "Eevee", listOf(NORMAL)),
    Pokemon(134, "Vaporeon", listOf(AGUA)),
    Pokemon(135, "Jolteon", listOf(ELETRICO)),
    Pokemon(136, "Flareon", listOf(FOGO)),
    Pokemon(137, "Porygon", listOf(NORMAL)),
    Pokemon(138, "Omanyte", listOf(PEDRA, AGUA)),
    Pokemon(139, "Omastar", listOf(PEDRA, AGUA)),
    Pokemon(140, "Kabuto", listOf(PEDRA, AGUA)),
    Pokemon(141, "Kabutops", listOf(PEDRA, AGUA)),
    Pokemon(142, "Aerodactyl", listOf(PEDRA, VOADOR)),
    Pokemon(143, "Snorlax", listOf(NORMAL)),
    Pokemon(144, "Articuno", listOf(GELO, VOADOR)),
    Pokemon(145, "Zapdos", listOf(ELETRICO, VOADOR)),
    Pokemon(146, "Moltres", listOf(FOGO, VOADOR)),
    Pokemon(147, "Dratini", listOf(DRAGAO)),
    Pokemon(148, "Dragonair", listOf(DRAGAO)),
    Pokemon(149, "Dragonite", listOf(DRAGAO, VOADOR)),
    Pokemon(150, "Mewtwo", listOf(PSIQUICO)),
    Pokemon(151, "Mew", listOf(PSIQUICO))
)

fun criarMapaEfetividadeTipos(
    listaPokemon: List<Pokemon>,
    tabelaEfetividade: Map<String, List<String>>
): Map<List<String>, List<String>> {

    val mapaResultado = mutableMapOf<List<String>, List<String>>()

    for (pokemon in listaPokemon) {
        val chaveTipos = pokemon.tipos.sorted()

        if (!mapaResultado.containsKey(chaveTipos)) {
            val superEfetivoContraTipos = mutableSetOf<String>()

            for (tipo in pokemon.tipos) {
                val listaTiposEfetivos = tabelaEfetividade[tipo] ?: listOf()
                superEfetivoContraTipos.addAll(listaTiposEfetivos)
            }

            mapaResultado[chaveTipos] = superEfetivoContraTipos.toList().sorted()
        }
    }
    return mapaResultado
}

fun main() {
    println("--- Tabela de Efetividade (Atacante -> Super Efetivo Contra) ---")
    TABELA_EFETIVIDADE_TIPOS.forEach { (tipoAtacante, tiposDefensoresEfetivos) ->
        if (tiposDefensoresEfetivos.isNotEmpty()) {
            println("$tipoAtacante é super efetivo contra: ${tiposDefensoresEfetivos.joinToString(", ")}")
        } else {
            println("$tipoAtacante não é super efetivo contra nenhum tipo.")
        }
    }
    println("\n-------------------------------------------------------------\n")

    val efetividadeCombinacaoTiposKanto = criarMapaEfetividadeTipos(LISTA_POKEMON_KANTO, TABELA_EFETIVIDADE_TIPOS)

    println("--- Mapa de Efetividade por Combinação de Tipos em Kanto ---")
    println("(Chave: Combinação de Tipos | Valor: Tipos contra os quais a combinação é super efetiva)")

    efetividadeCombinacaoTiposKanto.forEach { (combinacaoTipos, efetivoContraTipos) ->
        val combinacaoTiposString = combinacaoTipos.joinToString(" / ")
        val efetivoContraString = if (efetivoContraTipos.isNotEmpty()) {
            efetivoContraTipos.joinToString(", ")
        } else {
            "Nenhum"
        }
        println("Tipos [ $combinacaoTiposString ] são super efetivos contra: [ $efetivoContraString ]")
    }
}