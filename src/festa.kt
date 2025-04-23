fun main() {
    val convidados = mutableListOf<String>()

    while (true) {
        println(
            """
            |Menu:
            |1. Cadastrar
            |2. Editar
            |3. Excluir
            |4. Buscar
            |5. Sair
            |Escolha uma opção:
            """.trimMargin()
        )
        when (readln()) {
            "1" -> cadastrar(convidados)
            "2" -> editar(convidados)
            "3" -> excluir(convidados)
            "4" -> buscar(convidados)
            "5" -> return println("Encerrando o programa.")
            else -> println("Opção inválida! Tente novamente.")
        }
    }
}

fun cadastrar(lista: MutableList<String>) {
    val nome = solicitarInput("Digite o nome (somente letras):", "^[a-zA-Z]+$".toRegex())
    lista.add(nome)
    println("Nome '$nome' cadastrado com sucesso!")
}

fun editar(lista: MutableList<String>) {
    if (lista.isEmpty()) return println("A lista está vazia.")

    val index = solicitarIndice(lista.size, "editar")
    println("Convidado atual: ${lista[index]}")
    val novoNome = solicitarInput("Digite o novo nome:", "^[a-zA-Z]+$".toRegex())

    if (confirmar("Deseja confirmar a edição? (S/N):")) {
        lista[index] = novoNome
        println("Convidado atualizado para: $novoNome")
    } else println("Edição cancelada.")
}

fun excluir(lista: MutableList<String>) {
    if (lista.isEmpty()) return println("A lista está vazia.")

    val index = solicitarIndice(lista.size, "excluir")
    val removido = lista.removeAt(index)
    println("Convidado '$removido' excluído com sucesso!")
}

fun buscar(lista: MutableList<String>) {
    if (lista.isEmpty()) return println("A lista está vazia.")

    val termo = solicitarInput("Digite o termo de busca:", "^[a-zA-Z]+$".toRegex()).lowercase()
    val encontrados = lista.filter { it.lowercase().contains(termo) }

    if (encontrados.isEmpty()) {
        println("Nenhum convidado encontrado com o nome '$termo'.")
    } else {
        println("Convidado(s) encontrado(s): ${encontrados.joinToString(", ")}")
    }
}

// Funções auxiliares

fun solicitarInput(mensagem: String, regex: Regex): String {
    while (true) {
        println(mensagem)
        val entrada = readln()
        if (regex.matches(entrada)) return entrada
        println("Entrada inválida.")
    }
}

fun solicitarIndice(tamanho: Int, acao: String): Int {
    while (true) {
        println("Digite a posição do convidado para $acao:")
        val entrada = readln()
        if (entrada.all { it.isDigit() }) {
            val index = entrada.toInt()
            if (index in 0 until tamanho) return index
        }
        println("Índice inválido.")
    }
}

fun confirmar(mensagem: String): Boolean {
    while (true) {
        println(mensagem)
        return when (readln().trim().uppercase()) {
            "S" -> true
            "N" -> false
            else -> {
                println("Digite apenas S ou N.")
                continue
            }
        }
    }
}