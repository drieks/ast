package kotlinx.ast.grammar.kotlin.test

import io.kotest.assertions.fail
import kotlinx.ast.common.AstFailure
import kotlinx.ast.common.AstSuccess
import kotlinx.ast.grammar.kotlin.common.KotlinGrammarParser
import kotlinx.ast.grammar.kotlin.common.summary
import kotlinx.ast.test.pathMap
import kotlinx.ast.test.pathOf

abstract class AbstractKotlinGrammarParserSelfTest<Parser : KotlinGrammarParser<*, *>>(
    parser: Parser
) : kotlinx.ast.test.AbstractDirectoryTest({ _, source ->
    when (val summary = parser.parseKotlinFile(source).summary(attachRawAst = false)) {
        is AstSuccess -> {
            // test succeeded
        }
        is AstFailure -> {
            fail(summary.errors.joinToString("\n"))
        }
        else ->
            fail("unexpected AstResult $summary")
    }
}, pathOf(".").pathMap(".kt"))
