package com.tanveershafeeprottoy.navigationarchcomponent

import android.os.Bundle
import android.transition.ChangeBounds
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
        sharedElementEnterTransition = ChangeBounds().apply {
            duration = 800
        }
        sharedElementReturnTransition = ChangeBounds().apply {
            duration = 800
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_detail, container, false)
        root.findViewById<TextView>(R.id.fragmentMainTxtView).text = param1
        return root
    }


    companion object {
        const val ARG_PARAM1 = "param1"

        @JvmStatic
        fun newInstance(param1: String) =
                DetailFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                    }
                }
    }
}
