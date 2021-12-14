package tetromino

import java.awt.Color

class IPiece(): Tetromino() {

    override fun setShapeCells() {
        cells[0][2] = 1
        cells[1][2] = 1
        cells[2][2] = 1
        cells[3][2] = 1
    }

    override fun getColor(): Color {
        return Color.CYAN
    }
}