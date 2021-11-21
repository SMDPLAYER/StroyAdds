package uz.smd.stroyadds.images

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_images.*
import uz.smd.stroyadds.MainViewModel
import uz.smd.stroyadds.R

/**
 * Created by Siddikov Mukhriddin on 9/16/21
 */
@SuppressLint("FragmentLiveDataObserve")
class ImagesFragment:Fragment(R.layout.fragment_images) {
    var sharedRefDetail = MutableLiveData<RefDetail>()
    lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        initImages()
        handleClick()
    }

    private fun handleClick() {
//        btnBack.setOnClickListener { requireActivity().onBackPressed() }

    }



    private fun initImages() {
        imagesHolder.adapter =
            MainAdapter {
                val list=(imagesHolder.adapter as MainAdapter).currentList
                viewModel.lastFragment.value= Pair(PagerImagesFragment().apply { refDetail=it
                    listImages=list},true)
            }
        sharedRefDetail.observe(this, { addPic(it?.asPic) })
    }

    private fun addPic(items: List<asPic?>?) {
        (imagesHolder.adapter as MainAdapter).submitList(items)
    }
}