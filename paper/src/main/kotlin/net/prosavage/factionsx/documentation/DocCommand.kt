package net.prosavage.factionsx.documentation

data class DocCommand(
    val name: String,
    val aliases: List<String>,
    val helpInfo: String,
    val children: MutableList<DocCommand> = mutableListOf()
) {
    fun addChild(docCommand: DocCommand) {
        children.add(docCommand)
    }
}