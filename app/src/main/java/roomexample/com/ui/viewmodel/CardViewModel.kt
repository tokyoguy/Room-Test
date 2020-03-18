package roomexample.com.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import roomexample.com.data.db.ListCardsEntity
import roomexample.com.data.repository.CardRepository

class CardViewModel(application: Application): AndroidViewModel(application) {

    private val cardRepository = CardRepository()

    fun getAllCard() {
        cardRepository.getList()
    }

    fun insertCard(itemCard: ListCardsEntity) {
        cardRepository.insert(itemCard)
    }

    fun deleteCard(itemCard: ListCardsEntity) {
        cardRepository.delete(itemCard)
    }
}