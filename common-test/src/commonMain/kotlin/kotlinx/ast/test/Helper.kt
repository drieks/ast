package kotlinx.ast.test

import kotlinx.ast.common.ast.Ast
import kotlinx.ast.common.ast.AstNode
import kotlinx.ast.common.ast.DefaultAstNode

fun node(name: String, children: List<Ast>): AstNode {
    return DefaultAstNode(name, children)
}

fun node(name: String, child: Ast): AstNode {
    return DefaultAstNode(name, listOf(child))
}
