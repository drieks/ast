package kotlinx.ast.grammar.antlr4.test

import kotlinx.ast.common.AstChannel
import kotlinx.ast.common.ast.DefaultAstTerminal
import kotlinx.ast.grammar.antlr4.common.Antlr4GrammarAstChannels

fun terminal(
    name: String,
    text: String,
    channel: AstChannel = Antlr4GrammarAstChannels.default
): DefaultAstTerminal {
    return DefaultAstTerminal(name, text, channel)
}
