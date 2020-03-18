package roomexample.com.data.repository

import androidx.lifecycle.LiveData
import roomexample.com.data.db.ListCardsDao
import roomexample.com.data.db.ListCardsEntity

class CardRepository {

    var listCardsDao: ListCardsDao ?= null

    fun getList(): LiveData<out List<ListCardsEntity>> {
        return listCardsDao!!.getAllListCards()
    }

    fun insert(itemCard: ListCardsEntity) {
        listCardsDao!!.insert(itemCard)
    }

    fun delete(itemCard: ListCardsEntity) {
        listCardsDao!!.delete(itemCard)
    }
}