class ConteudoEducacional(val nome: String)

class Aluno(val nome: String)

enum class Nivel {
    BASICO, INTERMEDIARIO, DIFICIL
}

class Formacao(val nome: String, val nivel: Nivel) {
    private val conteudosEducacionais = mutableListOf<ConteudoEducacional>()
    private val alunosMatriculados = mutableListOf<Aluno>()

    fun adicionarConteudoEducacional(conteudoEducacional: ConteudoEducacional) {
        conteudosEducacionais.add(conteudoEducacional)
    }

    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
        println("Aluno ${aluno.nome} matriculado com sucesso na formação $nome.")
    }

    fun exibirDetalhes() {
        println("Formação: $nome - Nível: $nivel")
        println("Conteúdos Educacionais:")
        conteudosEducacionais.forEach { conteudo -> println(" - ${conteudo.nome}") }
        println("Alunos Matriculados:")
        alunosMatriculados.forEach { aluno -> println(" - ${aluno.nome}") }
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Kotlin Básico")
    val conteudo2 = ConteudoEducacional("Desenvolvimento Android")
    val formacaoAndroid = Formacao("Desenvolvimento de Apps Android", Nivel.INTERMEDIARIO)

    formacaoAndroid.adicionarConteudoEducacional(conteudo1)
    formacaoAndroid.adicionarConteudoEducacional(conteudo2)

    val aluno1 = Aluno("Ana Silva")
    val aluno2 = Aluno("João Pedro")

    formacaoAndroid.matricularAluno(aluno1)
    formacaoAndroid.matricularAluno(aluno2)

    formacaoAndroid.exibirDetalhes()
}