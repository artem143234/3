package ru.rsue.chernishov;

import androidx.fragment.app.Fragment;

public class BookListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new BookListFragment();
    }
}