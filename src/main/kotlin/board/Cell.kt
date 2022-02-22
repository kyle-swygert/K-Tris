package board

import java.awt.Color

class Cell() {

    constructor(row: Int = 0, column: Int = 0, populated: Boolean = false, cellColor: Color = Color.BLACK, cellTermColor: TermColor = TermColor.BLACK) : this() {

        this.row = row
        this.column = column
        this.populated = populated
        this.cellColor = cellColor
        this.cellTermColor = cellTermColor

    }

    var row: Int = 0
    var column: Int = 0
    var populated: Boolean = false
    var cellColor: java.awt.Color = Color.BLACK
    var cellTermColor: TermColor = TermColor.BLACK

}