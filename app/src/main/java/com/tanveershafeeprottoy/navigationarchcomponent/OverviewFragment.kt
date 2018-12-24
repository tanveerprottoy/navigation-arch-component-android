package com.tanveershafeeprottoy.navigationarchcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator

class OverviewFragment : Fragment() {
    private lateinit var imageView: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_overview, container, false)
        imageView = root.findViewById(R.id.fragmentMainImgView)
        imageView.setOnClickListener(imgOcl)
        return root
    }

    private fun gotoDetail() {
        Navigation.findNavController(activity as AppCompatActivity, R.id.activityMainFragment)
                .navigate(R.id.action_overviewFragment_to_detailFragment, Bundle().apply {
                    putString(DetailFragment.ARG_PARAM1, "From main")
                }, null, FragmentNavigator.Extras.Builder()
                        .addSharedElement(imageView, getString(R.string.img_transition_name))
                        .build())

    }

    private val imgOcl = View.OnClickListener {
        gotoDetail()
    }
}
