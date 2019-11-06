package kotlinx.ast.grammar.kotlin.test.klass

import kotlinx.ast.grammar.kotlin.common.KotlinGrammarParser
import kotlinx.ast.grammar.kotlin.common.KotlinGrammarParserType
import kotlinx.ast.test.node

abstract class AbstractSpaceTest<Parser : KotlinGrammarParser<*, *>>(parser: Parser) : AbstractKlassTest<Parser>(
    parser,
    " ",
    TestCase(
        parserTypes = listOf(
            KotlinGrammarParserType.importList
        ),
        print = """
                importList
                  WS >>> <<< (HIDDEN)
                """.trimIndent(),
        summary = listOf(
            node("importList", emptyList())
        )
    )
)
