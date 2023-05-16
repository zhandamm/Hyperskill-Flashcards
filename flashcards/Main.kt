package flashcards

fun main() {
    val card = Card()

    card.createCard()
    card.answerForQuest()

}


class Card(private val question: String = "", private val definition: String = "") {
    private val cards = mutableMapOf<Int, Card>()

    fun createCard() {
        println("Input the number of cards:")
        val numberOfCards = readln().trim().toInt()
        for (i in 1..numberOfCards) {
            println("Card #${i}:")
            val questionInput = readln()
            println("The definition for card #${i}:")
            val definition = readln().trim()
            val card = Card(questionInput, definition)
            cards[i] = card
        }
    }

    fun answerForQuest() {
        for (i in cards) {
            println("Print the definition of \"${i.value.question}\":")
            val answer = readln()
            if (i.value.definition == answer) {
                println("Correct!")
            } else {
                println("Wrong. The right answer is \"${i.value.definition}\".")
            }
        }
    }
}