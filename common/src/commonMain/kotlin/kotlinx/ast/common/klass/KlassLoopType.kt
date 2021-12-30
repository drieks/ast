package kotlinx.ast.common.klass

data class KlassLoopType(
    val rawName: String
) {

    companion object {
        val For = KlassLoopType("For")
        val While = KlassLoopType("While")
        val DoWhile = KlassLoopType("DoWhile")
    }
}
