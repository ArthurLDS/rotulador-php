enum class SyntaxType(val description: String) {
    FUNCTION_DEFINITION("Definição de função"),
    PHP_INIT("Iniciado arquivo PHP"),
    PHP_FINISH("Fechamento de arquivo PHP"),
    RETURN("Retorno de valor"),
    MATH_OPERATION("Operação Matemática"),
    CLOSE_KEY("Fechamento de bloco de código"),
    FOR_KEY("Estrutura de controle de repetição"),
    IF_KEY("Estrutura de controle condicional"),
    VARIABLE_DEFINITION("Declaração de variável"),
    NOT_RECOGNIZED_LINE("Linha não reconhecida"),
    FUNCTION_CALL("Chamada de função"),
    EMPTY_LINE("Linha vazia");
}


