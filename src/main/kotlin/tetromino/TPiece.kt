package tetromino

import java.awt.Color

class TPiece(): Tetromino() {

    // TODO: For pieces that can fit in a 3x3 area, create a rotate function that only rotates the top-left 3x3 area of the cells member.
    override fun setShapeCells() {
        cells[0][1] = 1
        cells[1][1] = 1
        cells[2][1] = 1
        cells[1][2] = 1
    }

    override fun getColor(): Color {
        return Color.MAGENTA
    }
}