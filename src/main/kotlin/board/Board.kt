package board

import java.awt.Color

class Board {

    // Board is to be 10 cells wide by 40 cells tall. Only the lower 20 cells are used in gameplay, but the top 20 cells are included as part of the Tetris Guidelines.
    //var cells: Array<Cell> = Array(10) { IntArray(40) }
    val cells: ArrayList<ArrayList<Cell>> = ArrayList<ArrayList<Cell>>(10)

    //var goblin: List<List<Cell>> = ArrayList<List<Cell>>()

    //val numRows = 40
    //val numColumns = 10

    init {

        // initialize the size of the matrix right here. It might be best to change the way that the cells are stored in the class for simpler initialization of the matrix size and access.
        // Remember that we want 10 lists in the x direction (first index), then we want those lists to have 40 items in them in the y direction (second index)
        // I believe this should be adding 10 lists to the outer index, then for each of those lists, add 40 items to each list.



        // add 10 ArrayLists to the Board object
        for (colAdd in 0 until 10) {

            // create a temp ArrayList<Cell> and add 40 items to it

            var tempCol = ArrayList<Cell>()

            for (newCell in 0 until 40) {
                // insert 40 items into the temp ArrayList. Set the row and column data members with the constructor
                tempCol.add(Cell(newCell, colAdd))
            }

            // insert the temp ArrayList<Cell> into cells
            cells.add(tempCol)

        }

    }

    fun printBoard(displayCoords: Boolean = false, gameSizeBoard: Boolean = true) {
        // This function prints the contents of the board onto the terminal to be displayed.
        // gameSizeBoard: True means the board will only be printed 10x20
        // gameSizeBoard: False means the whole board will be printed, 10x40

        val boardHeight = if (gameSizeBoard) {
            19
        } else {
            39
        }

        for (y in boardHeight downTo 0) {
            for (x in 0 until 10) {

                val curCell = cells[x][y]

                // change the color of the text to the proper color based on what is stored in the matrix

                // if the cell is at the beginning of the row, print a border piece for the board.
                if (x == 0)
                    print("|")


                print(curCell.cellTermColor.color)


                if (curCell.populated) {
                    // the cell is populated, print some characters to show that the location is filled.
                    print("[]")
                } else {
                    // the cell is not populated, print some empty space to denote that the location is empty.
                    print("  ")
                }

                if (displayCoords)
                    print("(${curCell.column},${curCell.row})")


                // reset the color of the text back to normal for the next piece
                print(TermColor.RESET.color)

                // if the cell is at the end of a row, print a border piece.
                if (x == 9)
                    print("|")

            }
            println()
        }

        // print a bottom border that makes it easier for the player to see the bottom of the board
        println("----------------------")


    }


}