package tetromino

import java.awt.Color

abstract class Tetromino {

    // Member variables

    // 2D array to represent shape of piece
    var cells: Array<IntArray> = Array(4) { IntArray(4) }

    protected abstract fun setShellShapes()

    public abstract fun getColor(): Color

    public fun getLayoutArray(): Array<IntArray> {
        return cells
    }

}