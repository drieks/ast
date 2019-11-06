package kotlinx.ast.grammar.kotlin.test.klass

import kotlinx.ast.common.AstChannel
import kotlinx.ast.common.ast.DefaultAstTerminal
import kotlinx.ast.grammar.kotlin.common.KotlinGrammarAstChannels

internal fun terminal(
    name: String,
    text: String,
    channel: AstChannel = KotlinGrammarAstChannels.default
): DefaultAstTerminal {
    return DefaultAstTerminal(name, text, channel)
}
