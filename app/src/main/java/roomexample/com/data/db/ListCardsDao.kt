package roomexample.com.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ListCardsDao {

    @Query("select * from list_cards" )
    fun getAllListCards(): LiveData<List<ListCardsEntity>>

    @Insert
    fun insert(listCardEntity: ListCardsEntity)

    @Delete
    fun delete(listCardEntity: ListCardsEntity)
}