package at.pmzcraft.program.game.world.gameitem.blocks;

public enum BlockType {
    UNKNOWN(0),
    DIRT_BLOCK(1),
    GRASS_BLOCK(2);

    int index;

    BlockType(int index) {
        this.index = index;
    }
}
