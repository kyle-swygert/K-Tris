package tetromino

import java.awt.Color

class ZPiece() : Tetromino() {

    override fun setShapeCells() {

        cells[0][2] = 1
        cells[1][2] = 1
        cells[1][1] = 1
        cells[2][1] = 1

    }

    override fun getColor(): Color {
        return Color.RED
    }

}