package board

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.awt.Color

internal class CellTest {

    var defaultCell = Cell()

    var boardSpaceCell = Cell(15, 5, true, Color.CYAN)

    @Test
    fun getRow() {
        assertEquals(0, defaultCell.row)
        assertEquals(15, boardSpaceCell.row)
    }

    @Test
    fun getColumn() {
        assertEquals(0, defaultCell.column)
        assertEquals(5, boardSpaceCell.column)
    }

    @Test
    fun getPopulated() {
        assertEquals(false, defaultCell.populated)
        assertEquals(true, boardSpaceCell.populated)
    }

    @Test
    fun getCellColor() {
        assertEquals(Color.BLACK, defaultCell.cellColor)
        assertEquals(Color.CYAN, boardSpaceCell.cellColor)
    }
}