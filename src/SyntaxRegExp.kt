import SyntaxType.*

object SyntaxRegExp {

    private val functionDefinition = Regex("function ")
    private val phpInitFile = Regex("^<\\?php$")
    private val phpFinishFile = Regex("\\?>")
    private val functionReturn = Regex("return ")
    private val mathOperation = Regex("[A-Za-z0-9]+[ ][+|-|*|/|][ ]+[A-Za-z0-9]")
    private val closingKey = Regex("}$")
    private val forKey = Regex("for \\(")
    private val ifKey = Regex("if \\(")
    private val variableDefinition = Regex("\\$[A-Za-z0-9]+[ |=]")
    private val emptyLine = Regex("^$")
    private val functionCall = Regex("[A-Za-z0-9]+[(]+([A-Za-z0-9]|[^\\$])+[);]")

    fun getSintaxRotulate(line: String): SyntaxType {
        if (functionDefinition.containsMatchIn(line)) return FUNCTION_DEFINITION
        if (phpInitFile.containsMatchIn(line)) return PHP_INIT
        if (phpFinishFile.containsMatchIn(line)) return PHP_FINISH
        if (functionReturn.containsMatchIn(line)) return RETURN
        if (mathOperation.containsMatchIn(line)) return MATH_OPERATION
        if (forKey.containsMatchIn(line)) return FOR_KEY
        if (ifKey.containsMatchIn(line)) return IF_KEY
        if (variableDefinition.containsMatchIn(line)) return VARIABLE_DEFINITION
        if (functionCall.containsMatchIn(line)) return FUNCTION_CALL
        if (closingKey.containsMatchIn(line)) return CLOSE_KEY
        if (emptyLine.containsMatchIn(line)) return EMPTY_LINE

        return NOT_RECOGNIZED_LINE
    }
}