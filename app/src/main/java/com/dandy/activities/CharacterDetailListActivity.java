package com.dandy.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.dandy.R;
import com.dandy.activities.fragments.CharacterDetailDetailFragment;

/**
 * An activity representing a list of CharacterDetails. This activity has different presentations for handset and
 * tablet-size devices. On handsets, the activity presents a list of items, which when touched, lead to a
 * {@link CharacterDetailDetailActivity} representing item details. On tablets, the activity presents the list of items
 * and item details side-by-side using two vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a {@link CharacterDetailListFragment} and the item
 * details (if present) is a {@link CharacterDetailDetailFragment}.
 * <p>
 * This activity also implements the required {@link CharacterDetailListFragment.Callbacks} interface to listen for item
 * selections.
 */
public class CharacterDetailListActivity extends Activity implements CharacterDetailListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characterdetail_list);
        // Show the Up button in the action bar.
        getActionBar().setDisplayHomeAsUpEnabled(true);

        if (findViewById(R.id.characterdetail_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((CharacterDetailListFragment) getFragmentManager().findFragmentById(R.id.characterdetail_list)).setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            //navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Callback method from {@link CharacterDetailListFragment.Callbacks} indicating that the item with the given ID was
     * selected.
     */
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(CharacterDetailDetailFragment.ARG_ITEM_ID, id);
            CharacterDetailDetailFragment fragment = new CharacterDetailDetailFragment();
            fragment.setArguments(arguments);
            getFragmentManager().beginTransaction().replace(R.id.characterdetail_detail_container, fragment).commit();

        }
        else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, CharacterDetailDetailActivity.class);
            detailIntent.putExtra(CharacterDetailDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
