package ru.spb.yakovlev.androidacademy.devconfapp.features.speaker_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import ru.spb.yakovlev.androidacademy.devconfapp.databinding.FragmentSpeakerDetailBinding


class SpeakerDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = SpeakerDetailsFragment()
    }

    private lateinit var viewModelDetails: SpeakerDetailsFragmentViewModel
    private lateinit var binding: FragmentSpeakerDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSpeakerDetailBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModelDetails = ViewModelProviders.of(this).get(SpeakerDetailsFragmentViewModel::class.java)
        binding.model = viewModelDetails
    }


}
