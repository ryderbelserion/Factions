package net.prosavage.factionsx.persist.config.gui

import net.prosavage.factionsx.FactionsX
import net.prosavage.factionsx.persist.IConfigFile
import net.prosavage.factionsx.util.*
import org.apache.commons.lang.WordUtils
import org.bukkit.Material

object PermsGUIConfig : IConfigFile {

    @Transient
    private val instance = this

    var mainMenuTitle = "&aPermissions"
    var mainMenuRows = 4
    var mainMenuBackgroundItem = SerializableItem(
            Material.BLACK_STAINED_GLASS_PANE,
            "&c",
            listOf(),
            1
    )

    var mainMenuRelationItems = mutableMapOf(
            Relation.NEUTRAL to InterfaceItem(
                    false,
                    Coordinate(1, 2),
                    SerializableItem(
                            Material.WHITE_TULIP,
                            "&7Edit perms for &fneutral&7 factions.",
                            listOf(
                                    "&7Affects permissions for any &fneutral&7 faction.",
                                    "&7This is the default relation."
                            ),
                            1
                    )
            ),
            Relation.ENEMY to InterfaceItem(
                    false,
                    Coordinate(1, 3),
                    SerializableItem(
                            Material.BLAZE_POWDER,
                            "&7Edit perms for &cenemy&7 factions.",
                            listOf(
                                    "&7Affects permissions for &cenemy&7 factions."
                            ),
                            1
                    )
            ),
            Relation.ALLY to InterfaceItem(
                    false,
                    Coordinate(1, 5),
                    SerializableItem(
                            Material.PINK_TULIP,
                            "&7Edit perms for &dally&7 factions.",
                            listOf(
                                    "&7Affects permissions for &dally&7 factions."
                            ),
                            1
                    )
            ),
            Relation.TRUCE to InterfaceItem(
                    false,
                    Coordinate(1, 6),
                    SerializableItem(
                            Material.ALLIUM,
                            "&7Edit perms for &5truce&7 factions.",
                            listOf(
                                    "&7Affects permissions for &5truce&7 factions."
                            ),
                            1
                    )
            )
    )

    var mainMenuRoleInterfaceItem = RoleInterfaceItem(
            hideItem = false,
            name = "&7{role-tag}",
            lore = listOf(
                    "&7Edit permissions for {role-tag}."
            )
    )

    var mainMenuPreviousPageItem = InterfaceItem(
            false,
            Coordinate(2, 1),
            SerializableItem(
                    Material.STONE_BUTTON,
                    "&7Previous Page",
                    listOf("&7View roles on the previous page."),
                    1
            )
    )

    var mainMenuNextPageItem = InterfaceItem(
            false,
            Coordinate(2, 7),
            SerializableItem(
                    Material.STONE_BUTTON,
                    "&7Next Page",
                    listOf("&7View roles on the next page."),
                    1
            )
    )

    var roleItemsPerPage = 3
    var roleItemsStartCoordinate = Coordinate(2, 3)

    var hurtPlayerAction = "hurt_players"
    var hurtMobsAction = "hurt_mobs"
    var buttonAction = "push_buttons"
    var leverAction = "flip_levers"
    var pressurePlateAction = "stand_on_pressure_plates"
    var fenceGateAction = "use_fence_gates"
    var trapdoorAction = "use_trapdoors"
    var hookAction = "use_hooks"
    var hopperAction = "open_hoppers"
    var lecternAction = "use_lecterns"
    var comparatorAction = "use_comparators"
    var repeaterAction = "use_repeaters"
    var dispenserAction = "use_dispensers"
    var doorAction = "use_doors"
    var chestAction = "open_chests"
    var shulkerAction = "open_shulker_box"
    var barrelAction = "open_barrels"
    var enderChestAction = "open_enderchest"
    var anvilAction = "use_anvil"
    var brewingStandAction = "use_brewing_stand"
    var enchantingTableAction = "use_enchanting_table"
    var dropperAction = "use_dropper"
    var furnaceAction = "use_furnace"
    var cauldronAction = "use_cauldron"
    var spawnEggAction = "use_spawn_eggs"
    var breakBlockAction = "break_blocks"
    var placeBlockAction = "place_blocks"
    var emptyBucketAction = "empty_buckets"
    var fillBucketAction = "fill_buckets"
    var blackListedBlockAction = "use_blacklisted_blocks"
    var useEntityAction = "use_entity"
    var trampleSoilAction = "trample_soil"
    var useGadgetAction = "use_gadget"
    var damageGadgetAction = "damage_gadget"

    var hurtPlayerActionIcon = Material.IRON_SWORD
    var hurtMobActionIcon = Material.BONE
    var buttonActionIcon = Material.STONE_BUTTON
    var leverActionIcon = Material.LEVER
    var pressurePlaceActionIcon = Material.STONE_PRESSURE_PLATE
    var fenceGateActionIcon = Material.OAK_FENCE_GATE
    var trapdoorActionIcon = Material.OAK_TRAPDOOR
    var hookActionIcon = Material.TRIPWIRE_HOOK
    var hopperActionIcon = Material.HOPPER
    var lecternActionIcon = Material.BOOKSHELF
    var comparatorActionIcon = Material.COMPARATOR
    var repeaterActionIcon = Material.REPEATER
    var dispenserActionIcon = Material.DISPENSER
    var doorActionIcon = Material.OAK_DOOR
    var chestActionIcon = Material.CHEST
    var shulkerActionIcon = Material.SHULKER_BOX
    var barrelActionIcon = Material.BARREL
    var enderChestActionIcon = Material.ENDER_CHEST
    var anvilActionIcon = Material.ANVIL
    var brewingStandActionIcon = Material.BREWING_STAND
    var enchantingTableActionIcon = Material.ENCHANTING_TABLE
    var furnanceActionIcon = Material.FURNACE
    var dropperActionIcon = Material.DROPPER
    var cauldronActionIcon = Material.CAULDRON
    var spawnEggActionIcon = Material.EGG
    var breakBlockActionIcon = Material.DIAMOND_PICKAXE
    var placeBlockActionIcon = Material.OAK_PLANKS
    var emptyBucketActionIcon = Material.BUCKET
    var fillBucketActionIcon = Material.WATER_BUCKET
    var blackListedBlocksActionIcon = Material.BEDROCK
    var useEntityActionIcon = Material.CREEPER_SPAWN_EGG
    var trampleSoilActionIcon = Material.LEATHER_BOOTS
    var useGadgetActionIcon = Material.ITEM_FRAME
    var damageGadgetActionIcon = Material.ARMOR_STAND

    var kickActionIcon = Material.LEATHER_BOOTS
    var disbandActionIcon = Material.TNT
    var inviteActionIcon = Material.WRITABLE_BOOK
    var deInviteActionIcon = Material.WRITTEN_BOOK
    var demoteActionIcon = Material.IRON_BARS
    var prefixActionIcon = Material.CYAN_DYE
    var renameActionIcon = Material.NAME_TAG
    var unClaimAllActionIcon = Material.MYCELIUM
    var changeDescriptionActionIcon = Material.GREEN_DYE
    var flyActionIcon = Material.FEATHER
    var homeActionIcon = Material.COMPASS
    var setHomeActionIcon = Material.RED_BED
    var claimActionIcon = Material.GRASS_BLOCK
    var unClaimActionIcon = Material.COARSE_DIRT
    var warpActionIcon = Material.ENDER_PEARL
    var setWarpActionIcon = Material.BEACON
    var delWarpActionIcon = Material.FIRE_CHARGE
    var viewWarpPasswordIcon = Material.ENDER_EYE
    var relationActionIcon = Material.ARROW
    var promoteActionIcon = Material.LADDER
    var openActionIcon = Material.CLOCK
    var paypalActionIcon = Material.GOLD_INGOT
    var discordActionIcon = Material.DIAMOND
    var bankWithdrawIcon = Material.SUNFLOWER
    var bankDepositIcon = Material.FEATHER
    var bankPayIcon = Material.GOLD_NUGGET
    var bankLogsIcon = Material.PAPER
    var altsInviteIcon = Material.PLAYER_HEAD
    var altsKickIcon = Material.WOODEN_SWORD
    var altsRevokeIcon = Material.BARRIER
    var altsOpenIcon = Material.OAK_DOOR
    var altsCloseIcon = Material.IRON_DOOR
    var altsInvitesIcon = Material.MAP
    var altsListIcon = Material.FILLED_MAP
    var accessFactionsIcon = Material.DIAMOND_SWORD
    var accessPlayersIcon = Material.PLAYER_HEAD
    var upgradeIcon = Material.ENCHANTED_BOOK

    var permsMenuStatusPlaceholderLocked = "&4&lLOCKED BY SERVER"
    var permsMenuStatusPlaceholderTrue = "&a&lALLOWED"
    var permsMenuStatusPlaceholderFalse = "&c&lDENIED"

    var relationMenuTitle = "{relation} permissions."
    var relationMenuRows = 5
    var relationMenuBackgroundItem = SerializableItem(
            Material.BLACK_STAINED_GLASS_PANE,
            "&c",
            listOf(),
            1
    )

    var relationMenuSpecialItems = listOf(
            CommandInterfaceItem(
                    listOf("/f perms"),
                    InterfaceItem(
                            false,
                            Coordinate(4, 8),
                            SerializableItem(
                                    Material.OAK_DOOR,
                                    "&cBack",
                                    listOf("&7Click to go back to &cmain menu&7."),
                                    1
                            )
                    )
            )
    )

    var relationMenuItems = hashMapOf<PlayerAction, InterfaceItem>()

    var roleMenuTitle = "{role} permissions."
    var roleMenuRows = 6
    var roleMenuBackgroundItem = SerializableItem(
            Material.BLACK_STAINED_GLASS_PANE,
            "&c",
            listOf(),
            1
    )

    var roleMenuSpecialItems = listOf(
            CommandInterfaceItem(
                    listOf("/f perms"),
                    InterfaceItem(
                            false,
                            Coordinate(5, 8),
                            SerializableItem(
                                    Material.OAK_DOOR,
                                    "&cBack",
                                    listOf("&7Click to go back to &cmain menu&7."),
                                    1
                            )
                    )
            )
    )

    data class LazySerializableItem(val hide: Boolean, val item: SerializableItem)

    var roleMenuPlayerActionItems = hashMapOf<PlayerAction, LazySerializableItem>()
    var roleMenuMemberActionItems = hashMapOf<MemberAction, LazySerializableItem>()

    var roleMenuPreviousPageItem = InterfaceItem(
            false,
            Coordinate(5, 1),
            SerializableItem(
                    Material.STONE_BUTTON,
                    "&7Previous Page",
                    listOf("&7View permissions on the previous page."),
                    1
            )
    )

    var roleMenuNextPageItem = InterfaceItem(
            false,
            Coordinate(5, 7),
            SerializableItem(
                    Material.STONE_BUTTON,
                    "&7Next Page",
                    listOf("&7View permissions on the next page."),
                    1
            )
    )

    var roleMenuItemsPerPage = 36
    var roleMenuStartCoordinate = Coordinate(1, 0)


    override fun save(factionsx: FactionsX) {
        //Serializer(false, factionsx.dataFolder, factionsx.logger)
        //        .save(PermsGUIConfig.instance, File("${factionsx.dataFolder}/config/GUI/", "perms-gui-config.json"))
    }

    override fun load(factionsx: FactionsX) {
        //Serializer(false, factionsx.dataFolder, factionsx.logger)
        //        .load(PermsGUIConfig.instance, PermsGUIConfig::class.java, File("${factionsx.dataFolder}/config/GUI/", "perms-gui-config.json"))
        populateOptions(factionsx)
    }

    private fun populateOptions(instance: FactionsX) {
        if (relationMenuItems == null) relationMenuItems = hashMapOf()
        if (roleMenuPlayerActionItems == null) roleMenuPlayerActionItems = hashMapOf()
        if (roleMenuMemberActionItems == null) roleMenuMemberActionItems = hashMapOf()

        val relationItemCoord = Coordinate(0, 0)

        PlayerAction.entries.forEach { playerAction ->
            relationMenuItems[playerAction] ?: run {
                relationMenuItems[playerAction] = InterfaceItem(
                        false,
                        Coordinate(relationItemCoord.row, relationItemCoord.column),
                        SerializableItem(
                                playerAction.icon, "&a${formatName(playerAction.actionName)}", listOf("&7Click to &atoggle&7 status.", "&7Currently: {status}"), 1
                        )
                )
                relationItemCoord.increment()
            }

            roleMenuPlayerActionItems[playerAction] ?: run {
                roleMenuPlayerActionItems[playerAction] = LazySerializableItem(false, SerializableItem(
                        playerAction.icon, "&a${formatName(playerAction.actionName)}", listOf("&7Click to &atoggle&7 status.", "&7Currently: {status}"), 1
                ))

            }
        }

        MemberAction.entries.forEach { memberAction ->
            roleMenuMemberActionItems[memberAction] ?: run {
                roleMenuMemberActionItems[memberAction] = LazySerializableItem(false, SerializableItem(
                        memberAction.icon, "&a${formatName(memberAction.actionName)}", listOf("&7Click to &atoggle&7 status.", "&7Currently: {status}"), 1
                ))

            }

        }

        save(instance)
    }

    private fun formatName(name: String): String = WordUtils.capitalizeFully(name.replace("_", " "))
}