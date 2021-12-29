package board

class Board {

    // Board is to be 10 cells wide by 40 cells tall. Only the lower 20 cells are used in gameplay, but the top 20 cells are included as part of the Tetris Guidelines.
    //var cells: Array<Cell> = Array(10) { IntArray(40) }
    val cells: ArrayList<ArrayList<Cell>> = ArrayList<ArrayList<Cell>>(10)

    var goblin: List<List<Cell>> = ArrayList<List<Cell>>()

    val numRows = 40
    val numColumns = 10

    init {

        // initialize the size of the matrix right here. It might be best to change the way that the cells are stored in the class for simpler initialization of the matrix size and access.
        // Remember that we want 10 lists in the x direction (first index), then we want those lists to have 40 items in them in the y direction (second index)
        // I believe this should be adding 10 lists to the outer index, then for each of those lists, add 40 items to each list.

        var tempList = ArrayList<Cell>(40)
        // include a copy of the tempRow to the cells 40 different times


        var help = ArrayList<Cell>()
        help.add(Cell())




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

    fun printBoard() {

        for (y in 39 downTo 0) {
            for (x in 0 until 10) {

                print("(${cells[x][y].column},${cells[x][y].row})")

            }
            println()
        }


    }


}