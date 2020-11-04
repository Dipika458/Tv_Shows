package com.blucore.searchtvshows.activity.ui.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.blucore.searchtvshows.activity.MainActivity;
import com.blucore.searchtvshows.adapter.ShowsListAdapter;
import com.blucore.searchtvshows.databinding.FragmentMoviesBinding;
import com.blucore.searchtvshows.model.DataModel;
import com.blucore.searchtvshows.web.WebServices;

public class MoviesFragment extends Fragment implements View.OnClickListener {
    private FragmentMoviesBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= FragmentMoviesBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        binding.btnSearchMovies.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        binding.progressBar.setVisibility(View.VISIBLE);
        WebServices.getInstance().searchShows(binding.edSearchMovies.getText().toString(),this);
    }

    public void onApiResponse(DataModel body) {
        binding.progressBar.setVisibility(View.GONE);
        binding.rvMoviesList.setAdapter(new ShowsListAdapter(getActivity(),body.getSearch()));
    }
}
