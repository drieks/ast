package kotlinx.ast.common.ast

object AstAttachmentAstInfo : AstAttachment

interface AstWithAstInfo : AstWithAttachments {
    val info: AstInfo?
        get() = attachments[AstAttachmentAstInfo]

    fun withAstInfo(info: AstInfo?): AstWithAttachments {
        return attach(AstAttachmentAstInfo, info.validOrNull)
    }
}

val Ast.astInfoOrNull: AstInfo?
    get() {
        return if (this is AstWithAstInfo) {
            info
        } else {
            null
        }
    }

interface AstSelfTypedWithAstInfo<Self> : AstSelfTypedWithAttachments<Self>, AstWithAstInfo
        where Self : AstSelfTypedWithAttachments<Self>, Self : AstWithAstInfo {
    override fun withAstInfo(info: AstInfo?): Self {
        return attach(AstAttachmentAstInfo, info.validOrNull)
    }
}
