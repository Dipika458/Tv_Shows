package com.blucore.searchtvshows.activity.ui.tvshows;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.blucore.searchtvshows.adapter.ShowsListAdapter;
import com.blucore.searchtvshows.databinding.FragmentTvshowsBinding;
import com.blucore.searchtvshows.model.DataModel;
import com.blucore.searchtvshows.web.WebServices;

public class TvShowsFragment extends Fragment implements View.OnClickListener {
    private FragmentTvshowsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentTvshowsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        binding.btnSearchTvShow.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        binding.progressBar.setVisibility(View.VISIBLE);
        WebServices.getInstance().searchShows(binding.edSearchTvShow.getText().toString(),this);
    }

    public void onApiResponse(DataModel body) {
        binding.progressBar.setVisibility(View.GONE);
        binding.rvShowsList.setAdapter(new ShowsListAdapter(getActivity(),body.getSearch()));
    }
}
