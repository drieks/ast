// Generated from java-escape by ANTLR 4.7.1
package kotlinx.ast.grammar.kotlin.target.antlr.kotlin.generated

import com.strumenta.kotlinmultiplatform.asCharArray
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA
import kotlin.native.concurrent.ThreadLocal

class UnicodeClasses(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "UnicodeClasses.g4"

    override val atn: ATN
		get() = UnicodeClasses.Companion.ATN

    override val vocabulary: Vocabulary
        get() = UnicodeClasses.Companion.VOCABULARY

	@ThreadLocal
	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES: List<String?> = listOf()
		private val SYMBOLIC_NAMES: List<String?> = listOf(null, "UNICODE_CLASS_LL", 
		                                                   "UNICODE_CLASS_LM", 
		                                                   "UNICODE_CLASS_LO", 
		                                                   "UNICODE_CLASS_LT", 
		                                                   "UNICODE_CLASS_LU", 
		                                                   "UNICODE_CLASS_ND", 
		                                                   "UNICODE_CLASS_NL")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0009\u001f\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0002\u0002\u0009\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0003\u0002\u0009\u0248\u0002\u0063\u007c\u00b7\u00b7\u00e1\u00f8\u00fa\u0101\u0103\u0103\u0105\u0105\u0107\u0107\u0109\u0109\u010b\u010b\u010d\u010d\u010f\u010f\u0111\u0111\u0113\u0113\u0115\u0115\u0117\u0117\u0119\u0119\u011b\u011b\u011d\u011d\u011f\u011f\u0121\u0121\u0123\u0123\u0125\u0125\u0127\u0127\u0129\u0129\u012b\u012b\u012d\u012d\u012f\u012f\u0131\u0131\u0133\u0133\u0135\u0135\u0137\u0137\u0139\u013a\u013c\u013c\u013e\u013e\u0140\u0140\u0142\u0142\u0144\u0144\u0146\u0146\u0148\u0148\u014a\u014b\u014d\u014d\u014f\u014f\u0151\u0151\u0153\u0153\u0155\u0155\u0157\u0157\u0159\u0159\u015b\u015b\u015d\u015d\u015f\u015f\u0161\u0161\u0163\u0163\u0165\u0165\u0167\u0167\u0169\u0169\u016b\u016b\u016d\u016d\u016f\u016f\u0171\u0171\u0173\u0173\u0175\u0175\u0177\u0177\u0179\u0179\u017c\u017c\u017e\u017e\u0180\u0182\u0185\u0185\u0187\u0187\u018a\u018a\u018e\u018f\u0194\u0194\u0197\u0197\u019b\u019d\u01a0\u01a0\u01a3\u01a3\u01a5\u01a5\u01a7\u01a7\u01aa\u01aa\u01ac\u01ad\u01af\u01af\u01b2\u01b2\u01b6\u01b6\u01b8\u01b8\u01bb\u01bc\u01bf\u01c1\u01c8\u01c8\u01cb\u01cb\u01ce\u01ce\u01d0\u01d0\u01d2\u01d2\u01d4\u01d4\u01d6\u01d6\u01d8\u01d8\u01da\u01da\u01dc\u01dc\u01de\u01df\u01e1\u01e1\u01e3\u01e3\u01e5\u01e5\u01e7\u01e7\u01e9\u01e9\u01eb\u01eb\u01ed\u01ed\u01ef\u01ef\u01f1\u01f2\u01f5\u01f5\u01f7\u01f7\u01fb\u01fb\u01fd\u01fd\u01ff\u01ff\u0201\u0201\u0203\u0203\u0205\u0205\u0207\u0207\u0209\u0209\u020b\u020b\u020d\u020d\u020f\u020f\u0211\u0211\u0213\u0213\u0215\u0215\u0217\u0217\u0219\u0219\u021b\u021b\u021d\u021d\u021f\u021f\u0221\u0221\u0223\u0223\u0225\u0225\u0227\u0227\u0229\u0229\u022b\u022b\u022d\u022d\u022f\u022f\u0231\u0231\u0233\u0233\u0235\u023b\u023e\u023e\u0241\u0242\u0244\u0244\u0249\u0249\u024b\u024b\u024d\u024d\u024f\u024f\u0251\u0295\u0297\u02b1\u0373\u0373\u0375\u0375\u0379\u0379\u037d\u037f\u0392\u0392\u03ae\u03d0\u03d2\u03d3\u03d7\u03d9\u03db\u03db\u03dd\u03dd\u03df\u03df\u03e1\u03e1\u03e3\u03e3\u03e5\u03e5\u03e7\u03e7\u03e9\u03e9\u03eb\u03eb\u03ed\u03ed\u03ef\u03ef\u03f1\u03f5\u03f7\u03f7\u03fa\u03fa\u03fd\u03fe\u0432\u0461\u0463\u0463\u0465\u0465\u0467\u0467\u0469\u0469\u046b\u046b\u046d\u046d\u046f\u046f\u0471\u0471\u0473\u0473\u0475\u0475\u0477\u0477\u0479\u0479\u047b\u047b\u047d\u047d\u047f\u047f\u0481\u0481\u0483\u0483\u048d\u048d\u048f\u048f\u0491\u0491\u0493\u0493\u0495\u0495\u0497\u0497\u0499\u0499\u049b\u049b\u049d\u049d\u049f\u049f\u04a1\u04a1\u04a3\u04a3\u04a5\u04a5\u04a7\u04a7\u04a9\u04a9\u04ab\u04ab\u04ad\u04ad\u04af\u04af\u04b1\u04b1\u04b3\u04b3\u04b5\u04b5\u04b7\u04b7\u04b9\u04b9\u04bb\u04bb\u04bd\u04bd\u04bf\u04bf\u04c1\u04c1\u04c4\u04c4\u04c6\u04c6\u04c8\u04c8\u04ca\u04ca\u04cc\u04cc\u04ce\u04ce\u04d0\u04d1\u04d3\u04d3\u04d5\u04d5\u04d7\u04d7\u04d9\u04d9\u04db\u04db\u04dd\u04dd\u04df\u04df\u04e1\u04e1\u04e3\u04e3\u04e5\u04e5\u04e7\u04e7\u04e9\u04e9\u04eb\u04eb\u04ed\u04ed\u04ef\u04ef\u04f1\u04f1\u04f3\u04f3\u04f5\u04f5\u04f7\u04f7\u04f9\u04f9\u04fb\u04fb\u04fd\u04fd\u04ff\u04ff\u0501\u0501\u0503\u0503\u0505\u0505\u0507\u0507\u0509\u0509\u050b\u050b\u050d\u050d\u050f\u050f\u0511\u0511\u0513\u0513\u0515\u0515\u0517\u0517\u0519\u0519\u051b\u051b\u051d\u051d\u051f\u051f\u0521\u0521\u0523\u0523\u0525\u0525\u0527\u0527\u0529\u0529\u0563\u0589\u1d02\u1d2d\u1d6d\u1d79\u1d7b\u1d9c\u1e03\u1e03\u1e05\u1e05\u1e07\u1e07\u1e09\u1e09\u1e0b\u1e0b\u1e0d\u1e0d\u1e0f\u1e0f\u1e11\u1e11\u1e13\u1e13\u1e15\u1e15\u1e17\u1e17\u1e19\u1e19\u1e1b\u1e1b\u1e1d\u1e1d\u1e1f\u1e1f\u1e21\u1e21\u1e23\u1e23\u1e25\u1e25\u1e27\u1e27\u1e29\u1e29\u1e2b\u1e2b\u1e2d\u1e2d\u1e2f\u1e2f\u1e31\u1e31\u1e33\u1e33\u1e35\u1e35\u1e37\u1e37\u1e39\u1e39\u1e3b\u1e3b\u1e3d\u1e3d\u1e3f\u1e3f\u1e41\u1e41\u1e43\u1e43\u1e45\u1e45\u1e47\u1e47\u1e49\u1e49\u1e4b\u1e4b\u1e4d\u1e4d\u1e4f\u1e4f\u1e51\u1e51\u1e53\u1e53\u1e55\u1e55\u1e57\u1e57\u1e59\u1e59\u1e5b\u1e5b\u1e5d\u1e5d\u1e5f\u1e5f\u1e61\u1e61\u1e63\u1e63\u1e65\u1e65\u1e67\u1e67\u1e69\u1e69\u1e6b\u1e6b\u1e6d\u1e6d\u1e6f\u1e6f\u1e71\u1e71\u1e73\u1e73\u1e75\u1e75\u1e77\u1e77\u1e79\u1e79\u1e7b\u1e7b\u1e7d\u1e7d\u1e7f\u1e7f\u1e81\u1e81\u1e83\u1e83\u1e85\u1e85\u1e87\u1e87\u1e89\u1e89\u1e8b\u1e8b\u1e8d\u1e8d\u1e8f\u1e8f\u1e91\u1e91\u1e93\u1e93\u1e95\u1e95\u1e97\u1e9f\u1ea1\u1ea1\u1ea3\u1ea3\u1ea5\u1ea5\u1ea7\u1ea7\u1ea9\u1ea9\u1eab\u1eab\u1ead\u1ead\u1eaf\u1eaf\u1eb1\u1eb1\u1eb3\u1eb3\u1eb5\u1eb5\u1eb7\u1eb7\u1eb9\u1eb9\u1ebb\u1ebb\u1ebd\u1ebd\u1ebf\u1ebf\u1ec1\u1ec1\u1ec3\u1ec3\u1ec5\u1ec5\u1ec7\u1ec7\u1ec9\u1ec9\u1ecb\u1ecb\u1ecd\u1ecd\u1ecf\u1ecf\u1ed1\u1ed1\u1ed3\u1ed3\u1ed5\u1ed5\u1ed7\u1ed7\u1ed9\u1ed9\u1edb\u1edb\u1edd\u1edd\u1edf\u1edf\u1ee1\u1ee1\u1ee3\u1ee3\u1ee5\u1ee5\u1ee7\u1ee7\u1ee9\u1ee9\u1eeb\u1eeb\u1eed\u1eed\u1eef\u1eef\u1ef1\u1ef1\u1ef3\u1ef3\u1ef5\u1ef5\u1ef7\u1ef7\u1ef9\u1ef9\u1efb\u1efb\u1efd\u1efd\u1eff\u1eff\u1f01\u1f09\u1f12\u1f17\u1f22\u1f29\u1f32\u1f39\u1f42\u1f47\u1f52\u1f59\u1f62\u1f69\u1f72\u1f7f\u1f82\u1f89\u1f92\u1f99\u1fa2\u1fa9\u1fb2\u1fb6\u1fb8\u1fb9\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fc9\u1fd2\u1fd5\u1fd8\u1fd9\u1fe2\u1fe9\u1ff4\u1ff6\u1ff8\u1ff9\u210c\u210c\u2110\u2111\u2115\u2115\u2131\u2131\u2136\u2136\u213b\u213b\u213e\u213f\u2148\u214b\u2150\u2150\u2186\u2186\u2c32\u2c60\u2c63\u2c63\u2c67\u2c68\u2c6a\u2c6a\u2c6c\u2c6c\u2c6e\u2c6e\u2c73\u2c73\u2c75\u2c76\u2c78\u2c7d\u2c83\u2c83\u2c85\u2c85\u2c87\u2c87\u2c89\u2c89\u2c8b\u2c8b\u2c8d\u2c8d\u2c8f\u2c8f\u2c91\u2c91\u2c93\u2c93\u2c95\u2c95\u2c97\u2c97\u2c99\u2c99\u2c9b\u2c9b\u2c9d\u2c9d\u2c9f\u2c9f\u2ca1\u2ca1\u2ca3\u2ca3\u2ca5\u2ca5\u2ca7\u2ca7\u2ca9\u2ca9\u2cab\u2cab\u2cad\u2cad\u2caf\u2caf\u2cb1\u2cb1\u2cb3\u2cb3\u2cb5\u2cb5\u2cb7\u2cb7\u2cb9\u2cb9\u2cbb\u2cbb\u2cbd\u2cbd\u2cbf\u2cbf\u2cc1\u2cc1\u2cc3\u2cc3\u2cc5\u2cc5\u2cc7\u2cc7\u2cc9\u2cc9\u2ccb\u2ccb\u2ccd\u2ccd\u2ccf\u2ccf\u2cd1\u2cd1\u2cd3\u2cd3\u2cd5\u2cd5\u2cd7\u2cd7\u2cd9\u2cd9\u2cdb\u2cdb\u2cdd\u2cdd\u2cdf\u2cdf\u2ce1\u2ce1\u2ce3\u2ce3\u2ce5\u2ce6\u2cee\u2cee\u2cf0\u2cf0\u2cf5\u2cf5\u2d02\u2d27\u2d29\u2d29\u2d2f\u2d2f\ua643\ua643\ua645\ua645\ua647\ua647\ua649\ua649\ua64b\ua64b\ua64d\ua64d\ua64f\ua64f\ua651\ua651\ua653\ua653\ua655\ua655\ua657\ua657\ua659\ua659\ua65b\ua65b\ua65d\ua65d\ua65f\ua65f\ua661\ua661\ua663\ua663\ua665\ua665\ua667\ua667\ua669\ua669\ua66b\ua66b\ua66d\ua66d\ua66f\ua66f\ua683\ua683\ua685\ua685\ua687\ua687\ua689\ua689\ua68b\ua68b\ua68d\ua68d\ua68f\ua68f\ua691\ua691\ua693\ua693\ua695\ua695\ua697\ua697\ua699\ua699\ua725\ua725\ua727\ua727\ua729\ua729\ua72b\ua72b\ua72d\ua72d\ua72f\ua72f\ua731\ua733\ua735\ua735\ua737\ua737\ua739\ua739\ua73b\ua73b\ua73d\ua73d\ua73f\ua73f\ua741\ua741\ua743\ua743\ua745\ua745\ua747\ua747\ua749\ua749\ua74b\ua74b\ua74d\ua74d\ua74f\ua74f\ua751\ua751\ua753\ua753\ua755\ua755\ua757\ua757\ua759\ua759\ua75b\ua75b\ua75d\ua75d\ua75f\ua75f\ua761\ua761\ua763\ua763\ua765\ua765\ua767\ua767\ua769\ua769\ua76b\ua76b\ua76d\ua76d\ua76f\ua76f\ua771\ua771\ua773\ua77a\ua77c\ua77c\ua77e\ua77e\ua781\ua781\ua783\ua783\ua785\ua785\ua787\ua787\ua789\ua789\ua78e\ua78e\ua790\ua790\ua793\ua793\ua795\ua795\ua7a3\ua7a3\ua7a5\ua7a5\ua7a7\ua7a7\ua7a9\ua7a9\ua7ab\ua7ab\ua7fc\ua7fc\ufb02\ufb08\ufb15\ufb19\uff43\uff5c\u0035\u0002\u02b2\u02c3\u02c8\u02d3\u02e2\u02e6\u02ee\u02ee\u02f0\u02f0\u0376\u0376\u037c\u037c\u055b\u055b\u0642\u0642\u06e7\u06e8\u07f6\u07f7\u07fc\u07fc\u081c\u081c\u0826\u0826\u082a\u082a\u0973\u0973\u0e48\u0e48\u0ec8\u0ec8\u10fe\u10fe\u17d9\u17d9\u1845\u1845\u1aa9\u1aa9\u1c7a\u1c7f\u1d2e\u1d6c\u1d7a\u1d7a\u1d9d\u1dc1\u2073\u2073\u2081\u2081\u2092\u209e\u2c7e\u2c7f\u2d71\u2d71\u2e31\u2e31\u3007\u3007\u3033\u3037\u303d\u303d\u309f\u30a0\u30fe\u3100\ua017\ua017\ua4fa\ua4ff\ua60e\ua60e\ua681\ua681\ua719\ua721\ua772\ua772\ua78a\ua78a\ua7fa\ua7fb\ua9d1\ua9d1\uaa72\uaa72\uaadf\uaadf\uaaf5\uaaf6\uff72\uff72\uffa0\uffa1\u0123\u0002\u00ac\u00ac\u00bc\u00bc\u01bd\u01bd\u01c2\u01c5\u0296\u0296\u05d2\u05ec\u05f2\u05f4\u0622\u0641\u0643\u064c\u0670\u0671\u0673\u06d5\u06d7\u06d7\u06f0\u06f1\u06fc\u06fe\u0701\u0701\u0712\u0712\u0714\u0731\u074f\u07a7\u07b3\u07b3\u07cc\u07ec\u0802\u0817\u0842\u085a\u08a2\u08a2\u08a4\u08ae\u0906\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u0974\u0979\u097b\u0981\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0bd2\u0bd2\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c3f\u0c3f\u0c5a\u0c5b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0cf3\u0cf4\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d3c\u0d3f\u0d3f\u0d50\u0d50\u0d62\u0d63\u0d7c\u0d81\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e47\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ede\u0ee1\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6e\u0f8a\u0f8e\u1002\u102c\u1041\u1041\u1052\u1057\u105c\u105f\u1063\u1063\u1067\u1068\u1070\u1072\u1077\u1083\u1090\u1090\u10d2\u10fc\u10ff\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382\u1391\u13a2\u13f6\u1403\u166e\u1671\u1681\u1683\u169c\u16a2\u16ec\u1702\u170e\u1710\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17de\u17de\u1822\u1844\u1846\u1879\u1882\u18aa\u18ac\u18ac\u18b2\u18f7\u1902\u191e\u1952\u196f\u1972\u1976\u1982\u19ad\u19c3\u19c9\u1a02\u1a18\u1a22\u1a56\u1b07\u1b35\u1b47\u1b4d\u1b85\u1ba2\u1bb0\u1bb1\u1bbc\u1be7\u1c02\u1c25\u1c4f\u1c51\u1c5c\u1c79\u1ceb\u1cee\u1cf0\u1cf3\u1cf7\u1cf8\u2137\u213a\u2d32\u2d69\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u3008\u3008\u303e\u303e\u3043\u3098\u30a1\u30a1\u30a3\u30fc\u3101\u3101\u3107\u312f\u3133\u3190\u31a2\u31bc\u31f2\u3201\u3402\u3402\u4db7\u4db7\u4e02\u4e02\u9fce\u9fce\ua002\ua016\ua018\ua48e\ua4d2\ua4f9\ua502\ua60d\ua612\ua621\ua62c\ua62d\ua670\ua670\ua6a2\ua6e7\ua7fd\ua803\ua805\ua807\ua809\ua80c\ua80e\ua824\ua842\ua875\ua884\ua8b5\ua8f4\ua8f9\ua8fd\ua8fd\ua90c\ua927\ua932\ua948\ua962\ua97e\ua986\ua9b4\uaa02\uaa2a\uaa42\uaa44\uaa46\uaa4d\uaa62\uaa71\uaa73\uaa78\uaa7c\uaa7c\uaa82\uaab1\uaab3\uaab3\uaab7\uaab8\uaabb\uaabf\uaac2\uaac2\uaac4\uaac4\uaadd\uaade\uaae2\uaaec\uaaf4\uaaf4\uab03\uab08\uab0b\uab10\uab13\uab18\uab22\uab28\uab2a\uab30\uabc2\uabe4\uac02\uac02\ud7a5\ud7a5\ud7b2\ud7c8\ud7cd\ud7fd\uf902\ufa6f\ufa72\ufadb\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff68\uff71\uff73\uff9f\uffa2\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\u000c\u0002\u01c7\u01c7\u01ca\u01ca\u01cd\u01cd\u01f4\u01f4\u1f8a\u1f91\u1f9a\u1fa1\u1faa\u1fb1\u1fbe\u1fbe\u1fce\u1fce\u1ffe\u1ffe\u0242\u0002\u0043\u005c\u00c2\u00d8\u00da\u00e0\u0102\u0102\u0104\u0104\u0106\u0106\u0108\u0108\u010a\u010a\u010c\u010c\u010e\u010e\u0110\u0110\u0112\u0112\u0114\u0114\u0116\u0116\u0118\u0118\u011a\u011a\u011c\u011c\u011e\u011e\u0120\u0120\u0122\u0122\u0124\u0124\u0126\u0126\u0128\u0128\u012a\u012a\u012c\u012c\u012e\u012e\u0130\u0130\u0132\u0132\u0134\u0134\u0136\u0136\u0138\u0138\u013b\u013b\u013d\u013d\u013f\u013f\u0141\u0141\u0143\u0143\u0145\u0145\u0147\u0147\u0149\u0149\u014c\u014c\u014e\u014e\u0150\u0150\u0152\u0152\u0154\u0154\u0156\u0156\u0158\u0158\u015a\u015a\u015c\u015c\u015e\u015e\u0160\u0160\u0162\u0162\u0164\u0164\u0166\u0166\u0168\u0168\u016a\u016a\u016c\u016c\u016e\u016e\u0170\u0170\u0172\u0172\u0174\u0174\u0176\u0176\u0178\u0178\u017a\u017b\u017d\u017d\u017f\u017f\u0183\u0184\u0186\u0186\u0188\u0189\u018b\u018d\u0190\u0193\u0195\u0196\u0198\u019a\u019e\u019f\u01a1\u01a2\u01a4\u01a4\u01a6\u01a6\u01a8\u01a9\u01ab\u01ab\u01ae\u01ae\u01b0\u01b1\u01b3\u01b5\u01b7\u01b7\u01b9\u01ba\u01be\u01be\u01c6\u01c6\u01c9\u01c9\u01cc\u01cc\u01cf\u01cf\u01d1\u01d1\u01d3\u01d3\u01d5\u01d5\u01d7\u01d7\u01d9\u01d9\u01db\u01db\u01dd\u01dd\u01e0\u01e0\u01e2\u01e2\u01e4\u01e4\u01e6\u01e6\u01e8\u01e8\u01ea\u01ea\u01ec\u01ec\u01ee\u01ee\u01f0\u01f0\u01f3\u01f3\u01f6\u01f6\u01f8\u01fa\u01fc\u01fc\u01fe\u01fe\u0200\u0200\u0202\u0202\u0204\u0204\u0206\u0206\u0208\u0208\u020a\u020a\u020c\u020c\u020e\u020e\u0210\u0210\u0212\u0212\u0214\u0214\u0216\u0216\u0218\u0218\u021a\u021a\u021c\u021c\u021e\u021e\u0220\u0220\u0222\u0222\u0224\u0224\u0226\u0226\u0228\u0228\u022a\u022a\u022c\u022c\u022e\u022e\u0230\u0230\u0232\u0232\u0234\u0234\u023c\u023d\u023f\u0240\u0243\u0243\u0245\u0248\u024a\u024a\u024c\u024c\u024e\u024e\u0250\u0250\u0372\u0372\u0374\u0374\u0378\u0378\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u0391\u0393\u03a3\u03a5\u03ad\u03d1\u03d1\u03d4\u03d6\u03da\u03da\u03dc\u03dc\u03de\u03de\u03e0\u03e0\u03e2\u03e2\u03e4\u03e4\u03e6\u03e6\u03e8\u03e8\u03ea\u03ea\u03ec\u03ec\u03ee\u03ee\u03f0\u03f0\u03f6\u03f6\u03f9\u03f9\u03fb\u03fc\u03ff\u0431\u0462\u0462\u0464\u0464\u0466\u0466\u0468\u0468\u046a\u046a\u046c\u046c\u046e\u046e\u0470\u0470\u0472\u0472\u0474\u0474\u0476\u0476\u0478\u0478\u047a\u047a\u047c\u047c\u047e\u047e\u0480\u0480\u0482\u0482\u048c\u048c\u048e\u048e\u0490\u0490\u0492\u0492\u0494\u0494\u0496\u0496\u0498\u0498\u049a\u049a\u049c\u049c\u049e\u049e\u04a0\u04a0\u04a2\u04a2\u04a4\u04a4\u04a6\u04a6\u04a8\u04a8\u04aa\u04aa\u04ac\u04ac\u04ae\u04ae\u04b0\u04b0\u04b2\u04b2\u04b4\u04b4\u04b6\u04b6\u04b8\u04b8\u04ba\u04ba\u04bc\u04bc\u04be\u04be\u04c0\u04c0\u04c2\u04c3\u04c5\u04c5\u04c7\u04c7\u04c9\u04c9\u04cb\u04cb\u04cd\u04cd\u04cf\u04cf\u04d2\u04d2\u04d4\u04d4\u04d6\u04d6\u04d8\u04d8\u04da\u04da\u04dc\u04dc\u04de\u04de\u04e0\u04e0\u04e2\u04e2\u04e4\u04e4\u04e6\u04e6\u04e8\u04e8\u04ea\u04ea\u04ec\u04ec\u04ee\u04ee\u04f0\u04f0\u04f2\u04f2\u04f4\u04f4\u04f6\u04f6\u04f8\u04f8\u04fa\u04fa\u04fc\u04fc\u04fe\u04fe\u0500\u0500\u0502\u0502\u0504\u0504\u0506\u0506\u0508\u0508\u050a\u050a\u050c\u050c\u050e\u050e\u0510\u0510\u0512\u0512\u0514\u0514\u0516\u0516\u0518\u0518\u051a\u051a\u051c\u051c\u051e\u051e\u0520\u0520\u0522\u0522\u0524\u0524\u0526\u0526\u0528\u0528\u0533\u0558\u10a2\u10c7\u10c9\u10c9\u10cf\u10cf\u1e02\u1e02\u1e04\u1e04\u1e06\u1e06\u1e08\u1e08\u1e0a\u1e0a\u1e0c\u1e0c\u1e0e\u1e0e\u1e10\u1e10\u1e12\u1e12\u1e14\u1e14\u1e16\u1e16\u1e18\u1e18\u1e1a\u1e1a\u1e1c\u1e1c\u1e1e\u1e1e\u1e20\u1e20\u1e22\u1e22\u1e24\u1e24\u1e26\u1e26\u1e28\u1e28\u1e2a\u1e2a\u1e2c\u1e2c\u1e2e\u1e2e\u1e30\u1e30\u1e32\u1e32\u1e34\u1e34\u1e36\u1e36\u1e38\u1e38\u1e3a\u1e3a\u1e3c\u1e3c\u1e3e\u1e3e\u1e40\u1e40\u1e42\u1e42\u1e44\u1e44\u1e46\u1e46\u1e48\u1e48\u1e4a\u1e4a\u1e4c\u1e4c\u1e4e\u1e4e\u1e50\u1e50\u1e52\u1e52\u1e54\u1e54\u1e56\u1e56\u1e58\u1e58\u1e5a\u1e5a\u1e5c\u1e5c\u1e5e\u1e5e\u1e60\u1e60\u1e62\u1e62\u1e64\u1e64\u1e66\u1e66\u1e68\u1e68\u1e6a\u1e6a\u1e6c\u1e6c\u1e6e\u1e6e\u1e70\u1e70\u1e72\u1e72\u1e74\u1e74\u1e76\u1e76\u1e78\u1e78\u1e7a\u1e7a\u1e7c\u1e7c\u1e7e\u1e7e\u1e80\u1e80\u1e82\u1e82\u1e84\u1e84\u1e86\u1e86\u1e88\u1e88\u1e8a\u1e8a\u1e8c\u1e8c\u1e8e\u1e8e\u1e90\u1e90\u1e92\u1e92\u1e94\u1e94\u1e96\u1e96\u1ea0\u1ea0\u1ea2\u1ea2\u1ea4\u1ea4\u1ea6\u1ea6\u1ea8\u1ea8\u1eaa\u1eaa\u1eac\u1eac\u1eae\u1eae\u1eb0\u1eb0\u1eb2\u1eb2\u1eb4\u1eb4\u1eb6\u1eb6\u1eb8\u1eb8\u1eba\u1eba\u1ebc\u1ebc\u1ebe\u1ebe\u1ec0\u1ec0\u1ec2\u1ec2\u1ec4\u1ec4\u1ec6\u1ec6\u1ec8\u1ec8\u1eca\u1eca\u1ecc\u1ecc\u1ece\u1ece\u1ed0\u1ed0\u1ed2\u1ed2\u1ed4\u1ed4\u1ed6\u1ed6\u1ed8\u1ed8\u1eda\u1eda\u1edc\u1edc\u1ede\u1ede\u1ee0\u1ee0\u1ee2\u1ee2\u1ee4\u1ee4\u1ee6\u1ee6\u1ee8\u1ee8\u1eea\u1eea\u1eec\u1eec\u1eee\u1eee\u1ef0\u1ef0\u1ef2\u1ef2\u1ef4\u1ef4\u1ef6\u1ef6\u1ef8\u1ef8\u1efa\u1efa\u1efc\u1efc\u1efe\u1efe\u1f00\u1f00\u1f0a\u1f11\u1f1a\u1f1f\u1f2a\u1f31\u1f3a\u1f41\u1f4a\u1f4f\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f61\u1f6a\u1f71\u1fba\u1fbd\u1fca\u1fcd\u1fda\u1fdd\u1fea\u1fee\u1ffa\u1ffd\u2104\u2104\u2109\u2109\u210d\u210f\u2112\u2114\u2117\u2117\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2132\u2135\u2140\u2141\u2147\u2147\u2185\u2185\u2c02\u2c30\u2c62\u2c62\u2c64\u2c66\u2c69\u2c69\u2c6b\u2c6b\u2c6d\u2c6d\u2c6f\u2c72\u2c74\u2c74\u2c77\u2c77\u2c80\u2c82\u2c84\u2c84\u2c86\u2c86\u2c88\u2c88\u2c8a\u2c8a\u2c8c\u2c8c\u2c8e\u2c8e\u2c90\u2c90\u2c92\u2c92\u2c94\u2c94\u2c96\u2c96\u2c98\u2c98\u2c9a\u2c9a\u2c9c\u2c9c\u2c9e\u2c9e\u2ca0\u2ca0\u2ca2\u2ca2\u2ca4\u2ca4\u2ca6\u2ca6\u2ca8\u2ca8\u2caa\u2caa\u2cac\u2cac\u2cae\u2cae\u2cb0\u2cb0\u2cb2\u2cb2\u2cb4\u2cb4\u2cb6\u2cb6\u2cb8\u2cb8\u2cba\u2cba\u2cbc\u2cbc\u2cbe\u2cbe\u2cc0\u2cc0\u2cc2\u2cc2\u2cc4\u2cc4\u2cc6\u2cc6\u2cc8\u2cc8\u2cca\u2cca\u2ccc\u2ccc\u2cce\u2cce\u2cd0\u2cd0\u2cd2\u2cd2\u2cd4\u2cd4\u2cd6\u2cd6\u2cd8\u2cd8\u2cda\u2cda\u2cdc\u2cdc\u2cde\u2cde\u2ce0\u2ce0\u2ce2\u2ce2\u2ce4\u2ce4\u2ced\u2ced\u2cef\u2cef\u2cf4\u2cf4\ua642\ua642\ua644\ua644\ua646\ua646\ua648\ua648\ua64a\ua64a\ua64c\ua64c\ua64e\ua64e\ua650\ua650\ua652\ua652\ua654\ua654\ua656\ua656\ua658\ua658\ua65a\ua65a\ua65c\ua65c\ua65e\ua65e\ua660\ua660\ua662\ua662\ua664\ua664\ua666\ua666\ua668\ua668\ua66a\ua66a\ua66c\ua66c\ua66e\ua66e\ua682\ua682\ua684\ua684\ua686\ua686\ua688\ua688\ua68a\ua68a\ua68c\ua68c\ua68e\ua68e\ua690\ua690\ua692\ua692\ua694\ua694\ua696\ua696\ua698\ua698\ua724\ua724\ua726\ua726\ua728\ua728\ua72a\ua72a\ua72c\ua72c\ua72e\ua72e\ua730\ua730\ua734\ua734\ua736\ua736\ua738\ua738\ua73a\ua73a\ua73c\ua73c\ua73e\ua73e\ua740\ua740\ua742\ua742\ua744\ua744\ua746\ua746\ua748\ua748\ua74a\ua74a\ua74c\ua74c\ua74e\ua74e\ua750\ua750\ua752\ua752\ua754\ua754\ua756\ua756\ua758\ua758\ua75a\ua75a\ua75c\ua75c\ua75e\ua75e\ua760\ua760\ua762\ua762\ua764\ua764\ua766\ua766\ua768\ua768\ua76a\ua76a\ua76c\ua76c\ua76e\ua76e\ua770\ua770\ua77b\ua77b\ua77d\ua77d\ua77f\ua780\ua782\ua782\ua784\ua784\ua786\ua786\ua788\ua788\ua78d\ua78d\ua78f\ua78f\ua792\ua792\ua794\ua794\ua7a2\ua7a2\ua7a4\ua7a4\ua7a6\ua7a6\ua7a8\ua7a8\ua7aa\ua7aa\ua7ac\ua7ac\uff23\uff3c\u0025\u0002\u0032\u003b\u0662\u066b\u06f2\u06fb\u07c2\u07cb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be8\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b\u1092\u109b\u17e2\u17eb\u1812\u181b\u1948\u1951\u19d2\u19db\u1a82\u1a8b\u1a92\u1a9b\u1b52\u1b5b\u1bb2\u1bbb\u1c42\u1c4b\u1c52\u1c5b\ua622\ua62b\ua8d2\ua8db\ua902\ua90b\ua9d2\ua9db\uaa52\uaa5b\uabf2\uabfb\uff12\uff1b\u0009\u0002\u16f0\u16f2\u2162\u2184\u2187\u218a\u3009\u3009\u3023\u302b\u303a\u303c\ua6e8\ua6f1\u0002\u001e\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0003\u0011\u0003\u0002\u0002\u0002\u0005\u0013\u0003\u0002\u0002\u0002\u0007\u0015\u0003\u0002\u0002\u0002\u0009\u0017\u0003\u0002\u0002\u0002\u000b\u0019\u0003\u0002\u0002\u0002\u000d\u001b\u0003\u0002\u0002\u0002\u000f\u001d\u0003\u0002\u0002\u0002\u0011\u0012\u0009\u0002\u0002\u0002\u0012\u0004\u0003\u0002\u0002\u0002\u0013\u0014\u0009\u0003\u0002\u0002\u0014\u0006\u0003\u0002\u0002\u0002\u0015\u0016\u0009\u0004\u0002\u0002\u0016\u0008\u0003\u0002\u0002\u0002\u0017\u0018\u0009\u0005\u0002\u0002\u0018\u000a\u0003\u0002\u0002\u0002\u0019\u001a\u0009\u0006\u0002\u0002\u001a\u000c\u0003\u0002\u0002\u0002\u001b\u001c\u0009\u0007\u0002\u0002\u001c\u000e\u0003\u0002\u0002\u0002\u001d\u001e\u0009\u0008\u0002\u0002\u001e\u0010\u0003\u0002\u0002\u0002\u0003\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    UNICODE_CLASS_LL(1),
	    UNICODE_CLASS_LM(2),
	    UNICODE_CLASS_LO(3),
	    UNICODE_CLASS_LT(4),
	    UNICODE_CLASS_LU(5),
	    UNICODE_CLASS_ND(6),
	    UNICODE_CLASS_NL(7)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	override val channelNames = Channels.values().map(Channels::name).toTypedArray()

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    UNICODE_CLASS_LL,
	    UNICODE_CLASS_LM,
	    UNICODE_CLASS_LO,
	    UNICODE_CLASS_LT,
	    UNICODE_CLASS_LU,
	    UNICODE_CLASS_ND,
	    UNICODE_CLASS_NL
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}