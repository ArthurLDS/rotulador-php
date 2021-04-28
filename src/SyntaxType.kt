
enum class SyntaxType(val description: String, val regex: Regex) {

    FUNCTION_DEFINITION("Definição de função", Regex(" function ")),
    PHP_INIT("Iniciado arquivo PHP", Regex("^<\\?php$")),
    PHP_FINISH("Fechamento de arquivo PHP", Regex("\\?>")),
    RETURN("Retorno de valor", Regex(" return ")),
    MATH_OPERATION("Operação Matemática", Regex("[A-Za-z0-9]+[ ][+|-|*|/|][ ]+[A-Za-z0-9]")),
    CLOSE_KEY("Fechamento de bloco de código", Regex("}$")),
    FOR_KEY("Estrutura de controle de repetição", Regex("for \\(")),
    IF_KEY("Estrutura de controle condicional", Regex("if \\(")),
    VARIABLE_DEFINITION("Declaração de variável", Regex("\\$[A-Za-z0-9]+[ |=]")),
    FUNCTION_CALL("Chamada de função", Regex("[A-Za-z0-9]+[(]+([\\$+A-Za-z0-9]|[^\\$])+[);]")),
    EMPTY_LINE("Linha vazia", Regex("^$"));

    companion object {
        fun getSyntaxLabel(line: String) = values().first {
            it.regex?.containsMatchIn(line)
        }
    }
}
