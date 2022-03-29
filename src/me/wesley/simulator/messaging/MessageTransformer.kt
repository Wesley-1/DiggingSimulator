package me.wesley.simulator.messaging

class MessageTransformer(var type : MessageType) {

    fun transform() {
        when (type) {
            MessageType.DIG -> listOf(
                "#################################",
                "DIGGING HAS STARTED",
                "#################################"
            )
        }
    }
}