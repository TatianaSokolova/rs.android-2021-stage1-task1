package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")
        val sadList = sadArray.toMutableList()
        val iterator = sadList.listIterator()

        while (iterator.hasNext()) {

            val elem = iterator.next()
            var i = sadList.indexOf(elem)

            if (i > 0 && i < sadList.size - 1 && (sadList[i-1] + sadList[i+1]) < elem ) {
                iterator.remove()
                iterator.previous()
            }
        }
        return sadList.toIntArray()
    }
}
