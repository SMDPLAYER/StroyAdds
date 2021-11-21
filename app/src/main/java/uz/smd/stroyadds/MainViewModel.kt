package uz.smd.stroyadds

import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.smd.stroyadds.images.RefDetail
import uz.smd.stroyadds.images.asPic

/**
 * Created by Siddikov Mukhriddin on 9/1/21
 */
class MainViewModel : ViewModel() {

    var lastFragment = MutableLiveData<Pair<Fragment, Boolean>>()

    val listData= mutableListOf<RefDetail>()

    init {
          listData.add(RefDetail("Tom yopish xizmati ",addRef()))
          listData.add(RefDetail("Travertin",addRef2()))
          listData.add(RefDetail("Noldan uy qurish",addRef3()))
          listData.add(RefDetail("Zina quyish",addRef4()))
        // TODO: 11/21/21  add data for others

    }

    fun addRef():List<asPic>{
        return listOf<asPic>(
            asPic(R.drawable.tomyopish_1),
            asPic(R.drawable.tomyopish_2),
            asPic(R.drawable.tomyopish_3),
            asPic(R.drawable.tomyopish_4),
            asPic(R.drawable.tomyopish_5),
            asPic(R.drawable.tomyopish_6),
            // TODO: 11/21/21  add images for tomyopish
        )
    }

    fun addRef2():List<asPic>{
        return listOf<asPic>(
            asPic(R.drawable.travertin_1),
            asPic(R.drawable.travertin_2),
            asPic(R.drawable.travertin_3),
            asPic(R.drawable.travertin_4),
            asPic(R.drawable.travertin_5),
            asPic(R.drawable.travertin_6),
            asPic(R.drawable.travertin_7),
            asPic(R.drawable.travertin_8),
            asPic(R.drawable.travertin_9),
            asPic(R.drawable.travertin_10),
            // TODO: 11/21/21 add images for travertin
        )
    }
    fun addRef3():List<asPic>{
        return listOf<asPic>(
            asPic(R.drawable.uyqurish_1),
            asPic(R.drawable.uyqurish_2),
            asPic(R.drawable.uyqurish_3),
            asPic(R.drawable.uyqurish_4),
            asPic(R.drawable.uyqurish_5),
            asPic(R.drawable.uyqurish_6),
            asPic(R.drawable.uyqurish_7),
            asPic(R.drawable.uyqurish_8),
            asPic(R.drawable.uyqurish_9),
            asPic(R.drawable.uyqurish_10),
            asPic(R.drawable.uyqurish_11),
            asPic(R.drawable.uyqurish_12),
            asPic(R.drawable.uyqurish_13),
            asPic(R.drawable.uyqurish_14),
            asPic(R.drawable.uyqurish_15),
            asPic(R.drawable.uyqurish_16),
            asPic(R.drawable.uyqurish_17),
            // TODO: 11/21/21 add images for uyqurish
        )
    }
    fun addRef4():List<asPic>{
        return listOf<asPic>(
            asPic(R.drawable.zina_1),
            asPic(R.drawable.zina_2),
            asPic(R.drawable.zina_3),
            asPic(R.drawable.zina_4),
            asPic(R.drawable.zina_5),
            asPic(R.drawable.zina_6),
            asPic(R.drawable.zina_7),
            asPic(R.drawable.zina_8),
            asPic(R.drawable.zina_9),
            asPic(R.drawable.zina_10),
            asPic(R.drawable.zina_11),
            asPic(R.drawable.zina_12),
            asPic(R.drawable.zina_13),
            asPic(R.drawable.zina_14),
            asPic(R.drawable.zina_15),
            asPic(R.drawable.zina_16),
            asPic(R.drawable.zina_17),            
            asPic(R.drawable.zina_18),
            asPic(R.drawable.zina_19),
            asPic(R.drawable.zina_20),
            asPic(R.drawable.zina_21),
            asPic(R.drawable.zina_22),
            asPic(R.drawable.zina_23),
            asPic(R.drawable.zina_24),
            asPic(R.drawable.zina_25),
            asPic(R.drawable.zina_26),
            asPic(R.drawable.zina_27),
            asPic(R.drawable.zina_28),
            asPic(R.drawable.zina_29),
            asPic(R.drawable.zina_30),
            asPic(R.drawable.zina_31),
            asPic(R.drawable.zina_32),
            // TODO: 11/21/21 add images for zina
        )
    }

}