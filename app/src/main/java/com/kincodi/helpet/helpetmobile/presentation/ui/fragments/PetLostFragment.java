package com.kincodi.helpet.helpetmobile.presentation.ui.fragments;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kincodi.helpet.helpetmobile.R;
import com.kincodi.helpet.helpetmobile.domain.executor.impl.ThreadExecutor;
import com.kincodi.helpet.helpetmobile.domain.model.Post;
import com.kincodi.helpet.helpetmobile.presentation.presenters.GetListPostPresenter;
import com.kincodi.helpet.helpetmobile.presentation.presenters.impl.Post.GetListPostPresenterImpl;
import com.kincodi.helpet.helpetmobile.presentation.ui.adapter.PetFragmentPageAdapter;
import com.kincodi.helpet.helpetmobile.storage.PostRepositoryImpl;
import com.kincodi.helpet.helpetmobile.threading.MainThreadImpl;

import java.util.List;

public class PetLostFragment extends Fragment  {
    ViewPager mViewPager;
    TabLayout tabs;
    private GetListPostPresenterImpl presenter;
    private PostRepositoryImpl postRepository;
    private PetFragmentPageAdapter adapter;

    public PetLostFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        postRepository = new PostRepositoryImpl();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pet_lost, container, false);


        mViewPager = (ViewPager) v.findViewById(R.id.pager);
        tabs =(TabLayout) v.findViewById(R.id.tabs);
        setupViewPager(mViewPager);
        tabs.setupWithViewPager(mViewPager);

        return v;
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new PetFragmentPageAdapter(getChildFragmentManager());
        adapter.addFragment(new ListPetsLostFragment(), getString(R.string.title_section1));
        adapter.addFragment(new MapPetsLostFragment(), getString(R.string.title_section2));
        viewPager.setAdapter(adapter);
    }

}
