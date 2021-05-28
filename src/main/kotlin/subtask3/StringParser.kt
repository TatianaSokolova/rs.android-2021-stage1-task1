package subtask3

import java.util.*

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val array = inputString.toCharArray()
        var ind = mutableListOf<Int>()
        var result = mutableListOf<String>()
        var i = 0
        var order = 0
        var counterTriangle = 0
        var counterSquare = 0
        var counterRound = 0

        var k = 0
        while (k < array.size) {
            if (array[k] == '<') {
                counterTriangle++
                ind.add(k)
            } else
                if (array[k] == '>') {
                    counterTriangle--

                    val length = k - ind.last() - 1
                        result.add(inputString.substring(ind.last() + 1, length + 1 + ind.last()))


                    if (counterTriangle > 0){
                        k = ind.last() + 1
                        ind.removeAt(ind.size - 1)
                    }
                }
            k++
        }

        var j = 0
        while (j < array.size) {
            if (array[j] == '(') {
                counterRound++
                ind.add(j)
            } else
                if (array[j] == ')') {
                    counterRound--

                    val length = j - ind.last() - 1
                    result.add(inputString.substring(ind.last() + 1, length + 1 + ind.last()))

                    if (counterRound > 0){
                        j = ind.last() + 1
                        ind.removeAt(ind.size - 1)
                    }
                }
            j++
        }

        while (i < array.size) {
            if (array[i] == '[') {
                counterSquare++
                ind.add(i)
            } else
                if (array[i] == ']') {
                    counterSquare--

                    val length = i - ind.last() - 1
                    result.add(inputString.substring(ind.last() + 1, length + 1 + ind.last()))

                    if (counterSquare > 0){
                        i = ind.last() + 1
                        ind.removeAt(ind.size - 1)
                    }
                }
            i++
        }

        return result.toTypedArray()
    }
}
