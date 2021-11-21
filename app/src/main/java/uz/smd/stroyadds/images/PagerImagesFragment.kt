package uz.smd.stroyadds.images

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_pager_images.*
import uz.smd.stroyadds.R

/**
 * Created by Siddikov Mukhriddin on 9/16/21
 */
@SuppressLint("FragmentLiveDataObserve")
class PagerImagesFragment:Fragment(R.layout.fragment_pager_images) {
    var refDetail :asPic? =null
    var listImages= mutableListOf<asPic>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter= FullImagesAdapter()
        pagerImages.adapter= adapter
        adapter.submitList(listImages)
        pagerImages.setCurrentItem(listImages.indexOf(refDetail),false)
        btnX.setOnClickListener { requireActivity().onBackPressed() }
    }




}