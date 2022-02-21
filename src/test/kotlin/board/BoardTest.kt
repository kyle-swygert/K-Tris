package board

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.awt.Color

internal class BoardTest {

    var testBoard = Board()

    @Test
    fun testBoardDimensions() {
        // ensure that the board is 10 cells wide by 40 cells tall.

        assertEquals( 40,testBoard.cells[0].count()) // width / X value
        assertEquals( 10,testBoard.cells[0][39]) // height / y value

        //assertThrows(IndexOutOfBoundsException, )

    }

    @Test
    fun testProperCellInit() {
        // Test that all the cells on the 2D array have their coordinates set properly during the Board constructor

        for (cellCol in 0 until 10) {

            for (cellRow in 0 until 40) {

                var curCell = testBoard.cells[cellCol][cellRow]

                // assert that the row ands the column match the current iteration values
                assertEquals(cellCol, curCell.column)
                assertEquals(cellRow, curCell.row)

                // assert that the cells are unpopulated
                assertEquals(false, curCell.populated)

                // assert that the cell color is Black
                assertEquals(Color.BLACK, curCell.cellColor)

            }
        }
    }
}