package net.prosavage.factionsx.persist.data

object Grid {

    @Transient
    private val instance = this

    var claimGrid = HashMap<FLocation, Long>()

    fun save() {
        //Serializer(true).save(instance)
    }

    fun load() {
        //Serializer(true).load(instance, Grid::class.java, "grid")
    }
}