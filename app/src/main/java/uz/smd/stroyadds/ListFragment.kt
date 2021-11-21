package uz.smd.stroyadds

import android.app.ActionBar
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_list.*
import uz.smd.stroyadds.images.ImagesFragment
import uz.smd.stroyadds.utils.dpToPx
import uz.smd.stroyadds.utils.dpToPxInt

/**
 * Created by Siddikov Mukhriddin on 11/21/21
 */

class ListFragment :Fragment(R.layout.fragment_list){
    lateinit var viewModel: MainViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        listHolder.removeAllViews()
        viewModel.listData.forEach {refDetail->
            listHolder.addView(
//                layoutInflater.inflate(R.layout.item_objectcategory,null)
                TextView(requireContext())
                    .apply {
                        setTextColor(ContextCompat.getColor(requireContext(),R.color.black))
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            setTextAppearance(android.R.style.TextAppearance_DeviceDefault_SearchResult_Subtitle)
                        }
                        else{
                            setTextAppearance(requireContext(),android.R.style.TextAppearance_DeviceDefault_SearchResult_Subtitle)
                        }
                        typeface = Typeface.DEFAULT_BOLD
                setPadding(dpToPxInt(20),dpToPxInt(20),dpToPxInt(20),dpToPxInt(20),)
                text=refDetail.title
                setOnClickListener {
                    viewModel.lastFragment.value=
                        Pair(ImagesFragment().apply { sharedRefDetail.value=refDetail },true)
                }
            })
            listHolder.addView(View(requireContext()).apply {
            layoutParams=LinearLayout.LayoutParams(    LinearLayout.LayoutParams.MATCH_PARENT,
                dpToPxInt(1),0f
            )
                setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.black))
            })
        }

    }
}