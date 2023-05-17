package flashcards

fun main() {
    val card = Card()

    card.createCard()
    card.answerForQuest()


}


class Card {
    /*    private val question: String = ""
        private val definition: String = ""*/
    private val cards = mutableMapOf<String, String>()

    fun createCard() {
        println("Input the number of cards:")
        val numberOfCards = readln().trim().toInt()
        var i = 0
        while (i != numberOfCards) {

            println("Card #${i + 1}:")
            var questionInput = readln().trim()
            while (cards.containsKey(questionInput)) {
                println("The term \"$questionInput\" already exists. Try again:")
                questionInput = readln().trim()

            }
            println("The definition for card #${i + 1}:")
            var definitionInput = readln().trim()
            while (cards.containsValue(definitionInput)) {
                println("The definition \"$definitionInput\" already exists. Try again:")
                definitionInput = readln().trim()
            }
            cards[questionInput] = definitionInput
            i++
        }

    }


    fun answerForQuest() {
        for (i in cards) {
            println("Print the definition of \"${i.key}\":")
            val answer = readln()
            if (i.value == answer) {
                println("Correct!")
            } else if (cards.containsValue(answer)) {
                val keysWithMatchingValue = cards.entries.filter { it.value == answer }.map { it.key }
                val keyString = keysWithMatchingValue.joinToString { it }
                println("Wrong. The right answer is \"${i.value}\", but your definition is correct for \"${keyString}\".")
            } else {
                println("Wrong. The right answer is \"${i.value}\".")
            }
        }
    }
}